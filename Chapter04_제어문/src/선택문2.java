import java.util.Scanner;

public class 선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println("메뉴선택:");
			int a = scan.nextInt();
			
			switch(a)
			{
			case 3 :
				System.out.println("크롤링?");
				System.exit(0);
			}
			
		}

	}

}
