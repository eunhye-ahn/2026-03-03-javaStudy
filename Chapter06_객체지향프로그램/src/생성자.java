class Member{
	int mno;
	String name;
	String address;
	//멤버변수(필드) : 클래스내에서 다 사용 가능한 변수
	//사용이 안되는 곳 static{} / static 메서드 안에서는 멤버변수 사용불가
	//static변수 : 모든곳에서 사용 가능
	Member(){
		name = "홍길동";
	}
	Member(String name){
		this();	//생성자 안에서만 사용 가능
				//반드시 첫번째줄에서 사용
		this.name = name;
	}
	Member(String n, String address){
		this(n);
		this.name = n;
		this.address = address;
	}
}


public class 생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		Member member2 = new Member("ANEUNHYE");
		System.out.println(new Member("EUNHYE","CHEON").name);
		System.out.println(member2.name);
		
	}

}
