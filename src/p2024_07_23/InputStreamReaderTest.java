package p2024_07_23;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
		InputStreamReader is = new InputStreamReader(System.in);
//		InputStreamReader : 2btye문자 1글자를 입력 받을 수 있는 입력 스트림
		
		int inputValue = 0;
		System.out.print("데이터 입력:");
		try {
			
			inputValue = is.read();	// 입력한 문자는 유니코드로 처리된다.
		}catch(IOException io) {
			System.out.print(io.getMessage());
		}
		System.out.println("데이터 입력 결과:" + inputValue);
		System.out.println("데이터 입력 결과:" + (char)inputValue);
	}

}
