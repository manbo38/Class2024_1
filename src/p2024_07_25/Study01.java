package p2024_07_25;

interface Tire {
	public void roll();

}

class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
	
}

class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

public class Study01 {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();
		
		mycar.run();
	}

}
