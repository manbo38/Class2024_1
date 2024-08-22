package p2024_07_22;

public class ThrowsExceptionHandling2 {

//	occurException()를 호출한 곳에 예외처리를 양도 하겠다는 의미
	public void occurException() throws ArithmeticException {
		
			int result = 3/0;		// 예외 발생
			System.out.println(result);
		}
		
	public static void main(String[] args) {
		ThrowsExceptionHandling2 te = new ThrowsExceptionHandling2();
		
		try {
			te.occurException();
		}catch(ArithmeticException ae) {
			System.out.println("Exception이 발생:" + ae.toString());
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
