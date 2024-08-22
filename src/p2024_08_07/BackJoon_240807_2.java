package p2024_08_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJoon_240807_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		for (int i=0; i<a; i++) {
			String[] numbers = br.readLine().split(" ");
			int b = Integer.parseInt(numbers[0]);
			int c = Integer.parseInt(numbers[1]);
			
			bw.write((b+c) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
