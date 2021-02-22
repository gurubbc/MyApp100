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
		
		double maxPrice=0.0;
		String maxPricedStock="";
		
		// Let's use for loop
		for (int i=0;i<stocks.length;i++)
		{
			if (stocks[i].getStockPrice()>maxPrice)
			{
				maxPrice=stocks[i].getStockPrice();
				maxPricedStock=stocks[i].getStockName();
			}
			
		}
		
		System.out.println("The stock name with the highest price is "+maxPricedStock+" and price is "+maxPrice);

	}

}
