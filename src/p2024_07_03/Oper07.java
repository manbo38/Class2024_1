package p2024_07_03;

import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		
		int n1, n2 , n3, n4, n5, total;
		double avg;
		System.out.println("5과목의 점수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		total = n1 + n2 + n3 + n4 + n5;  // 총점
		
		avg = total / 5.0; // 평균 -> 자동 형변환 형태
//		avg = (double)total / (double)5;  // 평균 -> 강제 형변환 형태
		System.out.println("avg:" + avg);
		
		if(n1>=40 && n2>=40 && n3>=40 && n4>=40 && n5>=40 && avg>=60) {
		    System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
