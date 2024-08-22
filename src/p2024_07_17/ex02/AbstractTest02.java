package p2024_07_17.ex02;

abstract class Hello {		// 추상 클래스
	public abstract void sayHello(String name);		// 추상 메소드
}
abstract class GoodBye {	// 추상 클래스
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

//	자바에서는 클래스의 다중 상속을 허용하지 않는다.
class SubClass extends GoodBye { //, Hello {
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕하세요!");
	}
	public void sayGoodBye(String name) {
		System.out.println(name+"씨 안녕히 가세요!");
	}
}

public class AbstractTest02 {

	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("홍길동");
		test.sayGoodBye("홍길동");
	}
}
