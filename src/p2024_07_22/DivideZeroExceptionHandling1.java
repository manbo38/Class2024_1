package p2024_07_22;

//	예외처리
//	catch 구문에서 예외처리 클래스를 잘 모를때는 예외처리 클래스 중에서
//	최상위 클래스인 Exception 클래스로 모든 예외를 받을 수 있다.

public class DivideZeroExceptionHandling1 {

	public static void main(String[] args) {

		int a = 0;
		int b = 20;
		int c = 0;
		
		try {
			c = b / a;		// 예외 발생
			
//			예외가 발생하면, 예외가 발생한 라인 아랫쪽은 실행되지 않는다.
			int total = a+b;
			int sub = b-a;
		} catch(Exception e) {
			a = 2;
			c = b / a;
			System.out.println("0으로 나눌 수 없습니다.");
		
		}
		System.out.println(c);
	}

}
