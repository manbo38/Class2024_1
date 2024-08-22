package p2024_07_26;

import java.util.HashMap;

public class ParkJongChan {

	public static void main(String[] args) {
//		제네릭을 이용하여 String값을 Key로 하고,
//		Integer를 Value로 저장하는 HashMap 객체를 생성하는 코드를 작성하시오?
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("성시경", 80);
		m.put("이영현", 85);
		m.put("신승훈", 70);
		m.put("김건모", 75);
		System.out.println("총 Entry 수 :" + m.size());
		System.out.println("\t성시경:" + m.get("성시경"));
		System.out.println("\t이영현:" + m.get("이영현"));
		System.out.println("\t신승훈:" + m.get("신승훈"));
		System.out.println("\t김건모:" + m.get("김건모"));
			
	}

}
