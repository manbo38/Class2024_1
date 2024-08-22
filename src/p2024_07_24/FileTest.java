package p2024_07_24;

import java.io.File;

//	File 클래스
//	파일이나 디렉토리를 관리하는 클래스 : 폴더 생성, 폴더 삭제, 파일 삭제
//	자료실 기능을 구현할 때 이 클래스를 주로 사용한다.

public class FileTest {

	public static void main(String[] args) {
		
		try {
			File temp = new File("c:/java01", "temp");
			File tempFile = new File("test");
			
//			mkdirs()는 디렉토리를 생성하면 true를 반환함
//			System.out.println("temp객체:" + temp.mkdirs());
//			System.out.println("temp객체:" + tempFile.mkdirs());
			
//			1. 디렉토리 삭제 : 비어있는 디렉토리
//			tempFile.delete();	// test 디렉토리가 삭제된다.
			
//			2. 비어있지 않는 디렉토리 삭제(과제)
			File[] f = tempFile.listFiles();
			
			for(int i=0; i<f.length; i++) {
				f[i].delete();	// test 디렉토리 안의 모든 파일 삭제
			}
			tempFile.delete();	// 비어있는 test 디렉토리가 삭제된다.			
			
//			3. 자식 디렉토리 삭제
//			temp.delete();		// temp 디렉토리가 삭제된다.
			
//			4. 부모 디렉토리 삭제		// c:/java01 디렉토리 삭제된다.
//			temp.getParentFile().delete();
			
			
			
//			모든 파일을 구해오는 메소드를 찾고, 리턴되는 값들을 한개씩 루프돌리면서 파일을 지우기
			
//			System.out.println("temp canRead:" + temp.canRead());
//			System.out.println("temp canWrite:" + temp.canWrite());
//			System.out.println("temp getAbsoluteFile:" + temp.getAbsoluteFile());
//			System.out.println("temp getName:" + temp.getName());
//			System.out.println("temp getParent:" + temp.getParent());
//			System.out.println("temp getPath:" + temp.getPath());
//			System.out.println("temp isDirectory:" + temp.isDirectory());
//			System.out.println("temp isFile:" + temp.isFile());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
