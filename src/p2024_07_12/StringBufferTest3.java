package p2024_07_12;

public class StringBufferTest3 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);
		
//		index 10번 위치에 very 문자를 삽입 시킨다.
		sb1.insert(10, "very");		// gemini is verybeautiful
		System.out.println(sb1);
		
		sb1.insert(0, 1004);		// 1004gemini is verybeautiful
		System.out.println(sb1);
	}

}
