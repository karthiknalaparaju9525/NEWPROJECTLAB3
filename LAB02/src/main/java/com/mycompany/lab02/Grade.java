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
public class Grade
{
public static void main(String[] ar)
{
    Scanner sc= new Scanner(System.in);
    int maths;
    int physics;
    int chemistry;
    int Total;
    int AVG;
    int Grade;
    int TotalGrade;
    String lettergrade;
    System.out.println("GRADING SYSTEM FOR TES:-");
    System.out.println("ENTER THE SCORES OF THE TEST:-");
    System.out.println("ENTER THE SCORE FOR THE MATHS TEST:-");
    maths=sc.nextInt();
    System.out.println("ENTER THE SCORE FOR THE PHYSICS TEST:-");
    physics=sc.nextInt();
    System.out.println("ENTER THE SCORE FOR THE CHEMISTRY TEST:-");
    chemistry=sc.nextInt();
  
    Total=maths+physics+chemistry;
    System.out.println("TOTAL SCORE:-"+Total);
    AVG=(Total/3);
    System.out.println("AVERAGE TEST SCORE:-"+ AVG);
   if(AVG>=90 && AVG<100)
   {
       lettergrade="A";
       System.out.println(lettergrade);
       
   }
   else if(AVG<89 && AVG>80)
   {
       lettergrade="B";
       System.out.println(lettergrade);
       
   }
    else if(AVG<79 && AVG>70)
   {
       lettergrade="C";
       System.out.println(lettergrade);
       
   } else if(AVG<69 && AVG>60)
   {
       lettergrade="D";
       System.out.println(lettergrade);
       
   }
   else
   {
       lettergrade="F";
       System.out.println(lettergrade);
       
   }
    
}

}
