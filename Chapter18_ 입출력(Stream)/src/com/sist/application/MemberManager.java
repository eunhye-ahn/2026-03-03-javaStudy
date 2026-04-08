package com.sist.application;
import java.util.*;
import java.io.*;
// => CRUD => 추가, 수정, 삭제, 읽기
public class MemberManager {
	private final String FILE_NAME = "c:\\java_data\\gamja.txt";
	//추가
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력:");
		String name = scan.next();
		System.out.print("성별입력:");
		String gender = scan.next();
		System.out.print("주소입력:");
		String address = scan.next();
		String data = name+"|"+gender+"|"+address+"\n";
//		try {
//			fw = new FileWriter(FILE_NAME);
//			int i =0;
//			while((i=fw.read())!=-1) {
//				
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fw.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
		try(FileWriter fw = new FileWriter(FILE_NAME, true)){
			fw.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("회원가입완료");
	}
	//읽기
	public List<MemberVO> read() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try(FileReader fr = new FileReader(FILE_NAME)){
			String data ="";
			int i =0;
			while((i=fr.read())!=-1) {
				data += (char)i;
			}//파일 전체읽기
			String[] datas = data.split("\n");//사람마다 배열 나누기
			for(String m:datas) {
				StringTokenizer st = new StringTokenizer(m,"|"); //문자열 구분자로 자르기
				MemberVO vo = new MemberVO();
				vo.setName(st.nextToken());	//구분자로 자른거 순서대로 저장
				vo.setGender(st.nextToken());
				vo.setAddress(st.nextToken());
				list.add(vo); 
			}//모든 멤버 리스트에 저장
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	//삭제
	public void delete(int no) {
		FileWriter fw = null;
		try{ //없는상태에서 덮어쓰기
			List<MemberVO> list = read();
			list.remove(no-1);
			String data = "";
			for(MemberVO vo : list) {
				data += vo.getName()+"|"+vo.getGender()+"|"+vo.getAddress()+"\n";
				
			}//no를 삭제한 후 => 덮어쓰기
			fw = new FileWriter(FILE_NAME);
			fw.write(data);
			System.out.println("회원탈퇴완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//수정
	public void update(MemberVO mvo, int no) {
		FileWriter fw = null;
		try{ //덮어쓰기
			List<MemberVO> list = read();
			list.set(no-1, mvo);
			String data = "";
			for(MemberVO vo : list) {
				data += vo.getName()+"|"+vo.getGender()+"|"+vo.getAddress()+"\n";
			}//no를 삭제한 후 => 덮어쓰기
			fw = new FileWriter(FILE_NAME);
			fw.write(data);
			System.out.println("회원수정완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
