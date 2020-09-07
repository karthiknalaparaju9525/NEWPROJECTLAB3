/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cookies;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Cookies {
    public static void main(String[] args)
    {
    int cookies;
     int cookiesate;
     Scanner sc= new Scanner(System.in);
     
     System.out.println("A BAG CONTAINS 40 COOKIES:-");
     System.out.println("A bag claims that there are 10 servings in the bag and that a serving equals 300 calories");
     System.out.println("Person serving cookies each time is equal to 30 Calories");
     System.out.println("No of cookies ate  by person:-");
     cookiesate=sc.nextInt();
          
     
     
     cookies=cookiesate*30;

     System.out.println("No of cookies consumed per person:- "+cookiesate);
     System.out.println("TOTAL NO OF CALORIES CONSUMED:-"+cookies);
}
}
