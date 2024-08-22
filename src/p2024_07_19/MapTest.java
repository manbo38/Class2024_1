package p2024_07_19;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
//		Map은 인터페이스이기 때문에 자체적으로 객체 생성 불가
//		 Map m = new Map();			// 오류발생
		 Map m = new HashMap();		// 업캐스팅
		 HashMap hm = new HashMap();
		 
//		 put(Object key, Object value)
		 hm.put("뉴진스", "어도어");
		 hm.put("블랙핑크", "YG");
		 hm.put("age", new Integer(10));	// 업캐스팅+박싱
		 hm.put("에스파", "존예");
		 hm.put("에스파", "SM");		// 중복 key 사용
//		 중복된 key의 경우 마지막 value값만 출력된다.
		 
//		 순차적인 자료구조가 아니므로, 순서가 마음대로 출력된다.
		 System.out.println(hm);
		 
//		 키 값만 출력 (HashMap의 key를 구해온다.)
		 System.out.println(hm.keySet());
		 
//		 key를 이용해서 value값 구하기
//		 Object get(Object key)
		 System.out.println(hm.get("블랙핑크"));
		 System.out.println(hm.get("에스파"));
		 
		 Object obj = hm.get("에스파");
		 String str = (String) hm.get("에스파");	// 다운캐스팅(강제 형변환)
	
		 Integer it = (Integer)hm.get("age");	// 다운캐스팅(강제 형변환)
		 int age = it.intValue();				// 언박싱
		 
//		 다운캐스팅(강제 형변환) + 언박싱
		 int age2 = ((Integer)(hm.get("age"))).intValue();
	}
}
