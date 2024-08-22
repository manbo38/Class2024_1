package p2024_07_11;

class MyDate2 {
	
	private int year;		// 필드, 멤버변수
	private int month;
	private int day;
	
	public MyDate2(int year, int month, int day) {		// 생성자
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
//	1. 필드값을 메소드를 호출한 곳에 돌려주는 역할
	public int getYear() {		// getter 메소드
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
//	2. 필드값을 수정하는 역할
	public void setYear(int year) {		// setter 메소드
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}

//	3. 필드값을 출력하는 역할
	public void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
	
}

public class ClassTest2 {

	public static void main(String[] args) {

//		MyDate2 d = new Mydate2();		// 오류 발생
		MyDate2 d = new MyDate2(2024,7,11);
		d.print();
		
		d.setYear(2025);
		d.setMonth(12);
		d.setDay(25);
		d.print();
		
//		가장 마지막 값을 출력
		int year = d.getYear();
		int month = d.getMonth();
		int day = d.getDay();
		System.out.println("돌려받은 year:"+year);
		System.out.println("돌려받은 month:"+month);
		System.out.println("돌려받은 day:"+day);
	}

}
