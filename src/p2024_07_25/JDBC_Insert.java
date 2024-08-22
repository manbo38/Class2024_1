package p2024_07_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;	// 데이터베이스 접속
		Statement stmt = null;	// sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			stmt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("회원번호 입력?");
			int no = Integer.parseInt(br.readLine());
			System.out.print("이름 입력?");
			String name = br.readLine();
			System.out.print("이메일 입력?");
			String email = br.readLine();
			System.out.print("전화번호 입력?");
			String tel = br.readLine();
			
			String sql = "insert into customer values";
				   sql += "("+no+",'"+name+"','"+email+"','"+tel+"')";
				   
				   int result = stmt.executeUpdate(sql); // insert SQL문 실행
				   if(result == 1) {
					   System.out.println("회원가입 성공");
				   }else {
					   System.out.println("회원가입 실패");
				   }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
