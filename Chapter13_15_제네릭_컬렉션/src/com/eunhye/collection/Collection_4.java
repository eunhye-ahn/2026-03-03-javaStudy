package com.eunhye.collection;
class Box<T>{
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
}
public class Collection_4 {
	public static void main(String[] args) {
		Box<String> box = new Box();
		String s = box.getT();
		Box box1 = new Box();
		Object s1 = box1.getT();
		
		
	}
}
