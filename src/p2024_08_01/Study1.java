package p2024_08_01;

import java.util.Scanner;

//	가장 많이 출현한 수를 출력하시오
//  1 2 2 3 1 4 2 2 4 3 5 3 2

public class Study1 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int w = 0;
		
		for(int i=0; i<10; i++) {
			a[i] = sc.nextInt();
		}
		
		int []mode = new int[10];
		
		int modeNum = 0;
		int modeCnt = 0;
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수는 :" + modeNum + "cnt : " +modeCnt);
		
//		System.out.println("가장 많이 출현한 수는 :" + + "입니다.");
	}

}
