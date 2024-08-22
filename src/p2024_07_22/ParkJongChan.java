package p2024_07_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkJongChan {

	public static void main(String[] args) {
		
		List<MemberInfo2> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String yg;
		String name, email, address;
		int age; 
		do {
			System.out.print("이름을 입력하세요.");
			name = sc.nextLine();
			System.out.print("나이를 입력하세요.");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("이메일을 입력하세요.");
			email = sc.nextLine();
			System.out.print("주소를 입력하세요.");
			address = sc.nextLine();
			
			MemberInfo2 m = new MemberInfo2();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);
			
			list.add(m);

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yg = sc.nextLine();
			if (yg.equals("y") || yg.equals("Y")) {
				continue;
			} else if (yg.equals("n") || yg.equals("N")) {
				break;
			}

		} while (true);

		for (int i = 0; i<list.size(); i++) {
            MemberInfo2 m = list.get(i);
            System.out.println("이름: " + m.getName());
            System.out.println("나이: " + m.getAge());
            System.out.println("이메일: " + m.getEmail());
            System.out.println("주소: " + m.getAddress());
		}
	}
}

class MemberInfo2 {

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
