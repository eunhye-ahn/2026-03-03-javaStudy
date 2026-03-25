class A{
	
}
class B extends A{
	
}
public class 예외처리1 {
	String msg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("1234");
//			}
//			
//		};
//		new Thread(r).start();
//		Runnable r = ()->{
//			System.out.println("1234");
//		};
//		new Thread(r).start();
		
//		Integer.parseInt("10 ".trim());
		/**
		 * 메소드 > if > 예외처리(예상이안되면)
		 */
		
//		int[] arr = new int[2];
//		try {
//		arr[0] = 1;
//		arr[2] = 1;
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println(arr[0]);
//		}
		try {
		A a = new A();
		B b = (B)a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		//다운캐스팅은 classcastexception 발생
		//업캐스팅은 정상실행
		
		//트라이 캐치절 - 여러군데에서 부분적으로 사용 가능
	}

}
