package p2024_08_05;

import java.util.GregorianCalendar;

// 윤년 판별 프로그램 작성

import java.util.Scanner;

public class BackJoon_240805_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력 하세요.");
		int year = sc.nextInt();
		
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
		    System.out.println(1);
		} else {
		    System.out.println(0);
		}
	}
}