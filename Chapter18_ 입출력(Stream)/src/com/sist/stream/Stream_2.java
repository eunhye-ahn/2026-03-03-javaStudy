package com.sist.stream;
import java.io.*;

//파일 쓰기
//FileOutputStream
//close(), write()
public class Stream_2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//저장폴더
			File dir = new File("c:\\java_data");
			if(!dir.exists()) {
				dir.mkdir();
			}
			//폴더에파일생성
			File file = new File("c:\\java_data\\sawon.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			//catch로 빠지지않도록 if 분기처리
			//파일 읽을 수있도록 연결 통로 만들기 - fileinputStream
			fis=new FileInputStream(file); 
			//fileoutputstream - 파일 쓰기할 수 있도록 연결 통로 만들기
			//true를 주면 append모드 (이어서쓰기)
			//기본값-false -> 파일 덮어쓰기
			fos = new FileOutputStream(file, true);
			//한글을 못쓰고 바이트단위로 저장해야함 -	fos.write();
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');	//한글자씩 보내야함 > char은 아스키코드로 자동변환돼서 int로 전송됨
			String info="홍길동|남자|개발부\n";
			fos.write(info.getBytes()); //string -> byte[] => 한번에 전송가능
			String infoAdd="홍길동|남자|개발부\n";
			fos.write(infoAdd.getBytes());
			System.out.println("파일 저장 완료");
			
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i); //read는 바이트단위로 읽기때문에 한글이 깨짐
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
