package p2024_08_08;

import java.util.Scanner;

public class BackJoon_240808_3 {

public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		
		
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}
		int c = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<a; i++) {
			if(b[i] == c) {
				count++;
			}
		}
		System.out.println(count);

	}

}
