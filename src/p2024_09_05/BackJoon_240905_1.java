package p2024_09_05;

import java.util.Scanner;

public class BackJoon_240905_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[9][9];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int max = a[0][0];
		int r = 0;
		int c = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					r = i;
					c = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((r+1)+" "+(c+1));
	}
}
