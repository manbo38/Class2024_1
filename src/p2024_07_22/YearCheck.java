package p2024_07_22;

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
//		업캐스팅이 되면 부모 클래스가 상속해준 메소드만 접근할 수 있다.
//		Calendar y = new GregorianCalendar();	// 업캐스팅(자동 형변환) - 오류 발생
		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}

	}

}
