package p2024_07_10;

public class MathEx {

	public static void main(String[] args) {

//		Math 클래스
//		Math 클래스 = 정적 필드 + 정적 메소드
		
//		Math 클래스는 생성자가 제공되지 않기 때문에, Math 클래스로 직접 객체 생성 X
//		Math m = new Math();
		
		System.out.println("E="+Math.E);	// 오일러 상수
		System.out.println("PI="+Math.PI);	// 원주율
		
		System.out.println("abs()="+Math.abs(-10));			// 절대값 : 10
		System.out.println("ceil()="+Math.ceil(3.14));		// 올림기능 : 4.0
		System.out.println("round()="+Math.round(10.5));	// 올림기능 : 11
		System.out.println("floor()="+Math.floor(10));		// 내림기능 : 10.0
		System.out.println("max()="+Math.max(10,20));		// 최대값 : 20
		System.out.println("min()="+Math.min(10,20));		// 최소값 : 10
		System.out.println("pow()="+Math.pow(2,3));			// 2의 3승 : 8.0
		
//		0.0 <= Math.random() < 1.0
		System.out.println("random()="+Math.random());
//		1~45사이의 난수 발생
		int r = (int)(Math.random()*45)+1;
		System.out.println("난수발생:"+r);

		System.out.println("sqrt()="+Math.sqrt(5));			// 제곱근	
	}
}
