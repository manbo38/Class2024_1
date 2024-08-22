package p2024_07_05;

public class Break03 {

	public static void main(String[] args) {
//		랜덤으로 난수 발생하게 되고, 6이 나오게 되면 그때 멈추게 되는 것
		int i=0;
		while(true) {
			i++;
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			
			if(num == 6) break;
		}
		System.out.println("루프횟수:" + i);
		System.out.println("프로그램 종료");
	}

}
