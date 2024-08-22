package p2024_08_14;

import java.util.Scanner;

public class BackJoon_240814_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int m = sc.nextInt();
				
		for(int b=0; b<m; b++) {
		int start = sc.nextInt();
		int end = sc.nextInt();
		int ball = sc.nextInt();
		
		for(int j=start-1; j<end; j++) {
			a[j] = ball;
		}
	  }
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
