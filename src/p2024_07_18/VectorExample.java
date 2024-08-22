package p2024_07_18;

import java.util.List;
import java.util.Vector;

//	DTO(Data Transfer Object)
class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

}


public class VectorExample {

	public static void main(String[] args) {
		
//		제네릭(Generic) : Board클래스로 만든 객체만 저장할 수 있다.
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));	// 업캐스팅
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
//		제네릭이 설정되어 있는 경우에는 get()메소드로 데이터를 구해올 때
//		제네릭으로 설정된 자료형(Board)은 생략 할 수 있다.
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);				// 다운캐스팅
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
	}

}
