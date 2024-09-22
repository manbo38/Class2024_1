package p2024_07_17;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int)(var3*var2);
		System.out.println(var4);
		
		int value = 356;
		System.out.println(value-56);
		
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		}
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((float)lengthTop*lengthBottom*height);
		System.out.println(area);
		
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		String var4 = var2 + "." + var3;
		System.out.println("원의 넓이:" + var4);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = sc.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name != "java") {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		
		
		}

}
