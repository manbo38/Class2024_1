package p2024_07_16.ex02;

//	부모 클래스의 필드는 자식 클래스로 상속된다.
//	protected 접근제한자 -> 상속할 때 많이 사용함
//	상속에서는 protected는 public과 같은 권한
class Point2D {						// 부모 클래스
	protected int x = 10;
	protected int y = 20;
}

class Point3D extends Point2D {		// 자식 클래스
	protected int z = 30;
	public void print() {
		System.out.println(x +", "+y+", "+z);
	}
}


public class SuperTest02 {

	public static void main(String[] args) {
//	보통 자식 클래스를 이용해서 객체를 생성한다.
		Point3D pt = new Point3D();
		pt.print();
	}

}
