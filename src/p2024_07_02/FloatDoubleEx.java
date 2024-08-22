package p2024_07_02;

public class FloatDoubleEx {

	public static void main(String[] args) {
		
//		실수값 저장
//		float var1 = 3.14;  // 오류 발생
		float var2 = 3.14f;
		double var3 = 3.14;
		
//		정밀도 테스트
		float var4 = 0.1234567890123456789f; // 소수점 7자리까지만 정밀하게 출력
		double var5 = 0.1234567890123456789; // 소수점 15자리까지만 정밀하게 출력
		
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
//		e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
	}

}
