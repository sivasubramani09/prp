package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal, int tenure, int age, String gender) throws BankValidationException {
		try {
			if(principal <500) {
				throw new BankValidationException();			
			}
			if(!(tenure == 5 || tenure == 10)) {
				throw new BankValidationException();			
			}
			if(!(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))) {
				throw new BankValidationException();			
			}
			if(age<1 || age >100) {
				throw new BankValidationException();
			}			
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
		return true;
	}
	
	public void calculate(float principal, int tenure, int age, String gender) throws BankValidationException {
		if(this.validateData(principal, tenure, age, gender)) {
			RDAccount rda = new RDAccount(tenure, principal);
			rda.setInterest(age, gender);
			System.out.println("Calculated interest: "+rda.calculateInterest());
			System.out.println("Amount Deposited: "+rda.calculateAmountDeposited());
			//System.out.println("The Maturity Amount: "+rda.calculateMaturityAmount(principal, maturityInterest));
		}
	}
}
