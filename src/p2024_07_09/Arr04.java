package p2024_07_09;

public class Arr04 {

	public static void main(String[] args) {
//		2차원 배열
//		행 : 학생번호(1~5번)
//		열 : 과목(국어, 영어, 수학)
		int[][] score = {{85,60,70},
				         {90,95,80},
				         {75,80,100},
				         {80,70,95},
				         {100,65,80}
						};
		int[] subject = new int[3];	// 과목별 총점
		int[] student = new int[5];	// 학생별 총점
		// subject[0]=0, subject[1]=0, subject[2]=0
		
		System.out.println("각 과목별 총점구하기");
		for(int c=0; c<3; c++) {		// 과목
			for(int r=0; r<5; r++) {	// 학생
				subject[c] += score[r][c];
			}
			System.out.println(subject[c]);
	}
		
		System.out.println("학생별 총점구하기");
		for(int r=0; r<5; r++) {
			for(int c=0; c<3; c++) {
				student[r] += score[r][c];
			}
			System.out.println(student[r]);
		}
	}
}
