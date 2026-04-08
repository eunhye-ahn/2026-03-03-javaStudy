package com.sist.io;

import java.io.*;

public class Buffered_3 {
	public static void main(String[] args) {
		FileReader fr = null;
		long start = System.currentTimeMillis();
		try {
			fr = new FileReader("c:\\javaDev\\고객.txt");
			int i =0;
			StringBuilder sb = new StringBuilder();
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			System.out.println(sb.toString());
			long end = System.currentTimeMillis();
			System.out.println("걸린시간: "+(end-start));
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
