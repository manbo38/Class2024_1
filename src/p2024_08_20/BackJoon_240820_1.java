package p2024_08_20;

import java.util.Scanner;

public class BackJoon_240820_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int st = 30;
		boolean[] a = new boolean[31];
		
		for(int i=0; i<28; i++) {
			int stnum = sc.nextInt();
			a[stnum] = true;
		}
		
		int count = 0;
		for(int i=1; i<=st; i++) {
			if(!a[i]) {
				System.out.println(i);
				count++;
				if(count == 2) break;
			}
		}
		
	}

}
