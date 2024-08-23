package p2024_08_22;

import java.util.Scanner;

public class BackJoon_240822_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] a = new String[n];
		
		for(int i=0; i<a.length; i++) {
			String b = sc.nextLine();
			a[i] = b;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].substring(0,1)+a[i].charAt(a[i].length()-1));
		}

	}

}
