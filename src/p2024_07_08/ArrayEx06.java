package p2024_07_08;

public class ArrayEx06 {

	public static void main(String[] args) {
//	향상된 for문, 확장 for문
//	형식 : for(변수 : 순차적인 자료구조(배열,컬렉션)) {
//				실행될 문장;
//	}
		int[] score = {95,71,84,93,87};
		
//		1. 기본 for문
		int sum = 0;
		for(int i=0; i<score.length; i++)
			sum += score[i];
		System.out.println("총합:"+sum);
		
//		2. 향상된 for문
		int sum1 = 0;
		for(int s : score)
			sum1 += s;
		System.out.println("총합:"+sum1);	
	}
}
