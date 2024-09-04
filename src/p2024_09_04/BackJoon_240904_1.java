package p2024_09_04;

import java.util.Scanner;

public class BackJoon_240904_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] s = new int[n][m];
		int[][] sum = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				s[i][j] = sc.nextInt();	
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sum[i][j] = a[i][j] + s[i][j];
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
			System.out.print(sum[i][j]+" ");
	}
	System.out.println();
		}
	}

}
