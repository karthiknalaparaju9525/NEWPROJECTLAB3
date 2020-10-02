/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class IsPrimeMethod
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
         int num;
         int b=0;
        num=sc.nextInt();
       
       /* if((num % 2)==0)
        {
            System.out.println("prime");
             
            }
        else
        {
            System.out.println("ODD");
        }
        */
      
       {
       for(int i=2;i<num-1;i++)
       {
        if((num % i)==0)
        {
            b=b+1;
            
        }
       }
       if(b==0)
       {
           System.out.println("PRIME NO.");
       }
       else
       {
           System.out.println("NOT PRIME");
       }
       
    }
}

}

    

