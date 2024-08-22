package p2024_07_23;

public class ThreadPriorityControl implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println(Thread.currentThread().getName()+"number="+i);
		}
	}

	public static void main(String[] args) {
		
		ThreadPriorityControl t1 = new ThreadPriorityControl();
		
		Thread first = new Thread(t1, "first1");
		first.setPriority(Thread.MIN_PRIORITY);
		System.out.println("first priority=" + first.getPriority());	// 1
		
		Thread second = new Thread(t1, "second1");
		second.setPriority(Thread.MAX_PRIORITY);
		System.out.println("second priority=" + second.getPriority());	// 10
		
		Thread third = new Thread(t1, "third1");
		System.out.println("third priority=" + third.getPriority());	// 5
		
		
//		Thread의 우선 순위 → 프로그램에서 우선 순위를 지정하지 않으면 우선 순위가 5로 설정되어 있다.
//	    - 최고순위 - MAX_PRIORITY : 10
//	    - 순위 미지정 - NORM_PRIORITY : 5
//	    - 최저순위 - MIN_PRIORITY : 1
		
		second.start();	// 실행 가능한 상태
		first.start();
		third.start();
	}

}
