/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EVENODD {
    public static void main(String[] args) {
       Scanner number1=new  Scanner(System.in);
        int number;
        
        System.out.println("ENTER THE NUMBER:");
        number=number1.nextInt();
       
        if((number % 2)==0)
        {
            
            System.out.println("EVEN");
             
            }
        else
        {
            System.out.println("ODD");
        }
        
                    int count=0;

     for(int i=0;i<=number;i++)
        {
            count=count+2;
       System.out.println(count);
        }
         
        }
}
