package p2024_07_16;

class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

public class MemberServiceEx {

	public static void main(String[] args) {
		
		MemberService m = new MemberService();
		boolean result = m.login("hong","12345");
		if(result ) {
			System.out.println("로그인 되었습니다.");
			m.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
