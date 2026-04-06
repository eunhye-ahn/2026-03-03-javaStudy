package com.eunhye.collection;

//<- 하나의 메서드만 선언 가능(람다용으로사용)
@FunctionalInterface
interface Calc {
	int calc(int a, int b, int c);
//	int aaa();
}


public class Lamda_2 {
	public static void main(String[] args) {
		Calc add = (a,b,c)->a+b+c;
		Calc minus = (a,b,c)->a-b-c;
		Calc gop = (a,b,c)->a*b*c;
		
		System.out.println(add.calc(1,2,3));
		System.out.println(minus.calc(1, 2, 3));
		
	}
}
