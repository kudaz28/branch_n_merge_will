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
        Accumulator ac = new Accumulator();
        
        System.out.println( "VAT: " + vc.calculateVATToPay(100, 20 ));
        System.out.println( "Sum: " + ac.sum(2.0, 3.5));
    }
}
