package p2024_07_26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
					
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("삭제할 글번호를 입력 하세요?");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from board where no= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();	// delete SQL문 실행
			if(result == 1) {
				System.out.println("글 삭제 성공");
			}else {
				System.out.println("글 삭제 실패");
			}
			
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("숫자만 입력 하세요.");
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
