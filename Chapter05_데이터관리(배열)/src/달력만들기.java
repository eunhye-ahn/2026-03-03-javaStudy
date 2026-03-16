import java.util.Scanner;

public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수설정
		Scanner scan = new Scanner(System.in);
		int year = 0, month=0, day=0;
		
		System.out.println("년도 : ");
		year = scan.nextInt();
		System.out.println("월 : ");
		month = scan.nextInt();
		System.out.println("일 : ");
		day = scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월");
		String[] strWeek = {"일","월","화","수","목","금","토"};
		
		for(String w:strWeek) {
			System.out.println(strWeek);
		}
		//요일 : 총날수%7
		int total = (year-1)*365 +(year-1)/4 -(year-1)/4 +(year-1)/400;
		
		

	}

}
