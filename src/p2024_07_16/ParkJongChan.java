package p2024_07_16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ParkJongChan {

	public static void main(String[] args) {

		Calendar c = new GregorianCalendar();
		Calendar c1 = Calendar.getInstance();
		
		int q = c1.get(Calendar.YEAR);
		int w = c1.get(Calendar.MONTH)+1;
		int e = c1.get(Calendar.DATE);
		
		int a = c1.get(Calendar.HOUR_OF_DAY);
		int s = c1.get(Calendar.MINUTE);
		int d = c1.get(Calendar.SECOND);
		System.out.println("금일 날짜,시간,요일은"+" "+q+"/"+w+"/"+e+" "+a+":"+s+":"+d+ " 입니다.");
	}
}
