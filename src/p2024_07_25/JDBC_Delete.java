package p2024_07_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.30.1.33:1521:xe";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			stmt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("삭제할 회원번호를 입력 하세요?");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from customer where no=" + no;
			
			int result = stmt.executeUpdate(sql);
			if(result == 1) {
				System.out.println("회원삭제 성공");
			}else {
				System.out.println("회원삭제 성공");
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
