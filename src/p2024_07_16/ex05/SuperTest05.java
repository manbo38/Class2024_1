package p2024_07_16.ex05;

class Parent {					// 부모 클래스
	public void parentPrn() {
		System.out.println("부모 클래스의 메소드는 상속된다.");
	}
}

class Child extends Parent {	// 자식 클래스
	public void childPrn() {
		System.out.println("자식 클래스의 메소드는 부모가 사용할 수 없다.");
	}
}

public class SuperTest05 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();				// 상속 받은 parentPrn() 호출
		c.childPrn();
		
		Parent p = new Parent();
		p.parentPrn();				// 부모 클래스 자기 자신의 parentPrn() 메소드 호출
//		p.childPrn();				// 부모 클래스에서 자식 클래스의 메소드에 접근할 수 없다.
	}

}
