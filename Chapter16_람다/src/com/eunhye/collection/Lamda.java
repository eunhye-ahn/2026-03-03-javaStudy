package com.eunhye.collection;
import java.util.*;
public class Lamda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(
				List.of(1,2,3,4,5,6));
		
		list.stream()
		.filter(x-> x%2 == 0)
		.forEach(System.out::println);
		//필터는 조건에 맞는 요소만 걸러냄
		list.stream()
		.map(x->x%2==0)
		.forEach(System.out::println);
		//map은 요소를 다른 값으로바꿀때 개수는 그대로
	}
}
