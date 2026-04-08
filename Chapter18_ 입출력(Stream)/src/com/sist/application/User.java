package com.sist.application;
import java.util.*;
public class User {
	public static void main(String[] args) {
		MemberManager mg = new MemberManager();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1.등록");
			System.out.println("2.조회");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.종료");
			System.out.println("=============");
			
			int menu = scan.nextInt();
			switch(menu)
			{
				case 1 -> mg.add();
				case 2 -> {
					List<MemberVO> result = mg.read();
					result.stream()
					.forEach(m -> System.out.println(m.getName()+"("+m.getAddress()+")"));
				}
				case 3 -> {
					System.out.println("수정할 회원 멤버 번호 입력 :");
					int no = scan.nextInt();
					System.out.print("이름입력:");
					String name = scan.next();
					System.out.print("성별입력:");
					String gender = scan.next();
					System.out.print("주소입력:");
					String address = scan.next();
					MemberVO updateMember = new MemberVO();
					updateMember.setName(name);
					updateMember.setName(gender);
					updateMember.setName(address);
				}
				case 4 -> {
//					System.out.println("삭제할 멤버 이름 : ");
//					String input = scan.next();
//					int no = input.
					List<MemberVO> list = mg.read();
					System.out.print("삭제할 번호("+list.size()+") : ");
					int no = scan.nextInt();
					mg.delete(no);
				}
				case 5 -> {
					System.out.println("프로그램종료");
					System.exit(0);
				}
				default -> {
					System.out.println("프로그램종료");
					System.exit(0);
				}
			}
		}
	}
}
