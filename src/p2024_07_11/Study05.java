package p2024_07_11;

public class Study05 {

	public static void main(String[] args) {
		
//		*를 하나씩 증감시키면서 총 4개 출력
//		for(int i=1; i<5; i++) {
//		for(int s=1; s<=i; s++) {
//			System.out.print("*");
//			if(s==i) {
//				System.out.println();
//			}
//		}
//		}
		
		
//		*를 오른쪽에서부터 하나씩 증감시키면서 총 4개 출력
		for(int i=1; i<5; i++) {
			for(int s=4; s>0; s--) {
				if(i<s) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
