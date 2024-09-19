package p2024_09_12;

import java.util.Scanner;

public class BackJoon_240912_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line = 0;
		int sum = 0;
		
		while(sum < n) {
			line++;
			sum += line;
		}
		
		int b = sum - n;
		
		if(line % 2 == 0) {
			System.out.println((line - b) + "/" + (b + 1));
		}else {
			System.out.println((b + 1) + "/" + (line - b));
		}
	}

}
