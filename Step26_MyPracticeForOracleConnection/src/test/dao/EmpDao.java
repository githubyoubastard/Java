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
	public List<EmpDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		List<EmpDto> list=new ArrayList<>();
			try {
				conn=new DBConnect().getConn();
				String sql="SELECT ENAME,DNAME FROM EMP, DEPT WHERE EMP.DEPTNO=DEPT.DEPTNO AND SAL BETWEEN 3000 AND 5000";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					String ename=rs.getString("ENAME");
					String dname=rs.getString("DNAME");
					EmpDto dto=new EmpDto();
					dto.setEname(ename);
					dto.setDname(dname);
					list.add(dto);
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				try {
					if(conn!=null)conn.close();
					if(pstmt!=null)pstmt.close();
					if(rs!=null)pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		return list;
	}
}
