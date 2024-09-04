package p2024_09_03;

import java.util.Scanner;

public class BackJoon_240903_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p = 0.0;
		double pp = 0.0;
		
		for(int i=0; i<20; i++) {
			String s = sc.next();
			double n = sc.nextDouble();
			String b = sc.next();
			
			if(b.equals("P")) continue;
				
			double ppp = 0.0;
			switch(b) {
			case "A+" : ppp = 4.5; break;
			case "A0" : ppp = 4.0; break;
			case "B+" : ppp = 3.5; break;
			case "B0" : ppp = 3.0; break;
			case "C+" : ppp = 2.5; break;
			case "C0" : ppp = 2.0; break;
			case "D+" : ppp = 1.5; break;
			case "D0" : ppp = 1.0; break;
			case "DF" : ppp = 0.0; break;
			}
			p += n * ppp;
			pp += n;	
		}
		
		double avg1 = p / pp;
		System.out.printf("%.6f", avg1);
		
	}

}
