package p2024_08_06;

import java.util.Scanner;

public class BackJoon_240806_8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 가격을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("물건의 갯수를 입력하세요.");
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<b; i++) {
			int p = sc.nextInt();
			int s = sc.nextInt();
			sum += p*s;
		}
		
		if(sum == a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
