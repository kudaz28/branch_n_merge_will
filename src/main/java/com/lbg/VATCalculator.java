/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg;

public class VATCalculator
{
    public  double  calculateVATToPay( double value, double vatRate )
    {
        return value * vatRate/100;
    }
}