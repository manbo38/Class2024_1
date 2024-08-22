package p2024_07_03;

public class Oper04 {

	public static void main(String[] args) {

		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		
//		비교 연산자로 주소값을 비교
		if(str1 == str2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(str1 == str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
//		값을 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
