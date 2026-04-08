package com.sist.stream;

import java.io.*;

//FileInputStream : 파일을 바이트 단위로 읽어오는 클래스

public class Stream_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//파일연결(파일 직접 주입, 파일 경로지정)
//			File file = new File();
//			fis = new FileInputStream(file);
			fis = new FileInputStream("C:\\Users\\EH\\git\\2026-03-03-javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
//			//파일 읽기 시작
//			int i =0; 
//			//한글자씩 읽는데 바이트를 읽으므로 char이 아닌 int로 받음
//			while((i=fis.read())!=-1) {
//				System.out.println((char)i);
//				//한글이 깨짐 -> 한글을 읽는 용도가 아니다
				//한글 안깨지게하는법 : FileReader 사용 <- 바이트단위가 아닌 문자단위로 읽음
				//or InputStreamReader로 인코딩 지정
//			}
			while(true){
				String s = br.readLine();
				if(s==null) {
					break;
				}
				System.out.println(s);
			}
		}catch(Exception e) {
			e.printStackTrace(); //실행과정=>해당위치에서 멈추기
			System.out.println(e.getMessage()); //파일을 찾을 수 없다
		}finally {
			try{
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
