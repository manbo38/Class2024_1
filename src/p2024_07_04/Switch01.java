package p2024_07_04;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

//		int s = 90;
		
//		switch(s) {
//			case 90 : System.out.println("A학점");
//						break;  // switch case문을 빠져 나가도록 해준다.
//			case 80 : System.out.println("B학점");
//						break;
//			case 70 : System.out.println("C학점");
//						break;
//			case 60 : System.out.println("D학점");
//						break;
//			default : System.out.println("F학점");
		
//			키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성하세요?
			System.out.println("0~100점 사이의 점수를 입력하세요?");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			
		switch(s/10) {
			case 10 :
			case 9 : System.out.println("A학점");
						break;
			case 8 : System.out.println("B학점");
						break;
			case 7 : System.out.println("C학점");
						break;
			case 6 : System.out.println("D학점");
						break;
			default : System.out.println("F학점");
		}
	}

}
