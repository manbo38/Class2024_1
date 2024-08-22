package p2024_07_23;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest2 {

	public static void main(String[] args) {
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		int inputValue = 0;
		char[] temp = new char[10];
		
		System.out.print("데이터 입력:");
		
		try {
			
//			키보드로 입력한 값은 temp 배열에 저장된다.
			inputValue = is.read(temp);
		}catch(IOException io) {
			io.printStackTrace();
		}
		System.out.println("데이터 입력:" + inputValue);
		
		for(int i=0; i<inputValue; i++) {
			System.out.print(temp[i]);
		}
		
		System.out.println("char[]->String:" + new String(temp));
	}

}
