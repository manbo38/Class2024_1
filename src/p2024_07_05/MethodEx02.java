package p2024_07_05;

public class MethodEx02 {

//	1~n 까지의 합을 구하는 메소드
	static void sum(int n) {
		int hap=0;
		for(int i=1; i<=n; i++) {
			hap +=i;	// hap = hap + i
	}
	System.out.println("1~"+n+"="+hap);
}	
	public static void main(String[] args) {
		sum(3);
		sum(5);
		sum(10);
		sum(30);
		sum(100);
		sum(1000);
		sum(10000);
	}

}
