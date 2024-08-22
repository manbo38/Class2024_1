package p2024_07_19;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest02 {

	public static void main(String[] args) {
		
//		제네릭을 설정해서 HashTable 객체를 생성하고 있으며, key의 자료형은
//		String형, value값의 자료형도 String형으로 설정하고 있다.
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "apple");
		ht.put("딸기", "strawberry");
		ht.put("포도", "grapes");
		
//		방법1. key를 알고 있는 경우
//		Object get(Object key)
//		제네릭이 설정되어 있으면, get() 메소드를 key를 이용해서 value값을
//		구해올 때 Object형을 자식 클래스형으로 형변환 할 때 제네릭으로 설정된
//		자료형(String)을 생략할 수 있다.
		String Val = ht.get("포도");	// String 자료형 생략 가능
		if(Val != null) {
			System.out.println("포도:" + Val);
		}
		
//		방법2. key를 모르는 경우
//		열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration<String> Enum = ht.keys();
		while(Enum.hasMoreElements()) {
			String k = Enum.nextElement();
			String v = ht.get(k);
			System.out.println(k+":"+v);
		}
	
	
	}

}
