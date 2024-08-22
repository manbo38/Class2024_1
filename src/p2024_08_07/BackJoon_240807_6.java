package p2024_08_07;

import java.util.Scanner;

public class BackJoon_240807_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<a+1; i++) {
			for(int j=0; j<a-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
				}
			System.out.println();
			}

	}

}
