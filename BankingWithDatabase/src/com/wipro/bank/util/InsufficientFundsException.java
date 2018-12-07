package com.wipro.bank.util;

public class InsufficientFundsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3913337054487715798L;

	@Override
	public String toString() {
		return "INSUFFICIENT FUNDS";
	}
}
