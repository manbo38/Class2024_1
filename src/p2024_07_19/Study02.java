package p2024_07_19;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
//		int max = 0;
//		int[] array = {1, 5, 3, 8, 2};
//		
//		for(int i=0; i<array.length; i++) {
//			if(array[i] > max) max = array[i];
//		}
//		System.out.println("max:" + max);
		
		
//		int [][] array = {{95,86},
//						  {83,92,96},
//						  {78,83,93,87,88}};
//		
//		int sum = 0;
//		double avg = 0.0;
//		
//		int a = 0;
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				sum += array[i][j];
//				a++;
//			}
//		}
//		avg = (double) sum / a;
//		
//		System.out.println("sum:" + sum);
//		System.out.println("avg:" + avg);
		
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
			System.out.println("----------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]: " + scores[i]);	
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i=0; i<scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
			System.out.println("프로그램 종료");
		
	}

}
