package p2024_07_16.ex06;

//	메소드 오버라이딩(Method overriding)
//	ㄴ부모 클래스에서 상속 받은 메소드를 자식 클래스에서 재정의해서 사용하는 것
//	1. 자식 클래스로 객체를 생성한 다음에 메소드를 호출하면, 메소드 오버라이딩된 메소드만 호출된다.
//	2. 부모 클래스의 상속 해주는 메소드는 더 이상 사용할 수 없는 은닉 메소드가 된다.
//	3. 부모 클래스의 은닉 메소드를 자식 클래스에서 사용하기 위해서는 super를 이용해서 호출 가능 ex) super.parentPrn()
//	4. ★★super.은 자식 클래스의 메소드 안에서 사용해야 한다.

class Parent {					// 부모 클래스
	public void parentPrn() {	// 은닉 메소드
		System.out.println("부모 클래스의 메소드는 상속된다.");
	}
}

class Child extends Parent {	// 자식 클래스

	@Override
	public void parentPrn() {	// 메소드 오버라이딩
		System.out.println("자식 클래스 : 메소드 오버라이딩된 메소드");
		super.parentPrn();
	}
	
	public void childPrn() {
		System.out.println("자식 클래스의 메소드는 부모가 사용할 수 없다.");
	}

}

public class SuperTest06 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();		// 자식 클래스에서 메소드 오버라이딩 된 메소드가 호출된다.
		c.childPrn();		// 자기 클래스의 메소드 호출
	}

}
