package p2024_07_02;

public class Oper03 {

	public static void main(String[] args) {
//      비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
//		비교 연산의 결과 참이면 true, 거짓이면 false값을 리턴한다.
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		
		System.out.println(num1 < num2);
		
		char c1 = 'A'; // 10진수 아스키코드 값 : 65
		char c2 = 'b'; // 10진수 아스키코드 값 : 66
		boolean result4 = (c1 < c2);
		System.out.println("result4:"+result4);
	}

}
