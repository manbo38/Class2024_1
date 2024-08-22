package p2024_07_24;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("data.txt");		// 원본파일
			FileWriter fw = new FileWriter("data1.txt");	// 복사본 파일
			int input = 0;
			
//			read() : 파일의 끝을 만나면 -1을 리턴한다.
			while((input=fr.read()) != -1) {
				System.out.print((char) input);
				fw.write(input);
			}
			fr.close();
			fw.close();
		}catch(IOException io) {
			System.out.println(io);
		}
	}

}
