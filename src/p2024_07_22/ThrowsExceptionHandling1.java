package p2024_07_22;

public class ThrowsExceptionHandling1 {
	
	public void occurException() { // throws ArithmeticException {
		
		try {
			int result = 3/0;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
//		int result = 3 / 0;
//		System.out.println(result);
		
	}

	public static void main(String[] args) {
		ThrowsExceptionHandling1 te = new ThrowsExceptionHandling1();
		
		te.occurException();
//		try {
//			te.occurException();
//		}catch(ArithmeticException ae) {
//			System.out.println("Exception이 발생:" + ae.toString());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
	}

}
