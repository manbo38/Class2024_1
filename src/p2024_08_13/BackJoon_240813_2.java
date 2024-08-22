package p2024_08_13;

import java.util.Scanner;

public class BackJoon_240813_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for(int i=1; i<n; i++) {
		if(a[i] > max) {
			max = a[i];
		}else if(a[i] < min) {
			min = a[i];
		}
	  }
		System.out.println(min+ " " +max);
	}

}
