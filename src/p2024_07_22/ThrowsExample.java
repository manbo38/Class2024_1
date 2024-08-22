package p2024_07_22;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
//	findClass()메소드를 호출한 곳에 예외처리를 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");	// 예외발생
	}

}
