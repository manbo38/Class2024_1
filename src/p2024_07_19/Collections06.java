package p2024_07_19;

import java.util.Vector;

public class Collections06 {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		
//		boolean add(Object e)
		vec.add("apple");
		vec.add("banana");
		vec.add("orange");
//		vec.add(50);	// String형 데이터만 저장할 수 있다.
		
//		제네릭을 사용하게 되면, 자료구조에서 데이터를 구해올때 제네릭으로
//		설정된 자료형(String) 생략 가능
		String temp;
		for(int i=0; i<vec.size(); i++) {
			temp = vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}

}
