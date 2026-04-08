package com.sist.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//FileWriter => 2byte씩 읽음 
public class Writer_1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//파일이 없어도 자동생성해줌
			fw = new FileWriter("c:\\java_data\\member.txt",true); //append모드 이어쓰기
			Scanner scan = new Scanner(System.in);
			System.out.println("이름 : ");
			String name  = scan.next();
			System.out.println("성별 : ");
			String gender  = scan.next();
			String data = name+","+gender+"\n"; //파일은 구분자가 없으므로 직접 지정
			fw.write(data);
			fw.flush(); //강제저장 <- db는 트랜잭션 처리되어서 강제저장을 하려면 flush를 해야하지만
						//writer가 버퍼에 메모리를 저장시켰다가 
			System.out.println("회원가입완료");
			FileReader fr = null;
			try {
				 fr = new FileReader("c:\\java_data\\member.txt");
					int i =0;
					while((i=fr.read())!=-1) {
						System.out.print((char)i);
					}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				fr.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

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
