package p2024_07_23;

//	Thread를 이용해서 현재 시간을 1초에 한 번씩 출력하는 프로그램을 작성하세요?

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkJongChan implements Runnable {
	
	@Override
	public void run() {
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while(true) {
			Date d = new Date();
			System.out.println(Thread.currentThread().getName()+" : "+sd.format(d));
		try {
			
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}
}

	public static void main(String[] args) {
		
		ParkJongChan p = new ParkJongChan();
		Thread a = new Thread(p, "현재 시간");
		a.start();
		
		
	}

}
