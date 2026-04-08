package com.sist.io;

import java.io.*;

//bufferedreader : 외부에서 데이터 읽기 
//키보드입력가능 버퍼는 바이트단위로 읽기 
//파일리더는 한글자씩 읽기
//버퍼리더 => 보조스트림 이므로 단독으로 파일 못열음 inputstreamreader, bufferedReader
//기반스트림 => 파일 직접 연결 filereader, fileinputreader
public class Buffered_2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		long start = System.currentTimeMillis();
		try {
			br = new BufferedReader(new FileReader("c:\\javaDev\\고객.txt"));
			String data;
			StringBuilder sb = new StringBuilder();
			while((data=br.readLine())!=null) {
				sb.append(data);
				sb.append("\n");
			}
			long end = System.currentTimeMillis();
			System.out.println(sb.toString());
			System.out.println("걸린시간:"+(end-start));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
