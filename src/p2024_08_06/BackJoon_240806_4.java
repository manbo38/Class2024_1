package p2024_08_06;

import java.util.Scanner;

public class BackJoon_240806_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println(10000+a*1000);
		}else if(a == b || a == c || b == c) {
			int sum = (a==b) ? a : (a==c) ? a : b;
			System.out.println(1000+sum*100);
		}else {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}

	}

}
