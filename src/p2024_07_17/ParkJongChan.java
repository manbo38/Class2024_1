package p2024_07_17;

//	1차원 배열 사용 해야함
//	1~45 사이의 숫자를 6개 추출하는 프로그램을 작성 하세요
//	1. 중복된 숫자는 1번만 출력 되도록 한다.
//	2. Math.random() 사용 해야 함
//	3. 가능하면 오름차순으로 정렬 해보자

public class ParkJongChan {

	public static void main(String[] args) {
		
		int[] c = new int[6];
		int num = 0;
		
		while(num<6) {
			int a = (int)(Math.random()*45)+1;
			boolean b = false;
		
		for(int i=0; i<num; i++) {
			if(c[i] == a) {
				b = true;
				break;
			}
		}
		
		if(!b) {
			c[num] = a;
			num++;
			System.out.println("add number:" + a);
		}
	}
		
		for(int i=0; i<num; i++) {
			System.out.print(c[i]+" ");
			
		}
	}
}
