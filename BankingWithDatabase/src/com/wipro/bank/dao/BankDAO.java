package com.wipro.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.util.DBUtil;

public class BankDAO {
	private static final Connection conn = DBUtil.getDBConnection();
	
	
	public int generateSequenceNumber() {
		//need to be changed
		return 1999;
	}
	
	
	public boolean validateAccount(String accountNumber) {
		Statement stmt = null;
		ResultSet resultSet = null;
		try {
			String query = "SELECT * FROM account_tbl WHERE account_number="+accountNumber;
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(query);
			if(resultSet.next()) {
				return true;
			}
			if(resultSet != null) {
				resultSet.close();
			}
			if(stmt!= null) {
				stmt.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//if accountNumber is invalid
		return false;
	}
	
	
	public float findBalance(String accountNumber) {
		if(this.validateAccount(accountNumber)) {
			Statement stmt = null;
			ResultSet resultSet = null;
			try {
				stmt = conn.createStatement();
				String query = "SELECT balance FROM account_tbl WHERE account_number="+accountNumber;
				resultSet = stmt.executeQuery(query);
				if(resultSet.next()) {
					return resultSet.getFloat(1);
				}
				if(resultSet!= null) {
					resultSet.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}			
		}
		
		//else invalid accountNumber
		return -1;
	}
	
	
	public boolean  transferMoney(TransferBean transferBean) {
		int transactionID = this.generateSequenceNumber();
		Date transactionDate = transferBean.getDateOfTransaction();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate= formatter.format(transactionDate);
		Statement stmt = null;
		String query = "INSERT INTO transfer_tbl VALUES("+transactionID+",'"+transferBean.getFromAccountNumber()+"','"+transferBean.getToAccountNumber()+"','"+strDate+"',"+transferBean.getAmount()+");";
		int rowsAffected =0;
		try {
			stmt = conn.createStatement();
			rowsAffected = stmt.executeUpdate(query);
			if(rowsAffected>0) {
				return  true;
			}
			if(stmt != null) {
				stmt.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean updateBalance(String accountNumber, float newBalance) {
		String query = "UPDATE account_tbl SET balance="+newBalance+"WHERE account_number="+accountNumber;
		int rowsAffected =0;
		Statement stmt = null;
		try {
			if(this.validateAccount(accountNumber)) {
				stmt = conn.createStatement();
				rowsAffected= stmt.executeUpdate(query);
				//System.out.println("rows affected:"+rowsAffected);
				if(rowsAffected>0) {
					return true;
				}
			}
			if(stmt != null) {
				stmt.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
