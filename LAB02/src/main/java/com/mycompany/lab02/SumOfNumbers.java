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
public class SumOfNumbers {
    public static void main(String[] aa)
    {Scanner sc= new Scanner(System.in);
        int a;
        a=sc.nextInt();
        
        int b;
        int c=0;
        System.out.println("ENTER THE NUMBER:-");
       for(b=1;b<=a;b++)
       {
            c=c+b;
           System.out.println(b);
           
          }  
      
       System.out.println("SUM OF NUMBERS:"+c);
               
    }
}
