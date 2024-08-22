package p2024_07_04;

public class While04 {

	public static void main(String[] args) {
//	while문을 이용해서 구구단 (2~9단)을 출력하는 프로그램을 작성하세요.
	
		int dan=2, i;
		while(dan<=9) {
		System.out.println("["+dan+"단]");
		
		i=1;
		while(i<=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		dan++;
		System.out.println();	// 각단 줄 간격 벌리기
	}
 }
}