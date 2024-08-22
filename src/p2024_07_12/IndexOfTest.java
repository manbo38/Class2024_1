package p2024_07_12;

public class IndexOfTest {

	public static void main(String[] args) {

//		int indexOf() : 특정 문자의 인덱스 번호를 구해주는 메소드
		
		String message = "Java program creates many objects.";
		
//		가장 먼저 나오는 'a'의 인덱스 번호를 구해준다.
		int index1 = message.indexOf('a');
//		10진수 아스키코드값(97)에 해당되는 문자('a')의 인덱스 번호를 구한다.
		int index2 = message.indexOf(97);
		
		System.out.println(index1);		// 1
		System.out.println(index2);		// 1
		
//		index 번호 13번 이후에 나오는 a의 인덱스 번호를 구한다.
		int index3 = message.indexOf('a', 13);
		System.out.println(index3);		// 16
		
//		가장 먼저 나오는 'av'의 인덱스 번호를 구해준다.
		int index4 = message.indexOf("av");
		System.out.println(index4);		// 1
		
//		index 번호 12번 이후의 'man'의 인덱스 번호를 구해준다.
		int index5 = message.indexOf("man", 12);
		System.out.println(index5);		// 21
		
//		찾는 문자가 없을 경우에는 -를 리턴한다.
		int index6 = message.indexOf("java");
		System.out.println(index6);		// -1
		
	}
}
