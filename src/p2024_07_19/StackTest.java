package p2024_07_19;

import java.util.Date;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
//		Stack : LIFO구조
		Stack s = new Stack();
		System.out.println(s.empty());	// Stack이 비어 있으면 true
		
//		push(Object e)
		s.push("gemini");
//		Date d = new Date();
		s.push(new Date());
		s.push(new Integer(10));
		s.push("johnharu");
		
		System.out.println(s.empty());	// false
		
//		peek() : 가장 마지막에 입력한 값을 구해온다.
		System.out.println(s.peek());	// johnharu
		
//		pop() : 가장 마지막에 입력한 값을 제거한다.
		System.out.println(s.pop());	// johnharu
		System.out.println(s.pop());	// johnharu
		System.out.println(s.pop());	// johnharu
		System.out.println(s.pop());	// johnharu
		
		System.out.println(s.empty());	// true
	}

}
