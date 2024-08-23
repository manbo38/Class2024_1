package p2024_08_22;

import java.util.Scanner;

public class BackJoon_240822_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			sum += Integer.parseInt(String.valueOf(s.charAt(i)));	
		}
		System.out.println(sum);
	}
}
