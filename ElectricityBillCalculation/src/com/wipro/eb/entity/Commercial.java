package com.wipro.eb.entity;

public class Commercial extends Connection{
	public Commercial(int currentReading,int previousReading,float slabs[]){
		super(currentReading,previousReading,slabs);
	}

	@Override
	public float computeBill() {
		int unitsConsumed = currentReading - previousReading;
		float billAmount;
		float electricityDuty;
		float finalPayableAmount;
		if(unitsConsumed<=50) {
			billAmount = unitsConsumed*slabs[0];
		}else if(unitsConsumed>50 && unitsConsumed<=100) {
			billAmount = (unitsConsumed - 50)*slabs[1]+(50*slabs[0]);
		}else {
			billAmount = (unitsConsumed - 100)*slabs[2]+(50*slabs[1])+(50*slabs[0]);
		}
		
		//calculating electricity duty
		if(billAmount >= 10000) {
			electricityDuty = billAmount*0.09f;
		}else if(billAmount >= 5000) {
			electricityDuty = billAmount*0.06f;
		}else {
			electricityDuty = billAmount*0.02f;
		}
		
		finalPayableAmount = billAmount + electricityDuty;
		
		return finalPayableAmount;
	}
}
