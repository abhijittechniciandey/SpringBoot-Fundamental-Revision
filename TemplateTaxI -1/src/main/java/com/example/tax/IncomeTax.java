package com.example.tax;

public class IncomeTax implements Tax{
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	
	private double taxableAmount;
	private double taxAmount;
	private boolean isTaxpayed=false;
	
	@Override
	public void setTaxableAmount(int amount) {
		// TODO Auto-generated method stub
		this.taxableAmount = amount;
		
	}
	@Override
	public void calculateTaxAmount() {
		if (!isTaxpayed) {
            if (taxableAmount <= 250000) {
                taxAmount = 0;
            } else if (taxableAmount <= 500000) {
                taxAmount = (taxableAmount - 250000) * 0.05;
            } else if (taxableAmount <= 1000000) {
                taxAmount = (250000 * 0.05) + (taxableAmount - 500000) * 0.2;
            } else {
                taxAmount = (250000 * 0.05) + (500000 * 0.2) + (taxableAmount - 1000000) * 0.3;
            }
        }
		
	}
	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return taxAmount;
	}
	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return "income";
	}
	@Override
	public boolean isTaxPayed() {
		// TODO Auto-generated method stub
		return isTaxpayed;
	}
	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		 if (!isTaxpayed) {
	            isTaxpayed = true;
	            System.out.println("Hi, your income tax is paid.");
	        } else {
	            System.out.println("Income Tax is already paid.");
	        }
		
	}
	
	
	

}
