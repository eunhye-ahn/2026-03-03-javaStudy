package com.eunhye.collection;
/**
 * 
 */
import java.util.*;
public class Collection_total_2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("A","B","C"));
		//앞뒤로 출력가능
		ListIterator<String> it = list.listIterator();
		//순서대로출력
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		//asc, desc
	}
}
