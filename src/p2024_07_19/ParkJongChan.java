package p2024_07_19;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class ParkJongChan {

	public static void main(String[] args) {
		
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}
				
	}

}
