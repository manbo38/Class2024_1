package p2024_07_08;

import java.util.Scanner;

public class ParkJongChan4 {

	public static void main(String[] args) {
//	키보드를 이용해서 정수 5개를 입력 받은 후 int형 배열에 저장한다.
//	이 때 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요.
		int[] score = new int [5];
		System.out.println("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		int max, min;
		max = score[0];
		min = score[0];
		for(int i=1; i<score.length; i++) {
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
		}
			System.out.println("max:"+max);
			System.out.println("min:"+min);
		}
}
