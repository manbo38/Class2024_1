package p2024_07_11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		
//		3. Calendar 클래스
//		Calendar c1 = new Calendar();	// 오류 발생
		Calendar c2 = new GregorianCalendar();	// 업캐스팅
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(Calendar.YEAR);		// 1
		
		int y = c.get(Calendar.YEAR);			// 연 : 2023
		int m = c.get(Calendar.MONTH)+1;		// 월 : 0 ~ 11 (월 만 +1 해줘야함)
		int d = c.get(Calendar.DATE);			// 일
		
		System.out.println(y+"-"+m+"-"+d);
		
		int h1 = c.get(Calendar.HOUR);			// 12시간제
		int h2 = c.get(Calendar.HOUR_OF_DAY);	// 24시간제
		int ap = c.get(Calendar.AM_PM);			// 0 : 오전, 1 : 오후
		if(ap == 0) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		int mm = c.get(Calendar.MINUTE);		// 분
		int s = c.get(Calendar.SECOND);			// 초
		
		System.out.println(h1+":"+mm+":"+s);	// 12시간
		System.out.println(h2+":"+mm+":"+s);	// 24시간
		
	}

}
