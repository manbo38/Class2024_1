package p2024_08_13;

import java.util.Scanner;

public class BackJoon_240813_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int maxIndex = 0;
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}System.out.println(max);
		System.out.println(maxIndex+1);
		
	}

}
