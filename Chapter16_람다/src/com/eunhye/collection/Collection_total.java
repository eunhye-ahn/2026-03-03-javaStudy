package com.eunhye.collection;
/**
 * List -> Map (조회=최적화)
 * List -> Set (중복제거)
 * Map + Set (중복없는 그룹핑)
 * Map => 캐시구조 => 로그파일 //??
 * 
 */
import java.util.*;
public class Collection_total {
	public static void main(String[] args) {
//		List<String> list = List.of("a","b","c");
//		/*
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String li = it.next();
//			System.out.println(li);
//		}
//		*/
//		for(String li : list) {
//			list.remove(li);
//		}
//		for(String li : list) {
//			System.out.println(li);
//		}
//		
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//set에는 순서가업으므로 iterator에서 차례대로 강제처리
		
	}
}
