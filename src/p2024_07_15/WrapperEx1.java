package p2024_07_15;

public class WrapperEx1 {

	public static void main(String[] args) {

//		Interger num = new Integer(); 	// 오류 발생
//		Integer 클래스는 기본 생성자를 제공하지 않기 때문에
//		기본 생성자로 객체를 생성할 수 없다.
		
//		박싱(boxing)
//		heap 메모리를 박스로 생각하고, stack 메모리에 저장된 10을
//		heap 메모리에 복하는 것. (heap 메모리 박스에 집어 넣는다.)
		int n = 10;						// 지역변수 : stack영역에 저장
		Integer num01 = new Integer(n); // 박싱(boxing)
		System.out.println(n);
		
//		언박싱(unboxing)
//		heap 메모리에 있는 데이터를 stack 메모리로 가져오는 것
		int n01 = num01.intValue();		// 언박싱(unboxing)

//		자료형 변환 : "20 -> 20
		String s = "20";
		Integer num02 = new Integer(s);	// 박싱(boxing)
		int n02 = num02.intValue();		// 언박싱(unboxing)
	}

}
