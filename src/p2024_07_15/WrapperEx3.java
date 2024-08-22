package p2024_07_15;

public class WrapperEx3 {

	public static void main(String[] args) {
		
//		자동 박싱
//		Integer obj = new Integer(100);	// 박싱
		Integer obj = 100;				// 자동 박싱
		System.out.println("언박싱:" + obj.intValue());
		System.out.println("자동언박싱:" + obj);
		
//		언박싱
		int value1 = obj.intValue();
		
//		자동 언박싱
		int value2 = obj;
		
//		자동 언박싱
		int result = obj + 100;
		System.out.println("result:" + result);
	}

}
