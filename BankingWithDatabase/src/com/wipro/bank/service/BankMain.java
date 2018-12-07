package com.wipro.bank.service;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.dao.BankDAO;
import com.wipro.bank.util.InsufficientFundsException;

public class BankMain {
	
	public static void main(String[] args) {
		BankMain bankMain = new BankMain();
		
		
		String fromAccNo = "1234567893";
		String toAccNo = "1234567892";
		float amount = 100000;
		// View Balance
		System.out.println("Before transaction:");
		System.out.println("Account No.: "+fromAccNo+"\n\t"+bankMain.checkBalance(fromAccNo));
		System.out.println("Account No.: "+toAccNo+"\n\t"+bankMain.checkBalance(toAccNo));
		TransferBean transferBean = new TransferBean();
		transferBean.setFromAccountNumber(fromAccNo);
		transferBean.setAmount(amount);
		transferBean.setToAccountNumber(toAccNo);
		transferBean.setDateOfTransaction(new java.util.Date());
		System.out.println(bankMain.transfer(transferBean));
		System.out.println("After transaction:");
		System.out.println("Account No.: "+fromAccNo+"\n\t"+bankMain.checkBalance(fromAccNo));
		System.out.println("Account No.: "+toAccNo+"\n\t"+bankMain.checkBalance(toAccNo));
	}
	
	
	public String checkBalance(String accountNumber) {
		BankDAO bankDAO = new BankDAO();
		float balance = 0;
		if(bankDAO.validateAccount(accountNumber)){
			balance = bankDAO.findBalance(accountNumber);
			return "BALANCE IS: "+balance;
		}
		return "ACCOUNT NUMBER INVALID";
	}
	
	
	public String transfer (TransferBean transferBean) {
		float senderBalance = 0;
		float receiverBalance = 0;
		boolean updateSender = false;
		boolean updateReceiver = false;
		boolean updateTransfer = false;
		BankDAO bankDAO = new BankDAO();
		if(transferBean == null) {
			
			return "INVALID";
			
		}else if((bankDAO.validateAccount(transferBean.getFromAccountNumber()) && bankDAO.validateAccount(transferBean.getToAccountNumber()))) {
			if(bankDAO.findBalance(transferBean.getFromAccountNumber())>=transferBean.getAmount()) {
				senderBalance = bankDAO.findBalance(transferBean.getFromAccountNumber());
				receiverBalance = bankDAO.findBalance(transferBean.getToAccountNumber());
				senderBalance -= transferBean.getAmount();
				receiverBalance += transferBean.getAmount();
				updateSender = bankDAO.updateBalance(transferBean.getFromAccountNumber(), senderBalance);
				updateReceiver = bankDAO.updateBalance(transferBean.getToAccountNumber(), receiverBalance);
				updateTransfer = bankDAO.transferMoney(transferBean);
				if(updateSender && updateReceiver && updateTransfer) {
					return "SUCCESS";
				}				
			}else {
				try {
					throw new InsufficientFundsException();				
				}
				catch(InsufficientFundsException e) {
					e.printStackTrace();
				}
			}
		}
		else{
			return "INVALID ACCOUNT";
		}
		
		return "";
	}
	
}
