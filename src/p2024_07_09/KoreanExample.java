package p2024_07_09;

// p258 ~ 259
class Korean{
	// 필드
	String nation = "대한민국";
	String name;	// 이름
	String ssn;		// 주민번호
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// 생성자
	// 생성자는 클래스로 객체를 생성할때 호출되며, 필드값을 초기화 시키는 역할을 한다.
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}	
}

public class KoreanExample {

	public static void main(String[] args) {

		Korean  k1       = new    Korean("박자바", "011225-1234567");
//		클래스   레퍼런스변수   연산자  생성자 호출
		
		System.out.println("k1.name:"+ k1.name);
		System.out.println("k1.ssn:"+ k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name:"+ k2.name);
		System.out.println("k2.ssn:"+ k2.ssn);
		
	}

}
