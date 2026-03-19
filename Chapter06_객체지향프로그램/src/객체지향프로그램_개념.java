//import lombok.Data;
//
///**
// * 변수 
// * -정적static/공용/인스턴스new
// * 생성자
// * 메서드
// */
//
//
//class Student{
//	static String school; //정적 -공용메모리
//	String name;			//인스턴스
//	int age;				//인스턴스
//}	
//
//
//public class 객체지향프로그램_개념 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student s1 = new Student();
//		s1.name = "AnEunhye";
//		s1.age = 25;
//		s1.school = "SCHOOL";
//		Student s2 = new Student();
//		s2.name = "eunhye";
//		s2.age=20;
//		s2.school="school";
//		System.out.println(s1.name + Student.school);
//		System.out.println(s2.name + s2.school);
//		
////		Student.school //정적은 클래스로도 객체로도 접근 가능 <- 클래스변수
////		sl.name 		// 인스턴스는 객체로만 접근 가능 <- 필드 : new사용시마다 따로 저장
//		
//	
//	}
//}

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

class Student{
	int kor,eng,math,total;
	double avg;
	char score;
	String name;
}

class Diary{
	int year = 2026;
	int month;
	int week = 18;
	int lastday;
	Diary(int year, int month, int week, int lastday){
		this.year = year;
		this.month = month;
		this.week = week;
		this.lastday = lastday;
	};
	Diary(int month, int lastday){
		this.month = month;
		this.lastday = lastday;
	}
}

class RefreshToken {
	int created_at;
	String user;
	int expired_at;
	String token;
	public RefreshToken updateToken(int newExpiredAt, String user){
		this.expired_at = newExpiredAt;
		this.user = user;
		return this;
	} //Entity Update;
}
@NoArgsConstructor // 빈 생성자
@AllArgsConstructor //모든 필드를 갖고있는 생성자
class A{
	int a,b;
}

public class 객체지향프로그램_개념 {

	public static void main(String[] args) {
		Diary d = new Diary(2020,8,16,1);
		System.out.printf("%d.%d.%d.%d\n",d.year,d.month,d.week, d.lastday);
		Diary d1 = new Diary(4,8);
		System.out.printf("%d.%d.%d.%d\n",d1.year,d1.month,d1.week, d1.lastday);
		A a = new A();
		// TODO Auto-generated method stub
//		Student[] std = new Student[3];
//		Scanner scan = new Scanner(System.in);
//		for(int i=0;i<std.length;i++) {
//			Student s = new Student();
//			System.out.println((i+1)+". 국어점수 : ");
//			s.kor = scan.nextInt();
//			System.out.println((i+1)+". 영어점수 : ");
//			s.eng = scan.nextInt();
//			System.out.println((i+1)+". 수학점수 : ");
//			s.math = scan.nextInt();
//			s.total = s.kor+s.eng+s.math;
//			s.avg = s.total/3.0;
//			std[i] = s; //
//		}
//		for(Student ss:std) {
//			System.out.printf("%.2f",ss.avg);
//			System.out.println();
//		}
	}

}
