package p2024_08_20;

import java.util.Scanner;

public class BackJoon_240820_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] b = new boolean[42];
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			int st = num%42;
			b[st] = true;
		}
		
		int count = 0;
		for(int i=0; i<42; i++) {
			if(b[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
