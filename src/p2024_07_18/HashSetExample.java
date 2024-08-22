package p2024_07_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// 중복된 데이터는 저장되지 않는다.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수:" + size);	// 총 객체 수 : 4
		
//		반복자 iterator : 
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element+"\t");
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수:" + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.print(element+"\t");
		}
		
		set.clear();	// 모든 객체를 삭제하고 컬렉션을 비워준다.
		if(set.isEmpty()) {System.out.println("비어 있음");}	// empty -> 비어 있는지 확인
	}

}
