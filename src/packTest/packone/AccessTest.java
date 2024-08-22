package packTest.packone;

public class AccessTest {	// 부모 클래스
	private int a=10;		// private
	int	b=20;				// default
	protected int c=30;		// protected
	public int d=40;		// public

	public void print() {
		System.out.println("AccessTest의 print");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
