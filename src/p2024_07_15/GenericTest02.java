package p2024_07_15;

class TestClass2 {
	
	private Object member;
	
	public void setValue(Object value) {
		member = value;
	}
	
	public Object getValue() {
		return member;
	}
}

public class GenericTest02 {

	public static void main(String[] args) {
		
		TestClass2 obj01 = new TestClass2();
		
//		Object value = new Integer(3);		// 업캐스팅+박싱
//		Object value = 3;					// 업캐스팅+자동 박싱
		obj01.setValue(3);
		System.out.println("돌려 받은 값:" + obj01.getValue());
		
//		다운 캐스팅 + 언박싱
//		오브젝트 클래스라는 부모 클래스가 자식 클래스로 강제 형변환 한 것을 다운 캐스팅
		int n = ((Integer)(obj01.getValue())).intValue();
		
//		Object value = new Double(3.14);	// 업캐스팅+박싱
//		Object value = 3.14;				// 업캐스팅+자동 박싱
		obj01.setValue(3.14);
		System.out.println("돌려 받은 값:"+obj01.getValue());

//		다운 캐스팅+언박싱
		double d = ((Double)(obj01.getValue())).doubleValue();
		
//		Object value = new String("이해할 수 있다.");	// 업캐스팅+박싱
		obj01.setValue("이해할 수 있다.");
		System.out.println("돌려 받은 값:" + obj01.getValue());

//		다운 캐스팅
		String str = (String)obj01.getValue();
	}

}
