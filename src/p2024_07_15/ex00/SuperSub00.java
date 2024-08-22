package p2024_07_15.ex00;

class Point2D {							// 부모 클래스(공통적인 코드)
	private int x;						// 필드
	private int y;
	
	public int getX() {					// 메소드
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

//	부모 클래스 안에 있는 필드와 메소드는 상속된다.
class Point3D extends Point2D {			// 자식 클래스
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	
	}
}

public class SuperSub00 {

	public static void main(String[] args) {

		Point3D pt = new Point3D();
		pt.setX(10);	// 상속 받아 사용
		pt.setY(20);	// 상속 받아 사용
		pt.setZ(30);	// 자기 클래스의 메소드 사용
		
		System.out.println(pt.getX()
				+", "+ pt.getY()
				+", "+ pt.getZ());
	}

}
