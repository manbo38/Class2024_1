package p2024_07_04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요?");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input = sc.nextLine();	// 문자로 입력을 받는다.
			System.out.println("입력문자:" + input);
			
		}while(!input.equals("q"));
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
