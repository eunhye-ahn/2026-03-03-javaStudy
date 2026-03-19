class Method{
	String name;
	int number;
	static int b =20;
	static void display() {
		System.out.println("commons method");
	}
	void display(int a) {
		
	}
	
	//오버로딩은 매개변수가 달라야함 -> 비슷한 메서드들의 이름을 하나로 쓰기 위해서
}

public class 메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("b="+Method.b);
		Method.display();
		//static변수라서 메모리할당없이 사용가능
		Method m = new Method();
		System.out.println(m.name);
	}

}
