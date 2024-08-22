package p2024_07_12;

import java.util.Scanner;

public class ParkJongChan6 {

	public static void main(String[] args) {
//	키보드를 통해서 주민번호를 입력 했을 때 유효한 주민번호인지 아닌지를
//	판별하는 프로그램을 작성하세요. (단, 유효하지 않은 주민번호의 경우에는 메시지를 출력)
		
		Scanner sc = new Scanner(System.in);
			System.out.println("주민등록번호 13자리를 입력 하세요?");
			String a = sc.nextLine();
			
			if(a.length() != 13) {
				System.out.println("올바르지 못 한 주민등록번호입니다.");
				return;
			}
			
			int[] num = new int[13];
			for(int i=0; i<a.length(); i++) {
				num[i] = (a.charAt(i));
			}

			
	}

}
