package p2024_07_03;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		
		int max, min;
		System.out.println("정수 2개를 입력 하세요?");
		
		Scanner sc = new Scanner(System.in);
//		Scanner 객체를 생성한다 라는 뜻이다. 객체를 생성할 때는 new라는 메소드를 꼭 써야한다.
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
			System.out.println("max=" + max);
			System.out.println("min=" + min);
	}

}
