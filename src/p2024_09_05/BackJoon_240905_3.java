package p2024_09_05;

import java.util.Scanner;

public class BackJoon_240905_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] n = new int[100][100];
		int a = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j=b; j<b+10; j++) {
				for(int k=c; k<c+10; k++) {
					n[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(n[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
