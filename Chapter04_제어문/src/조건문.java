import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력 : ");
		int no = scan.nextInt();
		
		if(no>=1 && no<=12) {
			if(no>=3 && no<=5) System.out.println("봄");
			else if(no>=6 && no<=8) System.out.println("여름");
			else if(no>=9 && no<=11) System.out.println("가을");
			else System.out.println("겨울");
		} else System.out.println("잘못입력");
	}

}
