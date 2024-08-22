package p2024_07_24;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ParkJongChan {

	public static void main(String[] args) {

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문장을 입력하세요.");
		
		try {
			String oo = b.readLine();
			FileWriter fps = new FileWriter("result.txt");
			
				fps.write(oo);
				fps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
