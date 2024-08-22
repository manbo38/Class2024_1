package p2024_07_01;

import java.util.Date;
import java.util.Random;
//java.lang 패키지 안에 들어있는 클래스는 import를 생략할 수 있다.(String, System)

public class Test {
//public은 접근제어자 Test는 사용자 정의 클래스 - 대문자 작성 필수

//  접근제어자 정적메소드 자료형 main메소드
	public static void main(String[] args) {
//  main()은 자바가상머신(JVM, java.exe)이 가장 먼저 호출하는 메소드이다.
//  1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main메소드가 필요하다.

		System.out.println("자바 출력 성공1");
		System.out.println("자바 출력 성공2");
		
		System.out.print("자바");
		System.out.print("오라클2");
		
		Date d = new Date();
		System.out.println(d);
//	    반드시 import를 해야 한다. 안 해서 오류 발생함! ctrl + shift + O / import 해야 가능
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
//		0~9 사이의 난수 발생
		}

	}