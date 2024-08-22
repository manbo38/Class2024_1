package p2024_08_21;

import java.util.Scanner;

public class BackJoon_240821_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int k = sc.nextInt() - 1;
			int f = sc.nextInt() - 1;
				
			while(k<f) {
				int temp = a[k];
				a[k] = a[f];
				a[f] = temp;
					
				k++;
				f--;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}	
}