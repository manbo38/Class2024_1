package p2024_07_17.ex12;

interface IHello {	// 인터페이스
	public abstract void sayHello(String name);		// 추상 메소드
}
interface IGoodBye {
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

//	인터페이스의 다중상속
class SubClass implements IHello, IGoodBye {
	@Override
	public void sayHello(String name) {		// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}
	@Override
	public void sayGoodBye(String name) {	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕히가세요!");
	}
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("비틀킹");
		test.sayGoodBye("비틀킹");		
	}

}
