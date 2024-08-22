package p2024_08_06;

import java.util.Scanner;

public class BackJoon_240806_3 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int h = sc.nextInt();
		    int m = sc.nextInt();
		    int addM = sc.nextInt();

		    int ccMinutes = h * 60 + m;
		        
		    int totalMinutes = ccMinutes + addM;
		        
		        int finalHour = (totalMinutes / 60) % 24;
		        int finalMinute = totalMinutes % 60;
		        
		        System.out.println(finalHour + " " + finalMinute);
		        
		    }

}