package com.ofss;

import java.util.Arrays;

public class Customer {
	String customerName;
	Stock stocks[];
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Stock[] stocks) {
		super();
		this.customerName = customerName;
		this.stocks = stocks;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Stock[] getStocks() {
		return stocks;
	}
	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", stocks=" + Arrays.toString(stocks) + "]";
	}
	
	
	
	
}
