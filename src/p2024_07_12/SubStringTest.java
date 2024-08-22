package p2024_07_12;

public class SubStringTest {

	public static void main(String[] args) {

//		substring() : 전체 문자열에서 특정 범위의 문자를 추출하는 역할

//		substring(int beginIndex) : beginIndex번호부터 끝까지 문자를 추출
//		substring(int beginIndex, int endIndex) : beginIndex번호부터 endIndex-1번까지 문자를 추출
		
		String message = "Java program creates many objects.";
		
//		index 번호 13번부터 끝까지 문자를 추출
		String str1 = message.substring(13);
		System.out.println(str1);
		
		String str2 = message.substring(13, 16);
		System.out.println(str2);
		
	}

}
