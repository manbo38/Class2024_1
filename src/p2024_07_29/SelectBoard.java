package p2024_07_29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectBoard {

	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";	// com.mysql.cj.jdbc -> 파일명
		String url = "jdbc:mysql://localhost:3306/jsptest";	// 포트번호 : 3306
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		int count = 0;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
						
			String sql = "select count(*) from board";
								
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();	// select SQL문 실행
			if(rs01.next()) {
				count = rs01.getInt(1);
//				count = rs01.getInt("count(*)");
			}
			System.out.println("총 데이터 갯수:" + count);
			
			System.out.println("번호\t작성자\t비밀번호\t제목\t내용\t날짜");
			System.out.println("--------------------------------------------");
			
//			오름차순 정렬 : order by 컬럼명 asc
//			내림차순 정렬 : order by 컬럼명 desc
//			sql = "select * from board order by no desc";
			
//			최근글 5개 검색
//			limit 추출할 인덱스 번호, 추출할 데이터 갯수
//			sql = "select * from board order by no desc limit 0,5";
			
			sql = "select * from board order by no desc";
			
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();
			
//			글작성 시간을 연,월,일,시,분,초,요일로 출력 하세요.
			SimpleDateFormat ts1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
			
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts = rs02.getTimestamp("reg_date");
							
				System.out.println(no+"\t"+writer+"\t"+passwd+"\t"+subject+"\t"+
				                   content+"\t"+ts1.format(ts));
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
