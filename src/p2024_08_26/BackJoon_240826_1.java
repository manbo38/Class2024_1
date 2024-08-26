package p2024_08_26;

import java.util.Scanner;

public class BackJoon_240826_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[10];
		a[2] = "ABC";
		a[3] = "DEF";
		a[4] = "GHI";
		a[5] = "JKL";
		a[6] = "MNO";
		a[7] = "PQRS";
		a[8] = "TUV";
		a[9] = "WXYZ";
		
		String s = sc.nextLine();
		int c = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			for(int j=2; j<=9; j++) {
				if(a[j].indexOf(ch) != -1) {
					c += j+1;
					break;
				}
			}
			
		}
		System.out.println(c);
		
		
	}

}
