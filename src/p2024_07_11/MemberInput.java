package p2024_07_11;

import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public void print() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("이메일:"+email);
		System.out.println("주소:"+address);
	}
}

public class MemberInput {

	public static void main(String[] args) {

		System.out.println("회원정보를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		String na = sc.nextLine();
		int ag = sc.nextInt();
		sc.nextLine();
		String em = sc.nextLine();
		String ad = sc.nextLine();
		
		MemberInfo m = new MemberInfo(na, ag, em, ad);
		m.print();
	}
}
