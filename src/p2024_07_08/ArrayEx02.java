package p2024_07_08;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] score = {83, 90, 87};
		System.out.println("score[0]:"+score[0]);
		System.out.println("score[1]:"+score[1]);
		System.out.println("score[2]:"+score[2]);
		
		int sum = 0;
		for(int i=0; i<score.length; i++)
			sum += score[i];	// sum = sum + score[i]
		
		System.out.println("총점:"+sum);	// 총점:260
		
		double avg = (double)sum/3;	// 강제 형변환
		System.out.println("평균:"+avg);
		
//		평균값을 소숫점 2째자리까지 출력 하세요
		System.out.printf("평균:%.2f",avg);	// 평균:86.67
	}

}
