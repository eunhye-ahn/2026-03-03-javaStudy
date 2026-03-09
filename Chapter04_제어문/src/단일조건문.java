import java.util.Scanner;

public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = (int)(Math.random()*3); //012
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) : ");
		int m = scan.nextInt();
		
		System.out.println("컴퓨터:");
		if(c==0) {
			System.out.println("가위");
		}
		if(c==1) {
			System.out.println("바위");
		}
		if(c==2) {
			System.out.println("보");
		}
		
		System.out.println("나:");
		if(m==0) {
			System.out.println("가위");
		}
		if(m==1) {
			System.out.println("바위");
		}
		if(m==2) {
			System.out.println("보");
		}
		
		System.out.println("====결과");
		
		if(c==m) {
			System.out.println("비김");
		}
		if(c==0 && m==1) {
			System.out.println("이김");
		}
		if(c==0 && m==2) {
			System.out.println("짐");
		}

		if(c==1 && m==0) {
			System.out.println("이김");
		}
		if(c==1 && m==2) {
			System.out.println("짐");
		}
		if(c==2 && m==1) {
			System.out.println("이김");
		}
		if(c==2 && m==2) {
			System.out.println("짐");
		}
		
		

	}

}
