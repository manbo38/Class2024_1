package p2024_07_12;

import java.util.StringTokenizer;

public class StringTokenizer02 {

	public static void main(String[] args) {
		
		String source1 = "아이브 뉴진스 에스파 르세라핌 블랙핑크";
		StringTokenizer st1 = new StringTokenizer(source1," ");
		while(st1.hasMoreTokens()) {
			System.out.println("st1.token:"+st1.nextToken());
		}
		System.out.println();
		
		String source2 = "스타쉽,어도어,SM,YG";
		StringTokenizer st2 = new StringTokenizer(source2, ",");
		while(st2.hasMoreTokens()) {
			System.out.println("st2.token:"+st2.nextToken());
		}
		System.out.println();
		
//		true : 구분기호(,)도 토큰에 포함을 해서 처리하라는 의미
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) {
			System.out.println("st3.token:"+st3.nextToken());
		}

	}

}
