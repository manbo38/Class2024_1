package p2024_07_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
//		키보드로 구구단 1개단을 입력 받아서, 해당 구구단을 출력하는
//		프로그램을 작성하세요?
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 단을 입력하세요.");
		
		try {
			String input = b.readLine();
			int dan = Integer.parseInt(input);
			
			for(int i=0; i<=9; i++)
				System.out.println(dan+"*"+i+"="+dan*i);
			
		}catch(Exception io) {
			io.printStackTrace();
			System.out.println("숫자만 입력하세요.");
		}
						
	}

}
