package com.eunhye.collection;

import java.io.FileReader;
import java.util.*;

import lombok.Getter;
import lombok.Setter;

//{
//	clist.stream()
//	.filter(c->c.getRegion().equals("서울"))
//	.forEach(c->System.out.println(c.getName()))
//}

@Getter
@Setter
class Customer{
	private int no;
	private String name;
	private String address;
}
class CustomerManager{
	public static List<Customer> cList = new ArrayList<>();
	static {
		FileReader fr= new FileReader("");
		String data = "";
		int i=0;
		while((i=fr.read())!=-1){
			
		}
	}
}
public class Lamda3 {

}
