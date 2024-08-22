package p2024_07_09;

public class Animal {
	
	int age;			// 필드(field), 멤버변수, 전역변수 : heap 영역에 저장
	                	// : 메소드 바깥쪽에 정의되는 변수
	
	public Animal() {   // 기본 생성자(Default Constructor)
						// : 매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}	

	public static void main(String[] args) {

		int a = 10;		//   지역 변수: stack 영역에 저장
		
		String str = new String("자바");
		
		Animal  a1       =   new     Animal();
//		클래스   레퍼런스변수     연산자   생성자 호출
		
//		System.out.println(age);     	// 에러발생
		System.out.println(a1.age);     // 0
		
		a1.age = 5;						// age값을 5로 수정
		System.out.println(a1.age);     // 5
		
		Animal a2 = new Animal();
		System.out.println(a2.age);     // 0
		
		if(a1 == a2) {	 // 주소 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
	}

}



