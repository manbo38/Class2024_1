package p2024_07_15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {

	private Frame f;
	
	public FrameTest() {
		f = new Frame("Frame Test");
		f.setSize(400, 300);		// 사이즈
		f.setLocation(100, 100);	// 위치 값
		f.setBackground(Color.green);	// 색상
		f.setVisible(true);			//
		f.setResizable(false);		//
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		// 프로그램을 종료하는 메소드
			}
		});
	}
	
	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
	}
}
