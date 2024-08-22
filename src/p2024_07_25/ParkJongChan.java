package p2024_07_25;

import java.util.TreeSet;

public class ParkJongChan {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
				
		while(ts.size()<6) {
			int a = (int)(Math.random()*45)+1;
			ts.add(a);	
		}System.out.println("출력된 로또 숫자:" + ts);
	}

}
