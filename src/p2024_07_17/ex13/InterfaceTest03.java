package p2024_07_17.ex13;

interface IHello {
	public abstract void sayHello(String name);	// 추상 메소드
}

abstract class GoodBye {
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

//	클래스와 인터페이스를 동시에 상속을 받을 때는 클래스를 먼저 상속을 받고
//	그런 다음에 인터페이스를 나중에 상속을 받아야 한다. (상속받는 순서가 바뀔 시 오류 발생)
class SubClass extends GoodBye implements IHello {

	@Override
	public void sayHello(String name) {		// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}

	@Override
	public void sayGoodBye(String name) {	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕히가세요!");
	}
	
}
public class InterfaceTest03 {
	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("변기유천");
		test.sayGoodBye("믹키유천");
	}
}
