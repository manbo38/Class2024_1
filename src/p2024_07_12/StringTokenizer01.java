package p2024_07_12;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		
//		토큰(token) : 구분기호(#)로 분리된 문자

		StringTokenizer str =
				new StringTokenizer("서지영#이지혜#크리스#장석현", "#");
		
//		System.out.println(str.nextToken());	// 서지영
//		System.out.println(str.nextToken());	// 이지혜
//		System.out.println(str.nextToken());	// 크리스
//		System.out.println(str.nextToken());	// 장석현
//		System.out.println(str.nextToken());	// 예외발생
		
//		파싱된 문자(토큰)가 모두 몇개인지 구해온다.
		int c = str.countTokens();
		System.out.println("파싱할 문자열의 총 갯수:" + c);
		
//		토큰이 있을 경우에서 토큰을 구해와서 출력한다.
		while(str.hasMoreTokens()) {		// 토큰이 있으면
			System.out.println(str.nextToken());	// 토큰을 구해온다.
		}
	}

}
