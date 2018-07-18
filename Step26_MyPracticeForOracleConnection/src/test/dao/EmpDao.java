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
	private EmpDao dao;
	private EmpDao() {};
	public EmpDao getInstance() {
		if(dao==null) {
			dao=new EmpDao();
		}
		return dao;
	}
	public List<EmpDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDto> list=new ArrayList<>();
		try {
			conn=new DBConnect().getconn();
			String sql="";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
