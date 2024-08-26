package p2024_08_23;

import java.util.Scanner;

public class BackJoon_240823_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] alpha = new int[26];
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int b = c - 'a';
			
			if(alpha[b] == -1) {
				alpha[b] = i;
			}
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
		
	}

}
