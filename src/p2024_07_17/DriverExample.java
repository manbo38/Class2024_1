package p2024_07_17;


class Vehicle {		// 부모 클래스
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}
	
class Driver {
	public void drive(Vehicle vehicle) {	// 매개변수의 자료형이 부모 클래스인 경우 자식 객체를 전달?
		vehicle.run();
	}
}

class Bus extends Vehicle {	// 자식 클래스
	@Override
	public void run() {		// 메소드 오버라이딩 -> 메소드 오버라이딩 된 메소드만 사용 가능함 / 부모 클래스의 메소드는 사용X
		System.out.println("버스가 달립니다.");
	}
}
	
class Texi extends Vehicle {	// 자식 클래스
	@Override
	public void run() {			// 메소드 오버라이딩
		System.out.println("택시가 달립니다.");
	}
}

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
//		매개 변수의 다형성			// 업캐스팅 (자동 형변환)
		driver.drive(bus);		// Vehicle vehicle = new Bus(); -> 자식 객체를 부모 클래스에 전달한다.
		driver.drive(texi);		// Vehicle vehicle = new Texi(); -> 자식 객체를 부모 클래스에 전달한다.
	}

}
