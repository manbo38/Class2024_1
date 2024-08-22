package p2024_07_31;

//	피보나치 수열을 출력하라
public class Pbonachi {

	public static void main(String[] args) {
		
		int []arr = new int[100];
		
//		An = An-1 + An-2; n>=3
//		a1 = 1, a2 = 1
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			
		}
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
//		2번째 방법
//		An
//		An = An-1 + An-2; n>=3
//		a1 = 1, a2 = 1
		int prevNum = 1; // An-2
		int pre = 1;	 // An-1
		System.out.print(prevNum+" ");
		System.out.print(pre+" ");
		
		for(int i=3; i<=10; i++) {
			int Nnum = prevNum+pre;
			System.out.print(Nnum+" ");
			
			prevNum = pre;
			pre = Nnum;
		}
	}

}
