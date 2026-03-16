import java.util.Arrays;
import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] bubble = {20,30,10,0};
//		
//		for(int a:bubble) {
//			System.out.print(a);
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<bubble.length-1;i++) {
//			for(int j=i+1;j<bubble.length;j++) {
//				if(bubble[i]>bubble[j]) {
//					int temp =bubble[i];
//					bubble[i] = bubble[j];
//					bubble[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(bubble));
//		}
//		
//		for(int a:bubble) {
//			System.out.print(a);
//		}
//		
//		char[] c = new char[5];
//		for(int i=0;i<c.length;i++) {
//			c[i] = (char)((int)(Math.random()*26)+65);
//			for(int j=0;j<i;j++) {
//				if(c[i]==c[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for(char a:c) {
//			System.out.print(a);
//		}
//		System.out.println();
//		for(int i=0;i<c.length-1;i++) {
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]>c[j]) {
//					char temp = c[i];
//					c[i] = c[j];
//					c[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(c));
//		}
//		for(char a:c) {
//			System.out.print(a);
//		}
		
//		//변수
//		Scanner scan = new Scanner(System.in);
//		int[] kor = new int[3];
//		int[] eng = new int[3];
//		int[] math = new int[3];
//		int[] total = new int[3];
//		double[] avg = new double[3];
//		String[] s = new String[3];
//		int[] rank = new int[3];
// 		//초기화
//		for(int i=0;i<kor.length;i++) {
//			System.out.print((i+1)+". 국어:");
//			kor[i] = scan.nextInt();
//			
//			System.out.print((i+1)+". 영어:");
//			eng[i] = scan.nextInt();
//			
//			System.out.print((i+1)+". 수학:");
//			math[i] = scan.nextInt();
//			
//			total[i] = kor[i]+eng[i]+math[i];
//			avg[i] = total[i]/3.0;
//			
//			s[i] = switch((int)(avg[i]/10)) {
//			case 10,9 -> "A";
//			case 8 -> "B";
//			case 7 -> "C";
//			default -> "F";
//			};
//			System.out.println(s[i]);
//		}
//		//연산
//		for(int i=0;i<3;i++) {
//			for(int j=i+1;j<3;j++) {
//				if(total[i]>total[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		for(int a:rank) {
//			System.out.print(a);
//		}
		
//		int[] arr = new int[45];
//		
//		for(int i=1;i<=1000;i++) {
//			int rand = (int)(Math.random()*45);
//			arr[rand]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println((i+1)+">"+arr[i]);
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
	}

}
