package com.sist.stream;

import java.io.FileReader;

/**
 * 문자스트림 => 2바이트씩 파일 읽기 - 한글안깨짐
 * 					자바 : 한글 1글자 : 2byte
 * 					오라클 : 한글 1글자 : 3byte
 * --------------------------- name varchar(6)
 * reader 와 writer
 * fileReader | fileWriter 2바이트 -txt,csv
 * fileInputReader | fileOutputWriter 1바이트 -image 등 모든파일
 * bufferdReader | bufferedWriter
 * => 파일 자체 제어 => 글쓰기 / 읽기 / (삭제 / 수정) => 어려움 => 그러므로 DB사용
 *					============ ObjectInputStream ??
 * 
 */
public class Reader_1 {
	public static void main(String[] args) {
		FileReader in = null;		
		try {
			in = new FileReader("c:\\java_data\\sawon.txt"); //파일 연결
			int i = 0;
			while((i=in.read())!=-1) {
				System.out.print((char)i);	//파일 한글자씩 읽기 => 2바이트씩 (한글안깨짐)
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
