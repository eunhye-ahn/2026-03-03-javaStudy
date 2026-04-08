package com.sist.io;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Object_2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("c:\\java_data\\test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		System.out.println(s.getName());
	}
}
