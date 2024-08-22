package p2024_07_19;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

	public static void main(String[] args) {
		
//		큐(Queue) : FIFO구조
		Queue myQue = new LinkedList();		// 업캐스팅
		LinkedList myQue2 = new LinkedList();
		
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");
		
		System.out.println(myQue.poll());	// 1-자바
		System.out.println(myQue.poll());	// 2-C++
		System.out.println(myQue.poll());	// 3-API
		System.out.println(myQue.poll());	// 4-MFC
		System.out.println(myQue.poll());	// null
//		큐(Queue)가 비어 있으면 null값을 리턴한다.
		
		while(myQue.peek() != null) {	// 큐가 비어있지 않다면
			System.out.println(myQue.poll());	// 큐에서 데이터를 꺼내온다.
		}
	}

}
