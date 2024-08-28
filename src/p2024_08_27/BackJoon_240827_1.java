package p2024_08_27;

import java.util.Scanner;

public class BackJoon_240827_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String s = new StringBuilder(a).reverse().toString();
		
		if(a.equals(s)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
