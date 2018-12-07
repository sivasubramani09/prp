package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class DBUtil {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/bank_userdata";
	//  Database credentials
	static final String USER = "B1234567890";
	static final String PASS = "123";
	
	public static Connection getDBConnection() {
		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rst = null;
//		String query = "select * from account_tbl";
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
//			stmt = conn.createStatement();
//			rst = stmt.executeQuery(query);
//			while(rst.next()) {
//				System.out.println(rst.getString(1)+","+rst.getString(2)+","+rst.getInt(3));
//			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
//		finally {
//			try {
//				if(conn != null)
//					conn.close();
//				if(stmt != null){
//					stmt.close();
//				if(rst != null)
//					rst.close();				
//				}
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
}
