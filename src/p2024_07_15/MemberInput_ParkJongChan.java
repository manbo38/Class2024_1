package p2024_07_15;

import java.util.Scanner;

public class MemberInput_ParkJongChan {

	public static void main(String[] args) {
		
		MemberInfo m = new MemberInfo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String na = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int ag = sc.nextInt();
		sc.nextLine();
		System.out.println("이메일을 입력하세요.");
		String em = sc.nextLine();
		System.out.println("주소를 입력하세요.");
		String ad = sc.nextLine();
		
		m.setName(na);
		m.setAge(ag);
		m.setEmail(em);
		m.setAddress(ad);
		
		System.out.println("이름:" + m.getName());
		System.out.println("나이:" + m.getAge());
		System.out.println("이메일:" + m.getEmail());
		System.out.println("주소:" + m.getAddress());
		
	}

}

class MemberInfo {
	
	private String name;
	private int age;
	private String email;
	private String address;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}