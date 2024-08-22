package p2024_07_12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println(sb1);
		
//		StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
//		String과 다르게 새로운 공간을 만들지 않고 값을 만들어서 값을 누적 시킬 수 있음
//		append 메소드는 String에는 없고 StringBuffer에만 있음
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println(sb1);
		System.out.println(sb2);
		
		if(sb1 == sb2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		sb1.append(1004);
		System.out.println(sb1);		// gemini is beautiful1004
		System.out.println(sb2);		// gemini is beautiful1004
		
//		sb1의 값을 대문자로 변환 해보자
//		StringBuffer 클래스를 String 클래스로 변환 시킨다.
		String str = new String(sb1);
		System.out.println(str.toUpperCase());
	}
}
