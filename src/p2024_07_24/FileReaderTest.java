package p2024_07_24;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		FileReader file = null;
		int inputValue = 0;
		
		try {
			file = new FileReader("data.txt");		// 상대 경로
//			file = new FileReader("c:/data.txt");	// 절대 경로
			
//			read() : 파일의 끝을 만나면 -1을 리턴한다.
			while((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
			
			file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
