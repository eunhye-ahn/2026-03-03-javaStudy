package com.sist.io;
import java.io.*;

public class Buffer_4 {
	public static void main(String[] args) {
		FileInputStream fis = null; //파일읽기
		FileOutputStream fos = null; //파일생성
		try {
			BufferedInputStream bis = 
					new BufferedInputStream(new FileInputStream("c:\\javaDev\\고객.txt"));
			fos = new FileOutputStream("c:\\java_data\\고객복사.txt");
			byte[] buffer = new byte[1024];
			//파일 읽고 data에 저장
			int i =0;
			while((i=bis.read(buffer,0,1024))!=-1) {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
