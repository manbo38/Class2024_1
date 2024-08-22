package p2024_07_17.ex04;

abstract class ShapeClass {		// 부모 클래스
	abstract void draw();		// 추상 메소드
}
class Circ extends ShapeClass {	// 자식 클래스
	@Override
	void draw() {	// 메소드 오버라이딩
		System.out.println("원을 그린다.");
	}
}
class Rect extends ShapeClass {	// 자식 클래스
	@Override
	void draw() {	// 메소드 오버라이딩
		System.out.println("사각형을 그린다.");
	}
}
class Tria extends ShapeClass {	// 자식 클래스
	@Override
	void draw() {	// 메소드 오버라이딩
		System.out.println("삼각형을 그린다");
	}	
}

public class AbstractTest04 {

	public static void main(String[] args) {
		ShapeClass c = new Circ();	// 업캐스팅 (자동 형변환)
		ShapeClass r = new Rect();	// 업캐스팅 (자동 형변환)
		ShapeClass t = new Tria();	// 업캐스팅 (자동 형변환)
		c.draw();
		r.draw();
		t.draw();
	}

}
