package p2024_08_21;

import java.util.Scanner;

public class BackJoon_240821_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
			int sub = sc.nextInt();
			a[i] = sub;
			
			if(max<sub) {
				max = sub;
			}
		}
		double sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += ((double)a[i]/max)*100;
		}
		System.out.println(sum/n);
	}
}