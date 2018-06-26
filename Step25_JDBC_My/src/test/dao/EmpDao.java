package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {
	private static EmpDao dao;
	private EmpDao() {};
	public static EmpDao getInstance() {
		if(dao==null) {
			dao=new EmpDao();
		}
		return dao;
	}
	
	//사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDto> list=new ArrayList<>();
			try {
				conn=new DBConnect().getConn();
				String sql="SELECT EMPNO,ENAME,SAL,DNAME,HIREDATE FROM EMP E, DEPT D WHERE E.DEPTNO=D.DEPTNO";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					int num=rs.getInt("empno");
					String name=rs.getString("ename");
					int sal=rs.getInt("sal");
					String dname=rs.getString("dname");
					String hiredate=rs.getString("hiredate");
					EmpDto dto=new EmpDto(num,name,sal,dname,hiredate);
					list.add(dto);
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				try {
					if(conn!=null)conn.close();
					if(pstmt!=null)pstmt.close();
					if(rs!=null)rs.close();
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		return list;
	}
}
