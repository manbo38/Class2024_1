package p2024_07_10;

class Calculator3 {
//	메소드 오버로딩(Method Overloading)
//	ㄴ한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 하는 것
//	메소드 오버로딩 조건 : 매개변수의 자료형, 갯수, 순서

//	정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
//	직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorExample3 {

	public static void main(String[] args) {
		Calculator3 mycalcu = new Calculator3();
		
//		정사각형의 넓이 구하기
		double result1 = mycalcu.areaRectangle(10);
		
//		직사각형의 넓이 구하기
		double result2 = mycalcu.areaRectangle(10,20);

//		결과 출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
}