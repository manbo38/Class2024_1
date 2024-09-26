package p2024_09_25;

import java.util.Scanner;

public class BackJoon_240925_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == -1) {
				break;
			}
			
			int sum = 0;
			StringBuilder sb = new StringBuilder();
			
			for(int i=1; i<=n/2; i++) {
				if(n%i == 0) {
					sum += i;
					if(sb.length() > 0) {
						sb.append(" + ");
					}
					sb.append(i);
				}
			}
			
			if(sum == n) {
				System.out.println(n + " = " + sb.toString());
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}

}
