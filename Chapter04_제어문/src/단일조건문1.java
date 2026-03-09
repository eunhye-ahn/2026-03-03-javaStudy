import java.util.Scanner;

public class 단일조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String ch = scan.next();
		
		char c = ch.charAt(0);
		System.out.println(c);
		
		System.out.println((int)c);
		if((int)c < 97) System.out.println("대문자");
		if((int)c >= 97) System.out.println("소문자");
	}

}
