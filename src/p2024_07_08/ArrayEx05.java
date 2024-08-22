package p2024_07_08;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] scores;	// heap메모리 상의 주소를 할당 받지 못한상태
		scores = new int[] {83,90,87};	// 주소를 할당 받은 상태
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합1:"+sum1);	// 총합 : 260
		
//		add 메소드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합2:"+sum2);
	}
	
	
//	사용자 정의 메소드 : 합을 구해주는 역할
	public static int add(int[] scores) {	// 정적 메소드
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;	// return문은 add메소드를 호출한 곳에 값을 돌려주는 역할
		
	}
}
