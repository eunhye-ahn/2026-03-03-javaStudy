package com.sist.io;
import java.io.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student implements Serializable{
	private int hakbun;
	private String name;
	private int kor,eng,math;
}
public class Object_1 {
	public static void main(String[] args) {
		//객체생성
		Student std = new Student();
		std.setHakbun(1);
		std.setName("안은혜");
		std.setKor(100);
		std.setEng(100);
		std.setMath(50);
		
		//저장
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:\\java_data\\test.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(std);
		}catch(Exception e) {
			
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
