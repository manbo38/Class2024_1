package p2024_07_11;

public class Study03 {

	public static void main(String[] args) {
		
//		while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고
//		눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		
		while(true) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1; 
		System.out.println("("+num1+", "+num2+")");
		
		if(num1+num2 == 5) {
			break;
		}

	}
		
	}

}
