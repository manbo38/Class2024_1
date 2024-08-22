package p2024_07_15;

public class WrapperEx4 {

	public static void main(String[] args) {
		
//		Double d = new Double();
		
		Double d1 = new Double(3.14);	// 박싱
		Double d11 = 3.14;				// 자동 박싱
		
		double n1 = d1.doubleValue();	// 언박싱
		double n11 = d1;				// 자동 언박싱
		
//		1. 자료형 변환 : "42.195" -> 42.195
//		문자가 들어가는건 자동 박싱은 되지 않는다.
		Double d2 = new Double("42.195"); // 박싱
//		Double d22 = "42.195"; 			// 오류 발생
		
		double n2 = d2.doubleValue();	// 언박싱
		double n22 = d2;				// 자동 언박싱
		
//		2. 자료형 변환 : "42.195" -> 42.195
		double num = Double.parseDouble("42.195");
			System.out.println("num=" + num);
	}
}
