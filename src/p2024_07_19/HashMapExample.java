package p2024_07_19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
//		학생 이름과 학생 점수를 저장하기 Map 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		put(Object key, Object key)		// 업캐스팅(자동 형변환)
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// key가 중복되면 가장 마지막의 value값만 사용할 수 있다.
		System.out.println("총 Entry 수:" + map.size());
		
//		객체 검색 : // Object get(Object key)
		System.out.println("\t홍길동:" + map.get("홍길동"));
		System.out.println();
		
//		객체를 하나씩 처리
		Set<String> keySet = map.keySet();
//		반복자(Iterator) : 신용권, 홍길동, 동장군
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수:" + map.size());
		
//		객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext())	{
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수:" + map.size());		
	}

}
