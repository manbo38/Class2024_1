package p2024_07_26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class JDBC_Insert02 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("회원 이름을 입력 하세요.");
			String name = br.readLine();
			System.out.print("회원 이메일 주소를 입력 하세요.");
			String email = br.readLine();
			System.out.print("회원 전화번호를 입력 하세요.");
			String tel = br.readLine();
			System.out.print("회원 주소를 입력 하세요.");
			String address = br.readLine();
			
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			
			String sql = "insert into customer(no,name,email,tel,address,reg_date) ";
				   sql += " values(customer_no_seq.nextval,?,?,?,?,sysdate)";
			
				   pstmt = con.prepareStatement(sql);
				   pstmt.setString(1, name);
				   pstmt.setString(2, email);
				   pstmt.setString(3, tel);
				   pstmt.setString(4, address);
//				   pstmt.setTimestamp(5, ts);
				   
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
