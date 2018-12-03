package com.wipro.eb.service;

import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Connection;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	public boolean validate(int currentReading,int previousReading,String type) throws InvalidReadingException, InvalidConnectionException {
		if(currentReading<previousReading) {
			throw new InvalidReadingException();
		} else if(currentReading<0 || previousReading<0) {
			throw new InvalidReadingException();
		}
		if(!(type.equals("Domestic")||type.equals("Commercial"))){
			throw new InvalidConnectionException();
		}
		
		return true;
	}
	
	public float calculateBillAmt(int currentReading,int previousReading,String type) {
		Connection connection = null;
		float bill =0;
		
		float slabDomestic[] = {2.3f,4.2f,5.5f};
		float slabCommercial[] ={5.2f,6.8f,8.3f};
		
		try {
			if(this.validate(currentReading, previousReading, type)) {
				if(type.equals("Domestic")) {
					connection = new Domestic(currentReading, previousReading, slabDomestic);
				}else {
					connection = new Commercial(currentReading, previousReading, slabCommercial);
				}
				
				bill =  connection.computeBill();
			}
		}
		catch(InvalidReadingException e) {
			//System.out.println(e);
			return -1;
		}
		catch(InvalidConnectionException e) {
			//System.out.println(e);
			return -2;
		}
		return bill;
		
	}
	
	public String generateBill(int currentReading,int previousReading,String type) {
		float billAmount = this.calculateBillAmt(currentReading, previousReading, type);
		if(billAmount == -1) {
			return "Incorrect Reading";
		} else if(billAmount == -2) {
			return "Invalid Connection Type";
		}
		
		return "Amount to be paid: "+billAmount;
	}
}
