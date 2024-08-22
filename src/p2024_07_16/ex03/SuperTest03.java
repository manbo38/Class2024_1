package p2024_07_16.ex03;

//	은닉 변수를 사용하려면 슈퍼 클래스 super를 사용할 수 있다.
class Point2D {				// 부모 클래스
	protected int x = 10;	// 자식 클래스에서 x,y를 재정의하면 부모 클래스의 x,y의 은닉변수가 된다.
	protected int y = 20;	// 은닉변수 or 쉐도우 변수
}

class Point3D extends Point2D {	// 자식 클래스
	protected int x = 40;		// 부모 클래스에 존재하는 멤버변수를 자식 클래스에 다시 한 번 정의함
	protected int y = 50;
	
	protected int z = 30;
	
	public void print() {
		System.out.println(x+","+y+","+z);	// 자식 클래스의 재정의된 x,y가 출력
	}										// 40, 50, 30
}

public class SuperTest03 {

	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
	}

}
