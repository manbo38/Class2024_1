package p2024_07_16.ex11;

class Parent {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스:ParentPrn메소드");
	}
}

class Child extends Parent {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스:ChildPrn메소드");
	}
	
}

//	자동 형변환(업 캐스팅)
//	1. 자식클래스에서 부모클래스로 형변환 하는 것이다.
//	2. 참조 가능한 영역이 축소가 된다.
//	3. 컴파일러에 의해서 자동 형변환이 된다. 
public class RefTest01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();				// 상속받은 메소드 호출
		c.childPrn();				// 자기 클래스의 메소드 호출
		
		Parent p;
		p = c;						// 업캐스팅
		
//		업캐스팅이 되면 참조 가능한 영역이 축소된다.
		Parent p1 = new Child();	// 업캐스팅(자동 형변환)
		
		p.parentPrn();	// 업캐스팅이 되면 상속해 준 메소드만 호출할 수 있다.
//		p.childPrn();	// 상속 해주지 않은 메소드는 접근할 수 없다.
	}

}
