package p2024_07_05;

public class Break01 {

	public static void main(String[] args) {
//		무한루프 : for문
//		break : 반복문을 빠져 나오는 역할
		
		for(int i=1;;i++) {
			System.out.println(i+"무한출력");
			if(i==100) break;
//			for(;;) -> 무한루프
		}
	}

}
