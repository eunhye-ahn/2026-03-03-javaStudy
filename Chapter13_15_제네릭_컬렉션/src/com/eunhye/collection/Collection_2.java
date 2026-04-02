package com.eunhye.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Sawon{
	private int sabun;
	private String name;
	private String gender;
	private long pay;
}
public class Collection_2 {
	public static void main(String[] args) {
		//5명의 사원객체 저장
		ArrayList<Sawon> sawonList = new ArrayList<>();
		sawonList.add(new Sawon(1,"사원1","여자",305));
		sawonList.add(new Sawon(2,"사원2","남자",304));
		sawonList.add(new Sawon(3,"사원3","여자",303));
		sawonList.add(new Sawon(4,"사원4","남자",302));
		sawonList.add(new Sawon(5,"사원5","여자",301));
		for(Sawon sawon : sawonList) {
			System.out.println(sawon.getSabun());
			System.out.println(sawon.getName());
			System.out.println(sawon.getGender());
			System.out.println(sawon.getPay());
		}
		System.out.println("===============이름 검색");
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		for(Sawon sawon : sawonList) {
			if(sawon.getName().contains(name)) {
				System.out.println(sawon.getSabun());
				System.out.println(sawon.getName());
				System.out.println(sawon.getGender());
				System.out.println(sawon.getPay());
			}
		}
		//데이터를 마음대로 제어할수있는게 제네릭
		
	}
}
