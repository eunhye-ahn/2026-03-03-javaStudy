package com.eunhye.apply;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Sawon {
//	public Sawon(int sabun, String name) {
//		this.sabun = sabun;
//		this.name = name;
//	}
	private int sabun;
	private String name;
}
public class UserMain {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Sawon(1,"aa"));
		list.add(new Sawon(2,"bb"));
		list.add(new Sawon(3,"cc"));
		list.add(new Sawon(4,"dd"));
		for(Object obj : list) {
			Sawon s = (Sawon)obj;
			System.out.println(s.getSabun()+". "+s.getName());
		}
	}
}
