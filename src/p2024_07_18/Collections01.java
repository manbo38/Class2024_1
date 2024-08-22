package p2024_07_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections01 {

	public static void main(String[] args) {
//		Set은 인터페이스이기 때문에 자체적으로 객체 생성 불가
//		Set s = new Set(); // 오류발생
		Set set = new HashSet();	// 업캐스팅
//		HashSet set = new HashSet();
		
		System.out.println("요소의 갯수->" + set.size());	// 0
		set.add("하나");
		set.add(2);
		set.add(3.14);
		set.add("넷");
		set.add("five");
		set.add(true);
		set.add(6);
		set.add(6);
		System.out.println("요소의 갯수->" + set.size());
//		입력한 순서대로 출력되지 않는다.
		System.out.println(set);
		
//		Iterator(반복자) : 하나, 2. 3.14, 넷, five, true, 6
		Iterator elements = set.iterator();
		while(elements.hasNext()) {
			System.out.print(elements.next()+"\t");
		}
	}

}
