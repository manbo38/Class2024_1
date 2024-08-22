package p2024_07_05;

public class Continue01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i==5) continue;
			System.out.println("출력:"+i);
		}
	}
}