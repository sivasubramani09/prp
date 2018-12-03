package com.wipro.eb.entity;

public class Domestic extends Connection {
	public Domestic(int currentReading, int previousReading, float slabs[]) {
		super(currentReading,previousReading,slabs);
	}

	@Override
	public float computeBill() {
		int unitsConsumed = currentReading - previousReading;
		float billAmount;
		if(unitsConsumed<=50) {
			billAmount = unitsConsumed*slabs[0];
		}else if(unitsConsumed>50 && unitsConsumed<=100) {
			billAmount = (unitsConsumed - 50)*slabs[1]+(50*slabs[0]);
		}else {
			billAmount = (unitsConsumed - 100)*slabs[2]+(50*slabs[1])+(50*slabs[0]);
		}
		return billAmount;
	}
}
