import java.util.Scanner;

public class 선택문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("연산자 +-*/ : ");
		String s = scan.next();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		switch(s)
		{
		case "+" : 
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
		case "-" : 
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
		case "*" : 
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
		case "/" : 
			System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
		}
	}

}
