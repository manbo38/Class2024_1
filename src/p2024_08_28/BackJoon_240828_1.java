package p2024_08_28;

import java.util.Scanner;

public class BackJoon_240828_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int night = 2;
		int phone = 8;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.print(king-a + " ");
		System.out.print(queen-b + " ");
		System.out.print(look-c + " ");
		System.out.print(bishop-d + " ");
		System.out.print(night-e + " ");
		System.out.print(phone-f + " ");
	}

}
