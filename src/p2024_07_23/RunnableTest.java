package p2024_07_23;

//스레드(Thread) : 1개의 프르세스를 구성하는 논리적인 작업단위
//Thread를 만드는 방법
//1.Thread 클래스를 상속 받아서 만드는 방법
//2.Runnable 인터페이스를 상속 받아서 만드는 방법

public class RunnableTest implements Runnable {
	
	@Override
	public void run() {		// 실행중인 상태
		for(int i=1; i<=20; i++) {
			System.out.println("number="+i);
		}
	}

	public static void main(String[] args) {
		RunnableTest tt = new RunnableTest();
		Thread t = new Thread(tt);
		t.start();	// 실행 가능한 상태 : run()메소드가 호출된다.
		System.out.println("--------> main thread end");
	}

}
