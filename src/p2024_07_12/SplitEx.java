package p2024_07_12;

public class SplitEx {

	public static void main(String[] args) {

//		String[] split("구분기호")
//		전체 문자열에서 구분기호를 이용해서 문자를 잘라서 배열로 리턴 해주는 메소드
		
		String jumin = "950101-1234567";
		String[] j = jumin.split("-");
		System.out.println("주민번호 앞자리:" + j[0]);
		System.out.println("주민번호 뒷자리:" + j[1]);
		for(int i=0; i<j.length; i++) {
			System.out.println(j[i]);
	}
		for(String s : j)		// 향상된 for문
			System.out.println(s);
		
		String tel = "010-1234-5678";
		String[] t = tel.split("-");
		System.out.println("전화번호 앞자리:" + t[0]);		// 010
		System.out.println("전화번호 중간자리:" + t[1]);		// 1234
		System.out.println("전화번호 끝자리:" + t[2]);		// 5678
		
		String email = "totoro@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디:" + e[0]);				// totoro
		System.out.println("도메인:" + e[1]);				// naver.com
		
	}
}
