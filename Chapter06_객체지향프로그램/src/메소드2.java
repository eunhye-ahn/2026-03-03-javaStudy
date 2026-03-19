import java.util.Arrays;

class CallByValue{
	void swap(int a, int b) {
		System.out.printf("%d %d\n",a,b);
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("%d %d\n",a,b);
	}
	void swap(String a, String b) {
		System.out.printf("%s %s\n",a,b);
		String temp = a;
		a = b;
		b = temp;
		System.out.printf("%s %s\n",a,b);
	}
	void swap(int[] a) {
		System.out.println(Arrays.toString(a));
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		System.out.println(Arrays.toString(a));
	}
}

public class 메소드2 {
	public static void main(String[] args) {
		CallByValue c = new CallByValue();
		int a = 10;
		int b = 20;
		c.swap(a,b);
		System.out.printf("%d %d\n",a,b);

		CallByValue d = new CallByValue();
		String s1 = "A";
		String s2 = "B";
		c.swap(s1,s2);
		System.out.printf("%s %s\n",s1,s2);
		
		//Q : string은 참조변수가 아닌가? string은 callbyvalue임
		//string은 불변이라서 내부 수정 불가함
		//swap때만 복사한 주소를 서로 바꿔서 전달함
		
		//Q : 왜 배열은 바뀌는가
		//배열은 내부 수정 가능/.///
		int[] arr = {1,2};
		CallByValue v = new CallByValue();
		v.swap(arr);
		System.out.println(Arrays.toString(arr));
	}
}
