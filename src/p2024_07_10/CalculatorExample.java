package p2024_07_10;

class Calculator {
//	메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
		return;		// 생략가능
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
//		return문은 가장 마지막 줄에 사용할 것! / 메소드 호출한 곳에 값을 돌려주는 역할
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator mycalc = new Calculator();
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5,6);
		System.out.println("result1:" + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = mycalc.divide(x, y);
		System.out.println("result2:" + result2);
		
		mycalc.powerOff();
	}

}