package p2024_09_05;

import java.util.Scanner;

public class BackJoon_240905_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[] s = new String[5];
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextLine();
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<s.length; j++) {
				if(i<s[j].length()) {
					sb.append(s[j].charAt(i));
				}
			}
		}
		System.out.print(sb.toString());
	}

}
