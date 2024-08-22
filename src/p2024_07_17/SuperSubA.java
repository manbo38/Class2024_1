package p2024_07_17;

import packTest.packone.AccessTest;

//	부모 클래스로부터 상속을 받았고, 이런 경우 접근제어자가 protected 혹은 public만 가능
class SubOne extends AccessTest {	// 자식 클래스
	void subPrn() {
//		System.out.println(a);	// private-X
//		System.out.println(b);	// default-X
		System.out.println(c);	// protected-O
		System.out.println(d);	// public-O
	}
}

public class SuperSubA {
	
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.print();
//		System.out.println(at.a);	// private-X
//		System.out.println(at.b);	// default-X
//		System.out.println(at.c);	// protected-X
		System.out.println(at.d);	// public-O

	}

}
