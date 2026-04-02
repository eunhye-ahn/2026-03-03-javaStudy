package com.eunhye.apply;

import java.io.*;
import java.util.*;
//FoodService
public class FoodSystem {
	private static ArrayList<Food> fList = new ArrayList<Food>();
	
	static {
		try {
			FileReader fr = new FileReader("‪C:\\javaDev\\food.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())==-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] datas =sb.toString().split("\n");
			for(String food:datas) {
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster("http://menupan.com"+st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
		}catch(Exception e) {
			
		}
	}
	//기ㄴ으
	//목록-페이징 subList
	public ArrayList<Food> food_list(int page){
		ArrayList<Food> list = new ArrayList<Food>();
		final int ROWSIZE=12;
		int start = (page*ROWSIZE)-ROWSIZE;
		return list;	
	}
	//상세보기
	//검색
	
}
