package p2024_07_17.ex11;

interface IHello {				// 인터페이스
	void sayHello(String name);	// 추상 메소드
}								// public abstract 생략

// 1. 인터페이스를 상속 받을 때는 implements 로 상속 받아야 한다.
// 2. 인터페이스를 상속 받으면, 부모 인터페이스 안의 추상 메소드를 자식 클래스에서
//	   반드시 '메소드 오버라이딩'을 해야한다.
class Hello implements IHello {
	@Override
	public void sayHello(String name) {	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}
	
}

public class InterfaceTest01 {
	public static void main(String[] args) {
//		인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		IHello obj = new IHello();	// 오류 발생
		
		Hello obj = new Hello();
		obj.sayHello("헤이즈");
	}

}
