package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil {
	// JDBC driver name and database URL
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/bank_userdata";
	//  Database credentials
	private static final String USER = "B1234567890";
	private static final String PASS = "123";
	
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
