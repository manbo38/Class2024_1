package p2024_07_24;

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		int inputValue = 0;
		FileInputStream file = null;
		
		try {
//			file = new FileInputStream("read.txt");		// 상대 경로
			file = new FileInputStream("c:/read.txt");	// 절대 경로
			
//			read() : 파일의 끝을 만나면 -1을 리턴한다.
			while((inputValue = file.read())!= -1) {
				System.out.print((char) inputValue);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				if(file != null) file.close();
			}catch(Exception e) {}
		}
	}

}
