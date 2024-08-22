package p2024_07_10;

class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
//	매개변수로 전달받은 값을 배열로 받아서 처리한다.
	int sum2(int ...values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
	}
		return sum;
  }
}

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer mycom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = mycom.sum1(values1);	// sum1() 메소드 호출
		System.out.println("result1:" + result1);
		
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});	// sum1() 메소드 호출, 1번만 사용 가능, 주소값이 없음
		System.out.println("result2:" + result2);
		
		int result3 = mycom.sum2(1,2,3);	// sum2() 메소드 호출
		System.out.println("result3:" + result3);
		
		int result4 = mycom.sum2(1,2,3,4,5);	// sum2() 메소드 호출
		System.out.println("result4:" + result4);
	}

}
