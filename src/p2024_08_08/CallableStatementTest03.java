package p2024_08_08;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class CallableStatementTest03 {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql;
//		String name = "홍길동";
		CallableStatement cs = null;
		System.out.println("검색할 회원이름을 입력하세요?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call sel_customer(?,?,?)}";

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);
			cs.setString(1, name);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);

			cs.execute();	// 프로시저 실행
			System.out.println("이름 \t 이메일 \t\t 전화번호   ");
			System.out.println("-----------------------------------------------");
			System.out.println(name + " \t " + cs.getString(2) + " \t " + cs.getString(3));

			cs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
