package com.example.tax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaxApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Tax incomeTax = (Tax) context.getBean("incomeTax");
        incomeTax.setTaxableAmount(1200000);
        incomeTax.calculateTaxAmount();
        System.out.println("Income Tax Amount to Pay: ₹" + incomeTax.getTaxAmount());
        if (!incomeTax.isTaxPayed()) {
            incomeTax.payTax();
        }

        Tax propertyTax = (Tax) context.getBean("propertyTax");
        propertyTax.setTaxableAmount(800000);
        propertyTax.calculateTaxAmount();
        System.out.println("Property Tax Amount to Pay: ₹" + propertyTax.getTaxAmount());
        if (!propertyTax.isTaxPayed()) {
            propertyTax.payTax();
        }
    }
}