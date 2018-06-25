package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  객체를 생성한 후 메소드를 호출하면 CONNECTION 객체를 리턴하는 클래스를 설계하기
 */

public class DBConnect {
	
	private Connection conn;
	
	public DBConnect() {
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
	}
	// connection 객체를 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
}
