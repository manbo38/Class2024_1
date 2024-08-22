package p2024_07_04;

public class For06 {

	public static void main(String[] args) {
//		구구단 (2~9단)을 출력하는 프로그램을 작성하세요?
		
		for(int dan=2; dan<=9; dan++) {	// 바깥쪽 for문이 기준이 된다. 다중 for문 일 경우!
			
			System.out.println("["+dan+"단]");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.println();	// 각단 줄 간격 벌리기
	}
  }
}