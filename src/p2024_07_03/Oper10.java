package p2024_07_03;

public class Oper10 {

	public static void main(String[] args) {
		
		int a=10, b=10, c=10, d=10;
		int a1, b1, c1, d1;
		
		a1 = ++a; // 선행연산
		b1 = b++; // 후행연산 -> b1=b 라는게 먼저라고 생각하면 된다!
		c1 = --c; // 선행연산
		d1 = d--; // 후행연산 -> d1=d 라는게 먼저라고 생각하면 된다!
		System.out.println("a1="+a1+" a="+a);
		System.out.println("b1="+b1+" b="+b);
		System.out.println("c1="+c1+" c="+c);
		System.out.println("d1="+d1+" d="+d);
	}

}
