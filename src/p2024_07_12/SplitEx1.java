package p2024_07_12;

public class SplitEx1 {

	public static void main(String[] args) {
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
//		기본 for문
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
		
//		향상된 for문
		for(String name : names) {
			System.out.print(name+"\t");
		}
		
	}

}
