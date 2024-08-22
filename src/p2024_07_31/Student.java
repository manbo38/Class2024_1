package p2024_07_31;


// 학생 정보들을 저장하고, 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성
public class Student {
	
	private String name;
	private String no;
	
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	
	public String getName() {
		return name;
	}



	public String getNo() {
		return no;
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setNo(String no) {
		this.no = no;
	}


}
