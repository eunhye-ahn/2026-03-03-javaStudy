import java.util.Scanner;

public class 단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ID : ");
//		String id = scan.next();
//		
//		if(id.equals("an123")) {
//			System.out.println("로그인되었습니다.");
//		}
		
		//id == an123 : String은 주소값이 저장되어서 비교불가 err  
		//String은 무조건 id.equals 로 값으로 비교하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("잘못된 입력");
			return;
		}else {
			if(num < 0)  System.out.println(num*-1);
			System.out.println(num);
		}
		
	}

}
