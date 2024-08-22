package p2024_07_15;

class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class Member01 {

	public static void main(String[] args) {
	
		Member user1 = new Member("홍길동", "hong");
	}

}
