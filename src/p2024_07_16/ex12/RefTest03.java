package p2024_07_16.ex12;

class Parent03 {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스:ParentPrn메소드");
	}
}

class Child03 extends Parent03 {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스:ChildPrn메소드");
	}
	
}

//	강제 형변환(다운 캐스팅)
//	1. 부모클래스에서 자식클래스로 형변환 하는 것이다.
//	2. 참조 가능한 영역이 확대가 된다.
//	3. 컴파일러에 의해서 자동 형변환이 되지 않기 때문에 프로그래머가 직접 강제 형변환을
//	  해야 하며, 강제 형변환시 자료형을 생략할 수 없다.


public class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Parent03();	// 업캐스팅
		p.parentPrn();					// 상속해준 메소드만 호출할 수 있다.
//		p.childPrn();					// 오류발생
		
		Child03 c;						// 강제 형변환으로 다운 캐스팅
		c = (Child03) p;
		
		Child03 c1 = (Child03) p;		// 다운 캐스팅(강제 형변환)
		
		
//		다운 캐스팅이 되면 참조 가능한 영역이 확대된다.
		c.parentPrn();					// 상속 받은 메소드 호출 가능
		c.childPrn();					// 자식 클래스의 메소드 호출 가능
	}

}