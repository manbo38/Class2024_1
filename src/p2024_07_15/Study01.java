package p2024_07_15;

public class Study01 {

	public static void main(String[] args) {
		
//		for문을 이용해서 주어진 배열의 항목에서 최대값과 최소값을 구하세요.
		int max, min;
		int[] array = {1,5,3,8,2};
		
//		0번방 기준으로 한다.
		max = array[0];
		min = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(max<array[i]) max = array[i];
			if(min>array[i]) min = array[i];
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	
	}
}
