package com.sist.io;

import java.io.*;

public class Buffered_1 {
	public static void main(String[] args) {
		try 
		{
			//파일연결하고 - 버퍼에 담는다
			FileInputStream fis = new FileInputStream("c:\\javaDev\\고객.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			//파일 bos에 다 담고 바이트단위로 보낸다
			FileOutputStream fos = new FileOutputStream("c:\\java_data\\고객이동.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i=0; //읽은 바이트 
			byte[] buffer = new byte[1024]; //파일복사
			while((i=bis.read(buffer,0,1024))!=-1){
				bos.write(buffer,0,i);
			}
	        bis.close();
	        bos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
