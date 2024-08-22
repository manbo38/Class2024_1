package p2024_07_22;

//	예외 처리를 하지 않은 경우
public class DivideZeroException {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		int c = b / a;		// 예외발생
		
		int total = a + b;
		int sub = b - a;
		
		System.out.println(c);
	}

}
