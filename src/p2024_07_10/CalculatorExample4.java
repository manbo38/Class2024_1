package p2024_07_10;

class Calculator4 {
//	정적 필드와 정적 메소드는 클래스로 객체를 생성하지 않고, 클래스명으로 직접 접근한다.
//	ex) Calculator4.pi, Calculator4.plus()
	
	static double pi = 3.14159;			//정적 필드
	
	static int plus(int x, int y) {		//정적 메소드
		return x + y;
	}
	
	static int minus(int x, int y) {	//정적 메소드
		return x - y;
	}
}

public class CalculatorExample4 {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator4.pi;
		int result2 = Calculator4.plus(10, 5);
		int result3 = Calculator4.minus(10, 5);
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);

	}

}
