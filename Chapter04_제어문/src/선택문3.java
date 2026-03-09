import java.util.Scanner;

public class 선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random()*3);
		System.out.println("가위바위보 : ");
		int user = scan.nextInt();
		
		if(user >= 0 && user <= 2) {
			System.out.print("컴퓨터 : ");
			switch(com) 
			{
			case 0 : 
				System.out.println("가위");
				break;
			case 1 : 
				System.out.println("바위");
				break;
			case 2 : 
				System.out.println("보");
			}

			System.out.print("사용자 : ");
			switch(user) 
			{
			case 0 : 
				System.out.println("가위");
				break;
			case 1 : 
				System.out.println("바위");
				break;
			case 2 : 
				System.out.println("보");
			}
			System.out.println("\n=====");
			switch(user-com) 
			{
			case 1,-2 :
				System.out.println("이김");
				break;
			case -1,2 :
				System.out.println("짐");
				break;
			case 0 :
				System.out.println("비김");
				break;
			}
			
		}
		else {
			System.out.println("잘못입력");
		}

	}

}
