package p2024_07_23;

//	멀티 스레드 프로그램
public class ThreadLife implements Runnable {
	
	@Override
	public void run() {	// 실행중인 상태
		for(int i=1; i<21; i++) {
			System.out.println(Thread.currentThread().getName()+"number="+i);
		}
	}
	
	public static void main(String[] args) {
			
		ThreadLife t1 = new ThreadLife();
		
		Thread first = new Thread(t1, "first1");
		Thread second = new Thread(t1, "second1");
		Thread third = new Thread(t1, "third1");
		
		second.start();	// 실행 가능한 상태
		first.start();
		third.start();
	}

}
