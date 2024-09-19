package p2024_09_13;

import java.util.Scanner;

public class BackJoon_240913_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
				
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				count++;
				
				if(count == k) {
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println(0);
		
	}

}
