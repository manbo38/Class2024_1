package p2024_07_22;

//	예외처리
//	1. try catch 구문으로 예외처리
//	   try {
//			예외가 발생할 가능성이 있는 문장;
//	   }catch(예외처리 클래스 매개변수) {
//			예외 메세지;
//	   }
//	2. 예외가 발생하지 않으면, try 아랫쪽만 실행되고 catch 구문은 실행X
//	3. 예외가 발생하면, 예외가 발생한 라인 아랫쪽 내용은 실행되지 않고
//	   catch 구문에서 예외를 받아서 처리한다.

public class DivideZeroExceptionHandling {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 20;
		int c = 0;
		
		try {
			c = b / a;		// 예외 발생
			
			int total = a+b;
			int sub = b-a;
		} catch(ArithmeticException ae) {
			a = 2;
			c = b / a;
		
		}
		System.out.println(c);
	}

}
