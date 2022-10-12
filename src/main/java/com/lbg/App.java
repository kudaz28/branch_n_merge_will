package com.lbg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VATCalculator vc = new VATCalculator();
        
        System.out.println( "VAT: " + vc.calculateVATToPay(100, 20 ));
    }
}
