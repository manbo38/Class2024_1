package p2024_07_26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class InsertBoard {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
	
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("작성자명을 입력 하세요.");
			String write = br.readLine();
			System.out.print("비밀번호를 입력 하세요.");
			String passwd = br.readLine();
			System.out.print("제목을 입력 하세요.");
			String subject = br.readLine();
			System.out.print("내용을 입력 하세요.");
			String content = br.readLine();
						
			String sql = "insert into board(no,writer,passwd,subject,content,reg_date) ";
				   sql += " values(board_seq.nextval,?,?,?,?,sysdate)";
			
				   pstmt = con.prepareStatement(sql);	// 물음표에 대한 값을 설정해야해서
				   pstmt.setString(1, write);
				   pstmt.setString(2, passwd);
				   pstmt.setString(3, subject);
				   pstmt.setString(4, content);
				   
				   int result = pstmt.executeUpdate();	// insert SQL문 실행
				   if(result == 1) {
					   System.out.println("회원가입 성공");
				   }else {
					   System.out.println("회원가입 실패");
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
