/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab02;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BankCharges {
    public static void main(String[] aa)
    {
    Scanner sc= new Scanner(System.in);
        int check, deposite;
        int charges=10;
        double fees;
        System.out.println("WELCOME TO THE BANK:-");
        System.out.println("BANK FEES 10$ PER MONTHS:-");
        System.out.println("ENTER THE NO OF CHECKS DEPOSITED:");
        check=sc.nextInt();
       //fees = charges*0.01;
        if(check >=60)
        {
            
        fees = charges+(check*0.04);
            System.out.println("CHARGES APPLICABLE FOR THE CHECKS :- "+fees);
        }
        else if (check <59 && check >40) 
        {
                  
        fees = charges+(check*0.06);
            System.out.println("CHARGES APPLICABLE FOR THE CHECKS :- "+fees);
        }
        else if (check <39 && check >20) 
        {
                  
        fees = charges+(check*0.08);
            System.out.println("CHARGES APPLICABLE FOR THE CHECKS :- "+fees);
        }
        else if (check <19) 
        {
              
        fees = charges+(check*0.10);
            System.out.println("CHARGES APPLICABLE FOR THE CHECKS WHICH IS BELOW 19:- "+fees);
        }
    }
}
