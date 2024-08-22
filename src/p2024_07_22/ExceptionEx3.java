package p2024_07_22;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
							// args[0] = "5"	예외발생 안됨
							// args[0] = "a"	예외발생
							// args[0] = "0"	예외발생
		
		try {
			int data = Integer.parseInt(args[0]);
			System.out.println(var / data);
			
			
//		Exception 예외처리 클래스는 하위 예외처리 클래스들을 모두
//		받을 수 있기 때문에 가장 마지막에 사용해야 한다.
//		}catch(Exception e) {
//			System.out.println("Excetion 발생");
		}catch(NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println("Exception 발생");
		}
		System.out.println("프로그램 종료!");
	}

}
