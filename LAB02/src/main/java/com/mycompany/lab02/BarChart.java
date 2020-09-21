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
public class BarChart {
    public static void main(String[] aa)
    {
    Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter today's sales for store 1:");
        double sales1=sc.nextDouble();
                 
        System.out.println("STORE 1 SALE:-"+sales1);
    System.out.println("Enter today's sales for store 2:");
    double sales2=sc.nextDouble();
    System.out.println("STORE 2 SALE:-"+sales2);
    System.out.println("Enter today's sales for store 3:");
    double sales3=sc.nextDouble();
    System.out.println("STORE 3 SALE:-"+sales3);
    System.out.println("Enter today's sales for store 4:");
    double sales4=sc.nextDouble();
    System.out.println("STORE 4 SALE:-"+sales4);
    System.out.println("Enter today's sales for store 5: ");
    double sales5=sc.nextDouble();
    System.out.println("STORE 5 SALE:-"+sales5);
     
    //f
    /*for(int i=1;i<10;i++)
    {
        for(int y=0;y<i;y++)
        {
            System.out.print("*");
        }
        System.out.println("*");
    }*/
    System.out.print("STORE 1:-");
    for(int i=1;i<(sales1/100);i++)
    {
        
        System.out.print("*");
    }
    System.out.println();
     System.out.print("STORE 2:-");
    for(int i=1;i<(sales2/100);i++)
    {
        System.out.print("*");
    }
        System.out.println();
         System.out.print("STORE 3:-");
    
    for(int i=1;i<(sales3/100);i++)
    {
        System.out.print("*");
    }
        System.out.println();
         System.out.print("STORE 4:-");
    
    for(int i=1;i<(sales4/100);i++)
    {
        System.out.print("*");
    }
        System.out.println();
         System.out.print("STORE 5:-");
        
    for(int i=1;i<(sales5/100);i++)
    {
        System.out.print("*");
    }
    
}
}
