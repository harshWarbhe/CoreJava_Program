package com.java.test_12_28.q1;

public class Maharashtra implements CentralGovernment {

	 private final double additionalAmt = 10000.0;
	
	@Override
	public void educationLoanScheme()
	{
		System.out.println("Maharashtra Education Loan Scheme: Base Amount = "+ amt +", Additional Amount = "+additionalAmt);
	}
	
}
