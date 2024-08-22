package p2024_07_11;

public class StringTest00 {

	public static void main(String[] args) {
		
		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		
		if(str1 == str2) {		// 주소 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");		// 다른 주소
		}
		
		if(str3 == str4) {		// 주소 비교
			System.out.println("같은 주소");		// 같은 주소
		}else {
			System.out.println("다른 주소");
		}
		if(str1 == str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");		// 다른 주소
		}
		if(str1.equals(str3)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		

	}

}
