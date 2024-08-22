package p2024_07_02;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
// 변수 : 메모리 상에 데이터를 저장하기 위한 기억 공간의 이름
// 변수를 만드는 방법 : 자료형 변수명 = 데이터(값);
		
// 기본 자료형 변수
// 1. 정수형 변수
		byte b1 = 10;  // -128 ~ 127
//		byte b2 = 130; // 오버플로우 발생 (오류 발생)
		short s = 100; // -32768 ~32767
		int i = 1000;  // -21억 ~ 21억
		long l = 10000L; // long형은 L을 붙여야 한다.
		
		System.out.println("b1="+b1);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		
//	2. 실수형 변수
		float ft1 = 3.14f; // float형은 f를 붙여야 한다.
		float ft2 = 3.14F;
		float ft3 = (float)3.14; // double(8byte)을 float(4byte)형으로 형변환
		double d = 42.195;
		
		System.out.println("ft1="+ft1);
		System.out.println("ft2="+ft2);
		System.out.println("d="+d);
		System.out.printf("%.1f\n",d); // 소수 첫째자리까지 출력 : 42.2
		System.out.printf("%.2f\n",d); // 소수 둘째자리까지 출력 : 42.20
//	prinf는 C언어에서 많이 사용되는 편이다. 소수점까지 표현하고자 할 때 사용된다고 생각하자! (다른 클래스도 있음)
//	\는 줄바꿈 해준다고 생각하면 된다. 소수점 관련 변수는 그렇게 많이 사용되지 않으나 알고는 있자!
		
//	3. 문자형 변수
		char c1 = 'A'; // 1글자만 저장 가능 2글자 이상 불가
		char c2 = '안';
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
//	4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1="+bn1);
		System.out.println("bn2="+bn2);
		
//	   참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		if(s1 == s2) {  // 주소 비교 => 이때는 ==를 사용함
			System.out.println("같은 주소");
		}else { 
			System.out.println("다른 주소");
		}
		if(s1.equals(s2)) { // 데이터(값) 비교 => 이때는 equlas를 사용함
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
//	   참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조 => 2개 이상의 변수를 사용해야 할 때
		int[] score = {80, 90, 100}; // 순서는 0번 1번 2번으로 구별
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		for(int j=0; j<score.length; j++) {
			System.out.print(score[j]+"\t"); // \t는 수평 간격을 벌리라는 뜻임
		}
		System.out.println();
	
//	    참조형 변수 : 인터페이스(List)
//	    1. 순차적인 자료 구조
//	    2. 여러가지 자료형의 데이터를 모두 저장할 수 있다.
//	    3. 동적으로 공간의 크기를 늘릴 수 있다.
	  
//	    List list = new List();  // 오류발생
	    List list = new ArrayList(); // 형 변환이 되어 있다. 자동 형변환 = 업캐스팅
	    list.add(30);
	    list.add(3.14);
	    list.add('j');
	    list.add(true);
	    list.add("자바");
	    
	    for(int k=0; k<list.size(); k++) {
	    	System.out.print(list.get(k)+"\t");
	    }

	    
     }

}
