package p2024_08_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJoon_240826_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		while(count < 100) {
			String s = br.readLine();
			if(s == null || s.equals("")) {
				break;
			}
			bw.write(s);
			bw.newLine();
			
			s.trim();
			count++;
		}
		br.close();
		bw.close();
		
	}

}
