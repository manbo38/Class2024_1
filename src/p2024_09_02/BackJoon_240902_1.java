package p2024_09_02;

import java.util.Scanner;

public class BackJoon_240902_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		String s = sc.nextLine().toUpperCase();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				a[c - 'A']++;
			}
		}
		
		int max = -1;
		char ca = '?';
		boolean b = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				ca = (char)(i+'A');
				b = false;
			}else if(a[i] == max) {
				b = true;
			}
		}
		
		if(b) {
			System.out.println("?");
		}else {
			System.out.println(ca);
		}
		
	}

}
