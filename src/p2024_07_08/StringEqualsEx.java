package p2024_07_08;

public class StringEqualsEx {

	public static void main(String[] args) {
//		String 클래스의 경우 new를 쓸 수도 있고 안 쓸수도 있는 유일한 클래스이다.
//		new 연산자 없이 String 객체를 생성하면, 처음 1번만 heap 메모리상에 값을 할당한다.
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {	// 참조하는 주소 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if(strVar1.equals(strVar2)) {	// 참조하는 값 비교
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

//		new 연산자를 이용해서 String 객체를 생성하면, 매번 새로운 heap 메모리상에 새로운 공간을 할당 받는다.
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {	// 참조하는 주소 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if(strVar3.equals(strVar4)) {	// 참조하는 값 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
	}

}
