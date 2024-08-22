package p2024_07_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();	// 업캐스팅
//		ArrayList list = new ArrayList();
		
		list.add("하나");
		list.add(2);
		list.add(3.14);
		list.add("넷");
		list.add("five");
		list.add(6);
		System.out.println(list);
		
		System.out.println(list.get(2));	// 인덱스 2번 원소 추출
		System.out.println(list.get(4));	// 인덱스 4번 원소 추출
		
//		Object get(int index)
		for(int i=0; i<list.size(); i++) {
			Object s = list.get(i);
//			String str = (String)list.get(i);
			
			System.out.print(s+"\t");
		}
		System.out.println();
		
//		향상된 for문
		for(Object s : list) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
//		반복자 : 하나, 2, 3.14, 넷, five, 6
		Iterator elements = list.iterator();
		while(elements.hasNext()) {	// 가져올 데이터가 있으면 true
			System.out.print(elements.next()+"\t");
		}
	}

}
