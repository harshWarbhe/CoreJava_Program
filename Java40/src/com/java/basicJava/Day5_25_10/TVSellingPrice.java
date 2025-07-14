package com.java.basicJava.Day5_25_10;

/*
Program-1 (Using CommandLine arguments)
-----------

A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is 
charged. Display total selling price, profit along with vat and service charge.

Sample Input/Output :

Cost Price: Rs. 32500.00
Profit (27%): Rs. 8775.00
Selling Price before VAT and Service Charge: Rs. 41275.00
VAT (12.7%): Rs. 5241.93
Service Charge (3.87%): Rs. 1597.34
Total Selling Price: Rs. 48114.27
*/

class  TVSellingPrice

{
	public static void main(String[] args) 
	{
		double cp = Double.parseDouble(args[0]);

		double profit = cp * 27 / 100;
		double sellpricebeforevat = cp + profit;
		double vat = sellpricebeforevat * 12.7 / 100;
		double servicecharge = sellpricebeforevat *3.87 / 100;
		double total = sellpricebeforevat + vat + servicecharge;

		System.out.println("Cost Price: Rs. "+cp);
		System.out.println("Profit (27%): Rs. "+profit);
		System.out.println("Selling Price before VAT and Service Charge: Rs. "+sellpricebeforevat);
		System.out.println("VAT (12.7%): Rs. "+vat);
		System.out.println("Service Charge (3.87%): Rs. "+servicecharge);
		System.out.println("Total Selling Price: Rs. "+total);
	}	
}
