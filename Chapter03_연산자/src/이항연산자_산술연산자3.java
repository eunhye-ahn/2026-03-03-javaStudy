import java.util.Scanner;

public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner	scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		String res = (a%2==0)? "짝수" : "홀수";
		System.out.println(res);
		*/
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		String result = ((year%4==0)&(year%100!=0))||(year%4==0)? "윤년":"윤년X";
		System.out.println(result); 
		//윤년이 뭐냐
		
			
	}

}
