package p2024_08_23;

import java.util.Scanner;

public class BackJoon_240823_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] w = s.trim().split("\\s");
		
		if(s.trim().isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(w.length);
		}
		
	}

}
