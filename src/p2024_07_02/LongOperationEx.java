package p2024_07_02;

public class LongOperationEx {

	public static void main(String[] args) {
//		자료형이 다른 변수를 산술연산을 수행하면 가장 큰 자료형으로 자동 형변환이 된다.
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
