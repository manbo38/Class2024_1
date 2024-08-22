package p2024_07_12;

public class SubStringEx {

	public static void main(String[] args) {

//		아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하세요
		
		String jumin = "950101-1234567";
		
		String gender = jumin.substring(7, 8);
		char c = jumin.charAt(7);
		System.out.println(c);
		System.out.println(gender);
		
//		charAt 사용
		if(c == '1' || c == '3') {
			System.out.println("남자입니다.");
		}else if(c == '2' || c == '4') {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
//		substring 사용
//		if(gender.equals("1") || gender.equals("3")) {
//			System.out.println("남자입니다.");
//		}else if(gender.equals("2") || gender.equals("4")) {
//			System.out.println("여자입니다.");
//		}else {
//			System.out.println("잘못된 정보입니다.");
//		}
	}
}