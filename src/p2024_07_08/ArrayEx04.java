package p2024_07_08;

public class ArrayEx04 {

	public static void main(String[] args) {
//	배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요.
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.5};
		
		double max, min;
		
//		0번 방에 있는 값을 기준으로 한다.
		max = data[0];
		min = data[0];
		
		for(int i=1; i<data.length; i++) {
			if(data[i]>max)	max = data[i];
			if(data[i]<min)	min = data[i];
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
