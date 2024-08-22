package p2024_07_08;

public class ArrayEx07 {

//	절대값을 구해주는 메소드 -> abs메소드
	static int abs(int data) {
		if (data < 0)
			data = -data;
	
		return data;
	}
	
	public static void main(String[] args) {
		
//		args[0] = "-10", args[1] = "-20"
		System.out.println("args[0]:"+args[0]);
		System.out.println("args[1]:"+args[1]);
		
//		문자를 숫자로 형변환 : "-10" -> 10
		int num = Integer.parseInt(args[0]);
		System.out.println("절대값:"+abs(num));	// abs()메소드 호출	
	}
}
