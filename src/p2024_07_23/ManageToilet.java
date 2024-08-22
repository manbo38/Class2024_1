package p2024_07_23;

public class ManageToilet {

	public static void main(String[] args) {
		Toilet t = new Toilet();
		
		Family father = new Family("아버지", t);
		Family mother = new Family("어머니", t);
		Family sister = new Family("누나", t);
		Family brother = new Family("형", t);
		Family me = new Family("나", t);
		
		father.start();		// 실행 가능한 상태
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}

class Family extends Thread {
	
	Toilet toilet;
	String who;
	boolean key;	// 초기값 : false
	
	public Family(String name, Toilet t) {
		who = name;
		toilet = t;
	}
	
	public void run() {
		toilet.openDoor(who, key);
	}
}


class Toilet {
//	메소드의 동기화 기법
//	1. synchronizer로 선언된 openDoor()메소드는 한개의 스레드가 실행이 끝나야
//	다음 스레드가 실행이 되도록 만들어 준다.
	public synchronized void openDoor(String name, boolean b) {
//		public void openDoor(String name, boolean b) {
		if(b==false) {
			System.out.println(name);
			usingTime();
			System.out.println("아~! 시원해");
			System.out.println();
		}else {
			System.out.println("사용중");
		}
	}
	public void usingTime() {
		for(int i=0; i<1000000000; i++) {
			if(i==10000) {
				System.out.println("끄으응");
			}
		}
	}
	
}
