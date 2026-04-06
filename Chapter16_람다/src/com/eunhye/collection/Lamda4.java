package com.eunhye.collection;

import java.io.FileReader;
import java.util.*;

import lombok.Data;

@Data
class Food{
	private int no;
	private String name;
	private String type;
}

class FoodManager{
	public static List<Food> foodList = new ArrayList<>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\food.txt");
			StringBuffer sb = new StringBuffer();
			int i =0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close(); //=> try~witch~resource 를 쓰면 자동닫기 처리
			String[] datas = sb.toString().split("\n");
			for(String food : datas) {
				Food fd = new Food();
				StringTokenizer st = new StringTokenizer(food,"|");
				fd.setNo(Integer.parseInt(st.nextToken()));
				fd.setName(st.nextToken());
				fd.setType(st.nextToken());
				foodList.add(fd);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Lamda4 {
	public static void main(String[] args) {
		FoodManager fm = new FoodManager();
		fm.foodList.forEach(food -> System.out.println(food.getName()));
	}
}
