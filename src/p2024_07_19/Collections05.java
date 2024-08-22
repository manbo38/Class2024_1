package p2024_07_19;

import java.util.Vector;

public class Collections05 {

	public static void main(String[] args) {
		
//		제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장할 수 있다.
		Vector vec = new Vector();
		
//		boolean add(Object e)
		vec.add("apple");
		vec.add("banana");
		vec.add("orange");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);
		
//		Object get(int index)
		String temp;
		for(int i=0; i<vec.size(); i++) {
//			제네릭을 사용하지 않을 때는 값을 구해올 때 자료형을 생략할 수 없다.
			temp = (String)vec.get(i);	// 다운 캐스팅
//			temp = vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}

}
