package p2024_07_05;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {

		int n, f=1;
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
//			3 = 1 * 3
//			6 = 3 * 2
//			6 = 6 * 1
		}
		System.out.println(n+"!="+f);
//		팩토리얼의 경우 곱하기 연산을 사용해야 하고, 마이너스 증감 연산을 사용해야 한다!
	}

}
