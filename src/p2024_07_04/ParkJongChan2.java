package p2024_07_04;

import java.util.Scanner;

public class ParkJongChan2 {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		while(w<=i) {
		System.out.println("입력한 정수의 팩토리얼:"+w*i);
		i++;
		
	}
  }
}
