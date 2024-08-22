package p2024_07_19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
//		아이디와 비밀번호 검사하기
		Map<String, String> map = new Hashtable<String, String>();
		
//		아이디, 비밀번호
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디:");
			String id = sc.nextLine();
			System.out.print("비밀번호:");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {	// map에 사용자가 입력한 id가 있으면
				if(map.get(id).equals(password)) {	// 비번 일치시
					System.out.println("로그인되었습니다.");
					break;
				}else {								// 비번 불일치시
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				
			}
		}
	}

}
