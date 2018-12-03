package com.wipro.eb.main;

import com.wipro.eb.service.ConnectionService;

public class EBMain {
	public static void main(String[] args) {
		System.out.println(new ConnectionService().generateBill(220, 100, "Commercial"));
	}
}
