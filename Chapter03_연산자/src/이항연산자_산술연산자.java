import java.util.Scanner;

//import 생략 가능 => java.lang.* : String Math ...
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		Scanner scan = new Scanner(System.in);
		//엔터시에 메모리에 저장
		//System.in ==> 키보드로 입력받음
		System.out.println("국어입력:");
		int kor = scan.nextInt();
		
		System.out.println("수학입력");
		int math = scan.nextInt();
		
		int total = kor + math;
		
		int count = 0;
		
		double avg = total/(double)count;	// infinity 무한대 
		//5%0 ==> NaN => 값이 없는경우 
		
		System.out.printf("%.2f", avg);
		
	}

}
