package p2024_07_04;

public class Study04 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;	// 오류 발생 (허용 범위 벗어남)
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		System.out.println();
		
		long var7 = 10;
		long var8 = 20L;
//		long var9 = 1000000000000;	// 오류 발생
		long var10 = 10000000000000L;
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var10);
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
	}

}
