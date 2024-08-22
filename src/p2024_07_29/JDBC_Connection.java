package p2024_07_29;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";	// com.mysql.cj.jdbc -> 파일명
		String url = "jdbc:mysql://localhost:3306/jsptest";	// 포트번호 : 3306
		
		Connection con = null;
		
		try {
			Class.forName(driver);	// JDBC Driver Loading
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			System.out.println("데이터베이스 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
