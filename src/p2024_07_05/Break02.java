package p2024_07_05;

public class Break02 {

	public static void main(String[] args) {
//		무한루프 : while문
		
		int i=1;
		while(true) {
			System.out.println(i+"무한출력");
			if(i==100) break;
			i++;
		}
	}
}
