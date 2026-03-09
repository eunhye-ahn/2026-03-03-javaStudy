import java.util.Scanner;

public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		/*char op = ' ';
		switch(score/10) 
		{
		case 10 :
			op = 'A';
			break;
		case 9 :
			op = 'B';
			break;
		case 8 :
			op = 'C';
			break;
		default :
			op = 'F';
			break;
		}
		
		System.out.println(op);*/
		
		//람다 
		//break 필요없음
		String grade = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		
		System.out.println(grade); 
		
	}

}
