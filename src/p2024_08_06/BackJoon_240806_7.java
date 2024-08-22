package p2024_08_06;

import java.util.Scanner;

public class BackJoon_240806_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}System.out.println(sum);

	}

}
