package p2024_07_03;

import java.util.Scanner;

public class ParkJongChan {

	public static void main(String[] args) {

		int s1, s2, s3, max, min;
		System.out.println("정수 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();

		max = (s1 > s2) ? ((s1 > s3) ? s1 : s3) : ((s2 > s3) ? s2 : s3);
		min = (s1 < s2) ? ((s1 < s3) ? s1 : s3) : ((s2 < s3) ? s2 : s3);

		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
