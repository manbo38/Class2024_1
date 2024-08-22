package p2024_07_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;	// 데이터베이스 접속
		Statement stmt = null;	// sql문 실행 시켜주는 역할
		ResultSet rs = null;	// select로 검색한 데이터를 관리하는 역할
		
		try {
			Class.forName(driver);	// JDBC Driver Loading
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			stmt = con.createStatement();
			
			String sql = "select * from customer";
			
			System.out.println("번호\t이름\t이메일\t전화번호");
			System.out.println("-------------------------------");
			
			rs = stmt.executeQuery(sql);	// select SQL문 실행
			
			
			while(rs.next()) {	// next() : 검색한 데이터를 1개씩 가져오는 역할
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				
				System.out.println(no+"\t"+name+"\t"+email+"\t"+tel); 
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
