package util;

import java.sql.*;  
public class DButil{  
	private static Connection conn = null;

	public static Connection getConnection() {

		String dbURL = "jdbc:oracle:thin:@localhost:1521/orcl";
		String username = "system";
		String password = "system";
		
		if (conn == null) {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(dbURL, username, password);
				return conn;
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}
}  