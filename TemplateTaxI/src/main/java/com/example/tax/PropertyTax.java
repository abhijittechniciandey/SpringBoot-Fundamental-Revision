package com.example.tax;

public class PropertyTax implements Tax {
	
	/*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	
	double taxableAmount;
	double taxAmount;
	boolean isTaxpayed=false;
	
	@Override
	public void setTaxableAmount(double amount) {
		this.taxableAmount=amount;
		
	}

	@Override
	public void calculateTaxAmount() {
		if (!isTaxpayed) {
            taxAmount = taxableAmount * 0.05;
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
		return "property";
	}

	@Override
	public boolean isTaxPayed() {
		// TODO Auto-generated method stub
		return isTaxpayed;
	}

	@Override
	public void payTax() {

		if (!isTaxpayed) {
            isTaxpayed = true;
            System.out.println("Hi, your property tax is paid.");
        } else {
            System.out.println("Property Tax is already paid.");
        }
		
	}
    
}
