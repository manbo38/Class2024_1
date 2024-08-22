package p2024_07_26;

public class ParkJongChan2 {

	public static void main(String[] args) {
//		60과 24의 최대 공약수를 구하는 프로그램을 작성 하시오?
//		60,24의 최대 공약수 -> 12
		
//		int a = 60 / 5;
//		System.out.println(a);
//		
//		int b = 24 / 4;
//		System.out.println(b);
//		
//		int c = a / 2;
//		System.out.println(c);
//		
//		int d = b / 3;
//		System.out.println(d);
//		
//		System.out.println("60과 24의 최대 공약수는" + c*d + "입니다.");
		
		
		int a = 60;
		int b = 24;
		int c = 0;
		
		for(int i=1; i<=60; i++) {
			if(a%i == 0 && b%i == 0) {
				c = i;	
			}System.out.println(c);
		}
	}

}
