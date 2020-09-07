/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sales;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class salesTaxR
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
   float  price;
   float salesTax;
   float countyTax;
   float totalsalesTax;
   float totalofthesale;
   
   System.out.println("PUCHASED THINGS BILL:-");
   price=sc.nextFloat();
   System.out.println("PURCHASED AMOUNT:-"+price);

      
  

   salesTax=(0.04f*price);
      System.out.println("STATE TAX BILL:-"+salesTax);

   
   
   countyTax=(0.02f*price); 
   
   System.out.println("COUNTY SALES TAX:-"+countyTax);
    
   totalsalesTax=salesTax+countyTax;
    System.out.println("TOTAL SALES TAX:-"+totalsalesTax);

    totalofthesale= price+ totalsalesTax;
    System.out.println("TOTAL OF THE SALE(PURCHASED AMOUNT+TOTAL SALES TAX) :- "+ totalofthesale);
   
    }

}
