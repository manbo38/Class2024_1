package p2024_07_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class JDBC_Select02 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
						
			String sql = "select * from customer order by no desc";
					
			System.out.println("번호\t이름\t이메일\t전화번호\t주소\t날짜");
			System.out.println("--------------------------------------------");
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();	// select SQL문 실행
			
//			회원들의 가입 날짜를 연,월,일,시,분,요일로 출력 하세요.
			
			SimpleDateFormat ts1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
			
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String address = rs.getString("address");
				Timestamp ts = rs.getTimestamp("reg_date");
							
				
				System.out.println(no+"\t"+name+"\t"+email+"\t"+tel+"\t"+
				                   address+"\t"+ts1.format(ts));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
