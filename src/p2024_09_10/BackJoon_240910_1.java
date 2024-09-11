package p2024_09_10;

import java.util.Scanner;

public class BackJoon_240910_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int s = (int)Math.pow(2, n)+1;
		int b = s * s;
		
		System.out.println(b);
	}

}
