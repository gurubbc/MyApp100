package com.ofss;

// a class with the main method serves as an entry to the application
public class TestProduct {

	public static void main(String[] args) {
		Stock st1=new Stock(1, "ORCL", 1111.1);
		Stock st2=new Stock(2, "IBM", 2111.1);
		Stock st3=new Stock(3, "INFY", 3111.1);
		//Create stock array
		Stock stocks[]= {st1,st2,st3};
		
		Customer c=new Customer("Guru", stocks);
		
		// Print the Customer object
		System.out.println(c);
		

	}

}
