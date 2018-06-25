package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyPractice {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("연결 성공");
		}catch(ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="select ename,deptno,empno from emp";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String ename=rs.getString("ename");
				int deptno=rs.getInt("deptno");
				int empno=rs.getInt("empno");
				System.out.println(ename+"|"+deptno+"|"+empno);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally{
			try {
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {
				
			}
		}
	}
}
