package p2024_09_10;

import java.util.Scanner;

public class BackJoon_240910_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 1;
		int r = 1;
		
		while(n > r) {
			r += 6 * c;
			c++;
		}
		
		System.out.println(c);
		
	}

}
