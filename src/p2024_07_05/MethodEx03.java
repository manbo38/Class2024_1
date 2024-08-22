package p2024_07_05;

import java.util.Scanner;

public class MethodEx03 {
	
//	키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요.
//	단, 메소드를 이용해서 작성하세요.
	
//	최대값
	static int max(int a, int b) {
		if(a > b)
			return a;
		else
			return b;
	}
	
//	최소값
	static int min(int a,int b) {
		if(a < b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		
		int n1, n2, max, min;
		System.out.println("2개의 정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		max = max(n1, n2);
		min = min(n1, n2);
		System.out.println("max:" + max);
		System.out.println("min:" + min);	
	}

}
