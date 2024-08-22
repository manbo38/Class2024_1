package p2024_07_03;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
//		키보드로 입력한 정수가 짝수인지 홀수인지를 판별하는 프로그램을 작성하세요?
		
		System.out.println("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n+"은(는) 짝수");
		}else {
			System.out.println(n+"은(는) 홀수");
		}
	}

}
