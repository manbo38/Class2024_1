package p2024_07_18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();	// 업캐스팅
		
		list.add("동방신기");
		list.add("슈퍼주니어");
		list.add("SS501");
		list.add(2, "신화");	// 인덱스 2번에 신화 삽입
		list.add("GOD");
		
		int size = list.size();		// size() : 컬렉션의 원소(객체)의 갯수
		System.out.println("총 객체 수:" + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:" + skill);
		System.out.println();
		
//		Object get(int index)
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("GOD");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
