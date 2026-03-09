
//국어 영어 수학 => 총점, 평균, 학점- 조건문

import java.util.Scanner;

public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



//		Scanner scan = new Scanner(System.in);
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(math);
//		
//		int total = kor + eng + math;
//		
//		System.out.println(total);
//		
//		double avg = total/3.0;
//		
//		System.out.println(avg);
//		
//		char score = 'A';
//		
//		if(avg >= 90) {
//			score = 'A';
//		} else if (avg >= 80) {
//			score = 'B';
//		} else if (avg >= 70) {
//			score = 'C';
//		} else if (avg >= 60) {
//			score = 'D';
//		} else {
//			score = 'E';
//		}
//		
//		System.out.println(score);
		
		
		
		int kor = (int)(Math.random()*50)+51;
		System.out.println(kor);
		int eng = (int)(Math.random()*50)+51;
		System.out.println(eng);
		int math = (int)(Math.random()*50)+51;
		System.out.println(math);
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.println(total);
		System.out.println(avg);
		
		char score = ' ';
		char op = ' ';
		
		if(avg >= 90) {
			score = 'A';
			if(avg >=97) op = '+';
			else if(avg >=94) op = '0';
			else op = '-';
		} else if (avg >= 80) {
			score = 'B';
			if(avg >=87) op = '+';
			else if(avg >=84) op = '0';
			else op = '-';
		} else if (avg >= 70) {
			score = 'C';
			if(avg >=77) op = '+';
			else if(avg >=74) op = '0';
			else op = '-';
		} else if (avg >= 60) {
			score = 'D';
			if(avg >=67) op = '+';
			else if(avg >=64) op = '0';
			else op = '-';
		} else 
			score = 'F';
		
		System.out.println("학점 :"+score+op);
	}
	
	

}
