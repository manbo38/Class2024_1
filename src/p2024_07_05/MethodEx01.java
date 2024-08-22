package p2024_07_05;

public class MethodEx01 {

	int a = 10;	// 멤버변수, 필드(field)
//	사용자 정의 메소드
//	사용자 정의 메소드는 프로그래머가 직접 호출해야 실행된다.
	public static void check( ) {	// 정적 메소드 : static이 붙어 있는 메소드
		System.out.println("메소드 호출 성공");
//		return;	// return문 생략 가능
	}
	
//	값 전달에 의한 메소드 호출방식 (Call by Value방식)
	static void check(int a) {	// 매개변수 : int a
		System.out.println("전달된 값:" + a);
	}
	
	static void check(int a, double d) {
		double result = a + d;
		System.out.println("전달된 값의 합:" + result);
	}
	
	static void check(char c) {
		System.out.println("전달된 값:" + c);
	}
	
	static void check(boolean b) {
		System.out.println("전달된 값:" + b);
	}
	
//	주소값 전달에 의한 메소드 호출방식(Call by Reference 방식)
	static void check(String s) {
		System.out.println("전달된 값:" + s);
	}
	
//	return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
//	return문은 메소드 가장 마지막 줄에 사용해야 한다.
	static int check01( ) {
		System.out.println("리턴구문");
		return 50;
	}
//	한 개의 구문에 메소드가 여러 개 있는게 "오버로딩" 이라고 한다.
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
//	main() 메소드는 자바 가상머신(JVM, java.exe)으로만 호출된다.
//	main() 메소드는 프로그래머가 직접 호출할 수 없다.
	public static void main(String[] args) {
//		MethodEx01.check();// check() 메소드 호출
		check();	// 정적 메소드는 클래스명을 생략해도 호출 가능하다.
//		객체 지향 언어의 경우 메소드 위치가 변경이 되어도 호출은 가능하다.
		check(30);
		check(10,20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("파이썬"));
		
		check01(); // return문으로 돌려받은 값이 출력되지 않는다.
		int result = check01();
		System.out.println("돌려 받은 값1:" + result);
		System.out.println("돌려 받은 값2:" + check01());
		double result2 = check02(50,3.14);
		System.out.println("돌려 받은 값3:" + result2);
		System.out.println("돌려 받은 값4:" + check02(50,3.14));		
	}
}
