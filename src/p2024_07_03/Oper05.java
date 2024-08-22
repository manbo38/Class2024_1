package p2024_07_03;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
//		키보드로 입력한 정수 2개 중에서 최대값과 최소값을 출력하는 프로그램을 출력하세요?

		int n1, n2, max, min;
		System.out.println("정수 2개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); // 스페이스바 or 엔터키로 구분함
		n2 = sc.nextInt();

		max = (n1 > n2) ? n1 : n2; // 최대값
		min = (n1 < n2) ? n1 : n2; // 최소값

		System.out.println("max:" + max);
		System.out.println("min:" + min);

	}

}
