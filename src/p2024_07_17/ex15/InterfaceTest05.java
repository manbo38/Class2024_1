package p2024_07_17.ex15;

interface IHello {
	int a = 10;		// 상수 : public static final 생략
	public abstract void sayHello(String name);
}

interface IGoodBye {
	public abstract void sayGoodBye(String name);
}

//	인터페이스끼리 상속을 받을때는 extends로 상속을 받아야 한다.
interface ITotal extends IHello, IGoodBye {
	public abstract void greeting(String name);
}

// 인터페이스를 상속받는 구현 클래스에 3개의 추상 메소드를 모두 메소드 오버라이딩을 해야 한다.
class SubClass implements ITotal {
	@Override
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히가세요!");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name + ", 안녕!");
	}
	
}

public class InterfaceTest05 {
	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("규리");
		test.sayGoodBye("보람");
		test.greeting("연지");
		
		System.out.println(IHello.a);
		
//		a는 상수이기 때문에 값을 수정할 수 없다.
//		IHello.a = 30;
	}

}
