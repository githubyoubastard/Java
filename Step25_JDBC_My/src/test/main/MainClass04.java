package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass04 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			//오라클 드라이버 로딩 (ojdbc6.jar 있어야함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속ip주소:port번호:DB이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//.getConnection(url, 계정, 비밀번호) 
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		// [ member 테이블에 update 수행하기 ]
		
		//수정할 회원의 정보 
		int num=4;
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		try {
			String sql="Delete from member WHERE num=?";
			//sql 문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setInt(1, num);
			/*
			 *  .executeUpdate() 메소드는 int를 리턴해준다.
			 *  영향을 받은 row의 갯수를 리턴해준다.
			 *  로우 한 개가 수정되면 1을 전달, 10개 수정하면 10을 전달.
			 *  	-추가된 row의 갯수
			 *  	-수정된 row의 갯수
			 *  	-삭제된 row의 갯수
			 *  
			 *   따라서 리턴해주는 값이 0보다 큰지 확인 하면 
			 *   작업의 성공여부를 알 수 있다.
			 *   
			 *   예) 
			 *   
			 *   int result=pstmt.executeUpdate();
			 *   if(result>0){
			 *   	//성공
			 *   }else{
			 *   	//실패
			 *   }
			 */
			
			// sql 문 수행하기
			int flag=pstmt.executeUpdate();
			if(flag>0) {
				System.out.println(flag+" 개의 row 삭제");
			}else {
				System.out.println("삭제된 row 없음");
			}
			pstmt.executeUpdate();
			System.out.println("회원정보가 수정되었습니다.");
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}