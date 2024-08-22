package p2024_07_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBoard {

	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";	// com.mysql.cj.jdbc -> 파일명
		String url = "jdbc:mysql://localhost:3306/jsptest";	// 포트번호 : 3306
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("수정할 글 번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());
			System.out.print("수정할 작성자명을 입력하세요.");
			String writer = br.readLine();
			System.out.print("수정할 비밀번호을 입력하세요.");
			String passwd = br.readLine();
			System.out.print("수정할 제목을 입력하세요.");
			String subject = br.readLine();
			System.out.print("수정할 내용을 입력 하세요.");
			String content = br.readLine();
			
			String sql = "update board set writer=?, passwd=?,";
				   sql+= "subject=?, content=?, reg_date=sysdate() where no=?";
				   
				   pstmt = con.prepareStatement(sql);
				   pstmt.setString(1, writer);
				   pstmt.setString(2, passwd);
				   pstmt.setString(3, subject);
				   pstmt.setString(4, content);
				   pstmt.setInt(5, no);
				   
				   int result = pstmt.executeUpdate();	// update SQL문 실행
				   if(result == 1) {
					   System.out.println("글 수정 성공");
				   }else {
					   System.out.println("글 수정 실패");
				   }
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}

}
