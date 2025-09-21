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
	
	double taxableAmount;
	double taxAmount;
	boolean isTaxPayed=false;

	@Override
	public void setTaxableAmount(int amount) {
		// TODO Auto-generated method stub
		this.taxableAmount = amount;
	}

	@Override
	public void calculateTaxAmount() {
		// TODO Auto-generated method stub
		if(!isTaxPayed) {
			if(taxableAmount <= 300000) {
				taxAmount=0;
			}
			else if(taxableAmount <= 600000) {
				taxAmount = (taxableAmount - 300000) * 0.05;
			}
			else if (taxableAmount <= 900000) {
				 taxAmount = (300000 * 0.05) + (taxableAmount - 600000) * 0.1;				
			}
			else if (taxableAmount <=1200000){
                taxAmount = (300000 * 0.05) + (600000 * 0.1) + (taxableAmount - 9000000) * 0.15;
            } else if(taxableAmount <=1500000) {
            	taxAmount = (300000 * 0.05) + (600000 * 0.1) + (900000*0.15)+ (taxableAmount - 1200000) *0.2;
            } else {
            	taxAmount = (300000 * 0.05) + (600000 * 0.1) + (900000 * 0.15)+ (1200000 * 0.2) + (taxableAmount - 1500000)*0.3;
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
		return isTaxPayed;
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		 if (!isTaxPayed) {
	            isTaxPayed = true;
	            System.out.println("Hi, your income tax is paid.");
	        } else {
	            System.out.println("Income Tax is already paid.");
	        }
		
		
	}

}
