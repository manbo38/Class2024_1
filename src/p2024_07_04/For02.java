package p2024_07_04;

public class For02 {

	public static void main(String[] args) {
//		1~10까지 합을 구하는 프로그램을 작성 하세요?
		
		int sum = 0;	// main 메소드 안에서만 사용되는 지역변수 int sum, 지역변수에는 무조건 초기값이 설정 되어야 한다.
		for(int i=1; i<=10; i++) {	// for문 안에서만 사용되는 지역변수 int i
			sum += i;	// sum = sum + i;
//			1 = 0 + 1
//			3 = 1 + 2
//			6 = 3 + 3
//			10 = 6 + 4
//			System.out.println("1~"+i+"="+sum);
		}
//		System.out.println(i);	// 오류 발생
		System.out.println("sum="+sum);
	}

}
