package p2024_07_15;

import java.util.Scanner;

public class MemberInput2 {

	public static void main(String[] args) {

		MemberInfo2[] m = new MemberInfo2[3];
		int i = 0;
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

			m[i] = new MemberInfo2();
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yg = sc.nextLine();
			if (yg.equals("y") || yg.equals("Y")) {
				continue;
			} else if (yg.equals("n") || yg.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("이름:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("이메일:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
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
