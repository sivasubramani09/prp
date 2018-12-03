package com.wipro.bank.acc;

public class RDAccount extends Account {
	int tenure;
	float principal;
	
	public RDAccount(int tenure, float principal) {
		this.tenure = tenure;
		this.principal = principal;
	}
	
	@Override
	public float calculateInterest() {
		int monthsRemaining = tenure*12;
		double cRate;
		float r = rateOfInterest/100;
		float totalInterestEarned = 0;
		int n = 4;	 // No. of Quarters in a year
		float t; 	// Remaining months as years
		for(float i=monthsRemaining;i>0;i--) {
			t = i / 12;		// Remaining months as years
			cRate = Math.pow((1+(r/n)), n*t) -1;
			totalInterestEarned += principal * cRate;
			//System.out.println("Interest Paid: "+(principal*cRate)+" MonthsRem: "+i);
		}
		return totalInterestEarned;
	}

	@Override
	public float calculateAmountDeposited() {
		return principal*tenure*12;
	}
	
}
