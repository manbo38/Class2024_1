package p2024_07_04;

public class DoWhile02 {

	public static void main(String[] args) {
//	do~while문으로 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성 하세요.
		
		int i=1, odd=0, even=0;
		do {
			if(i%2 == 1) {
				odd++;
			} else {
				even++;
			}
			i++;
		}while(i<=100);
		System.out.println("1~100까지 홀수의 합=" + odd);
		System.out.println("1~100까지 짝수의 합=" + even);
	}

}
