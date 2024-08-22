package p2024_07_18;

import java.util.Scanner;

// 키보드를 통해서 연도(ex) 2020)를  입력 받는다.
// 이 때 입력 받은 연도가 윤년인지 평년인지를 판별하는 
// 프로그램을 작성하세요?
//
// 1년 365.242374
// 평년 = 365일 (2월달 - 28일까지)
// 윤년 = 366일 (2월달 - 29일까지)
//
// * 윤년의 정의
// 1. 해당 연도를 4로 나누어 떨어지면 윤년
// 2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님
// 3. 그 중에서 400으로 나누어 떨어지면 윤년

public class ParkJongChan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력 하세요.");
		int year = sc.nextInt();
		
//		if(year%400 == 0) {
//			System.out.println("윤년 입니다.");
//		}else if(year%100 == 0) {
//			System.out.println("평년 입니다.");
//		}else if(year%4 == 0) {
//			System.out.println("윤년 입니다.");
//		}else {
//			System.out.println("평년 입니다.");
//		}
		
//		if((year%400 == 0 && year%4 == 0) || year%100 == 0) {
//			System.out.println("윤년 입니다.");
//		}else {
//			System.out.println("평년 입니다.");
//		}
		
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
		    System.out.println("윤년 입니다.");
		} else {
		    System.out.println("평년 입니다.");
		}

		
	}

}
