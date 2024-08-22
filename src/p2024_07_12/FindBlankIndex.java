package p2024_07_12;

public class FindBlankIndex {

	public static void main(String[] args) {

//		length() : 문자열의 길이를 구해주는 역할
//		charAt() : index번호의 문자를 구해주는 메소드
		
		String message = "Java program creates many objects.";
		
		int len = message.length();	// 문자열의 길이를 구함
		System.out.println(len);	// 34
		
		for(int i=0; i<len; i++) {	// index번호가 0부터 시작하므로 0부터 시작!
			char c = message.charAt(i);
			if(c == ' ') {		// 공백문자의 index번호를 구한다.
				System.out.println("index=" + i);
			}
		}
	}
}