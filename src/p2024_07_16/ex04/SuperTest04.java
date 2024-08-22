package p2024_07_16.ex04;

class Point2D {				// 부모 클래스
	protected int x = 10;	// 은닉변수 or 쉐도우 변수
	protected int y = 20;	
}

class Point3D extends Point2D {	// 자식 클래스
	protected int x = 40;		// 부모 클래스에 존재하는 멤버변수를 자식 클래스에 다시 한 번 정의함
	protected int y = 50;
	
	protected int z = 30;
	
	public void print() {
		System.out.println(x+", "+y+", "+z);	// 자식 클래스의 재정의된 x,y가 출력
	}										// 40, 50, 30
	public void print02() {
		System.out.println(super.x+", "+super.y+", "+z);	// super를 이용해서 부모 클래스의 x,y 출력
	}														// 10, 20, 30
}

public class SuperTest04 {

	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
		pt.print02();
	}

}
