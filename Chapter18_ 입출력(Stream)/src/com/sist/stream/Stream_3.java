package com.sist.stream;
//Input/Output => 파일 이동/다운로드/업로드
//한글 => 파일제어 (읽기/쓰기) => read/write

//FileOutputStream - 한 바이트씩 읽는  
//BufferOutputStream - 모든 바이트를 임시 메모리(버퍼)에 모았다가 한번에 전송
//byte[] 에 모았다가 전송하는데 그 크기는 1024
//복사할 파일이 1024크기로 나눠서 그 개수만큼 = i
//wirte(i) => i개를 씀
//
import java.io.*;
public class Stream_3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//jar은 바이너리 파일 => 인코딩로직 불필요
			//텍스트파일 => 인코딩로직 필요
			fis = new FileInputStream("c:\\javaDev\\lombok-1.18.44.jar");//파일 연결
			fos = new FileOutputStream("c:\\\\java_data\\lombok.jar"); //Output 될 파일
			int i = 0; //읽은 바이트 수
			byte[] buffer = new byte[1024]; //파일 복사
			while((i=fis.read(buffer,0,1024))!=-1){ //연결된 파일 읽어서 쓰기 - Output 파일로 (파일복사)
				//자동 포인터 이동 read(buffer,0,1024) 1023까지 읽으면 1024~2047 읽음 
				//파일 마지막은 -1 반환
				fos.write(buffer,0,i); // 0~i번 씀			
			}
			//read() - 한글자
			//read(byte[]) - 바이트단위로 읽기 => 속도더빠름 - 실제다운로드 바이트단위로 읽어서 동작
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
