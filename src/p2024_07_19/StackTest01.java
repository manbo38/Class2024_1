package p2024_07_19;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
//		Stack : LIFO구조
		Stack myStack = new Stack();
		
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");
		
		System.out.println(myStack.pop()); 	// 4-MFC
		System.out.println(myStack.pop()); 	// 3-C++
		System.out.println(myStack.pop()); 	// 2-API
		System.out.println(myStack.pop()); 	// 1-자바
		System.out.println(myStack.pop()); 	// EmptyStackException
//		Stack이 있으면 EmptyStackException이 발생한다.
		
		while(!myStack.isEmpty()) {		// Stack이 비어있지 않으면
			System.out.println(myStack.pop());
		}
		
	}

}
