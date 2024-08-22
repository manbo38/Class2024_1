package p2024_07_19;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		
//		업캐스팅
//		1. 업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
//		2. 업캐스팅이 되면부모가 상속해준 메소드만 접근할 수 있다.
		Map h = new Hashtable();	// 업캐스팅
		Hashtable ht = new Hashtable();
		
//		put(Object key, Object value)
		ht.put("성시경", "Ballad");
		ht.put("이영현", "SOUL");
		ht.put("박정현", "R&B");
		
//		방법1. key를 알고 있는 경우
//		Object get(Object key)
//		Object obj = ht.get("박정현");
		String val = (String)ht.get("박정현");	// 다운캐스팅(강제 형변환)
		if(val != null) {
			System.out.println("박정현:" + val);
		}
		
		String s = (String)ht.get("성시경");
		String a = (String)ht.get("이영현");
		
//		방법2. key를 모르는 경우
//		열거형(Enumeration) : 성시경, 이영현, 박정현
		Enumeration Enum = ht.keys();		// Map의 모든 key를 구해온다.
		while(Enum.hasMoreElements()) {		// 가져올 key가 있으면 true리턴
			String k = (String)Enum.nextElement();	// k = "성시경"
			String v = (String)ht.get(k);			// v = "Ballad"
		
			System.out.println(k+":"+v);
		}
		
	}

}
