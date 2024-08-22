package p2024_07_15;

class TestClass {
	
	private int member;			// 필드
	
	public void setValue(int value) {
		member = value;			// 3
	}
	
	public int getValue() {
		return member;
	}
}

public class GenericTest01 {

	public static void main(String[] args) {
		
		TestClass obj01 = new TestClass();
		obj01.setValue(3);
		System.out.println("돌려 받은 값:" + obj01.getValue());

//		obj01.setValue(3.14);			// 오류 발생
		System.out.println("돌려 받은 값:" + obj01.getValue());
		
//		obj01.setValue("이해할 수 있다.");	// 오류 발생
		System.out.println("돌려 받은 값:" + obj01.getValue());
	}

}
