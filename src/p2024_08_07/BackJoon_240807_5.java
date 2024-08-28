package p2024_08_07;

import java.util.Scanner;

public class BackJoon_240807_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}

