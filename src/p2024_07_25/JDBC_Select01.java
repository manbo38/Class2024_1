package p2024_07_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Select01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		
		int cnt = 0;	// 회원수
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			String sql = "select count(*) from customer";
			
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();	// select SQL문 실행
			if(rs01.next()) {
				cnt = rs01.getInt(1);
//				cnt = rs01.getInt("count(*)");
				
			}
			System.out.println("총 회원수:" + cnt);
			
			sql = "select * from customer";
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();	// select SQL문 실행
			
			System.out.println("번호\t이름\t이메일\t전화번호");
			System.out.println("-------------------------------");
			
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String name = rs02.getString("name");
				String email = rs02.getString("email");
				String tel = rs02.getString("tel");
				
				System.out.println(no+"\t"+name+"\t"+email+"\t\t"+tel);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs01 != null) rs01.close();
				if(rs02 != null) rs02.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
