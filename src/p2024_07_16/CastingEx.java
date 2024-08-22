package p2024_07_16;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {

//		자동 형변환(업 캐스팅)
//		1. 자식클래스에서 부모클래스로 형변환 하는 것이다.
//		2. 참조 가능한 영역이 축소가 된다.
//		3. 컴파일러에 의해서 자동 형변환이 된다. 
		
//		ex1.
//		Calendar c = new CalendarEx();	// 오류발생(추상 클래스) -> Calendar는 자체적으로 객체 생성이 되지 않는다.
		Calendar c = Calendar.getInstance();
		
		Calendar c1 = new GregorianCalendar();	// 업캐스팅
		GregorianCalendar c2 = new GregorianCalendar();	// 업캐스팅
		
//		ex2.	// List 인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		List li = new List();			// 오류발생
		
		List list = new ArrayList();	// 업캐스팅
		ArrayList a1 = new ArrayList();	// 업캐스팅
		
//		ex3.
//		add(Object e)
		list.add(10);		// Object e = new Integer(10) -> 박싱+업캐스팅
		list.add(3.14);		// Object e = new Double(3.14) -> 박싱+업캐스팅
		list.add('j');		// Object e = new Character('j') -> 박싱+업캐스팅
		list.add(true);		// Object e = new Boolean(true) -> 박싱+업캐스팅
		list.add("자바");		// Object e = new String("자바") -> 박싱+업캐스팅
		
//		boolean equals (Object an)
		
//		Obejct an = new String("java");		// 업캐스팅
		if("java".equals(new String("java"))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Obejct an = new Integer(30);		// 업캐스팅 + 박싱
//		Obejct an = 30;						// 업캐스팅 + 자동박싱
		if(new Integer(30).equals(new Integer(30))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Obejct an = new Double(3.14);		// 업캐스팅 + 박싱
//		Obejct an = 3.14;					// 업캐스팅 + 자동박싱
		if (new Double(3.14).equals(new Double(3.14))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");	
		}
		
//--------------------------------------------------------------------------------------------------------------
//		강제 형변환(다운 캐스팅)
//		1. 부모클래스에서 자식클래스로 형변환 하는 것이다.
//		2. 참조 가능한 영역이 확대가 된다.
//		3. 컴파일러에 의해서 자동 형변환이 되지 않기 때문에 프로그래머가 직접 강제 형변환을
//			해야 하며, 강제 형변환시 자료형을 생략할 수 없다.
		
//		ex1.
		List lt = new ArrayList();		// 업캐스팅
		
//		add(Object e)
		lt.add(new String("뉴진스"));		// 업캐스팅
		lt.add(("아이브"));
		lt.add(("블랙핑크"));
		lt.add(("르세라핌"));
		lt.add(("스테이씨"));
		lt.add(("에스파"));
		
//		Object get(int index)
		
		Object obj = lt.get(0);
		String s = (String)lt.get(0);	// 다운 캐스팅 (강제 형변환)
		
		for(int i=0; i<lt.size(); i++) {
//			Object get(int index)
			String str = (String)lt.get(i);	// 다운 캐스팅 (강제 형변환)
			System.out.println(str);
		}
		
//		ex2.
		List ls = new ArrayList();

//		add(Object e)
		ls.add(10);						// 업캐스팅+자동박싱
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);
		
//		Object get(int index)
		for(int i=0; i<ls.size(); i++) {
//			Object e = ls.get(i)
			
			Integer it = (Integer)ls.get(i);	// 다운 캐스팅
			int n = it.intValue();				// 언박싱
			
			int n2 = ((Integer)ls.get(i)).intValue();	// 다운 캐스팅+언박싱
			System.out.println(n2);
		}
	}
}
