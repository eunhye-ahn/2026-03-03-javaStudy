package com.eunhye.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * List의 구현체 - [ArrayList]
 * add(데이터)
 * remove(인덱스)
 * set(인덱스,데이터)
 * get(인덱스)
 * size()
 * clear()
 * isEmpty()
 */
public class Collection_1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(8);
//		list.add("은혜");
//		list.add("은혜1");
//		list.add("은혜");
//		list.add("은혜");
//		list.add("은혜1");
//		list.add("은혜");
//		System.out.println(list.get(2));
//		System.out.println(list.size());
//		for(String name : list) {
//			System.out.println(name);
//		}
//
//		list.set(1,"수정");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(i+"."+list.get(i));
//		}
//		ArrayList list2 = new ArrayList(list.subList(2, 4));
		ArrayList list3 = new ArrayList();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println(list3.subList(1,3));
		System.out.println(list.retainAll(list3));
		ArrayList list4 = new ArrayList();
//		for(Object num : list) {
//			System.out.println(num);
//		}
//		Collections.sort(list2);
//		for(Object num : list2) {
//			System.out.println(num);
//		}
		
		list.retainAll(list3);
	}
}
