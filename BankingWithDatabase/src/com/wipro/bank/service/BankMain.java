package com.wipro.bank.service;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.dao.BankDAO;
import com.wipro.bank.util.InsufficientFundsException;

public class BankMain {
	
	public static void main(String[] args) {
		BankMain bankMain = new BankMain();
		// View Balance
		System.out.println(bankMain.checkBalance("1234567890"));
		TransferBean transferBean = new TransferBean();
		transferBean.setFromAccountNumber("1234567890");
		transferBean.setAmount(13900);
		transferBean.setToAccountNumber("1234567891");
		transferBean.setDateOfTransaction(new java.util.Date());
		System.out.println(bankMain.transfer(transferBean));
		// TransferMoney
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
		BankDAO bankDAO = new BankDAO();
		float senderBalance = 0;
		float receiverBalance = 0;
		float amountToBeTransfered = 0;
		boolean updateSender = false;
		boolean updateReceiver = false;
		boolean updateTransfer = false;
		if(transferBean == null) {
			return "INVALID";
		}
		if((bankDAO.validateAccount(transferBean.getFromAccountNumber()) && bankDAO.validateAccount(transferBean.getToAccountNumber()))) {
			if(bankDAO.findBalance(transferBean.getFromAccountNumber())>=transferBean.getAmount()) {
				senderBalance = bankDAO.findBalance(transferBean.getFromAccountNumber());
				receiverBalance = bankDAO.findBalance(transferBean.getToAccountNumber());
				amountToBeTransfered = transferBean.getAmount();
				senderBalance -= amountToBeTransfered;
				receiverBalance += amountToBeTransfered;
				updateSender = bankDAO.updateBalance(transferBean.getFromAccountNumber(), senderBalance);
				updateReceiver = bankDAO.updateBalance(transferBean.getToAccountNumber(), receiverBalance);
				updateTransfer = bankDAO.transferMoney(transferBean);
				if(updateSender && updateReceiver && updateTransfer) {
					return "SUCCESS";
				}else {
					return "FAILED TO UPDATE";
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
		return "INVALID ACCOUNT";
	}
	
}
