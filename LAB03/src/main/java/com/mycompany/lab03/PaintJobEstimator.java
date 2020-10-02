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
public class PaintJobEstimator {
    Scanner sc= new Scanner(System.in);
  
     public static void main(String args[ ])
    {
   float paintingprice = 0;
   int ROOM = 0;
   int wallpersquareFeet = 0;
   int totalpersquareFeet = 0;
   double paintisrequired = 0;
  Scanner sc = new Scanner(System.in);

System.out.println("Enter price of paint per gallon:");
paintingprice = sc.nextFloat();

System.out.println("Enter no of rooms:" );
ROOM = sc.nextInt();
for( int i = 1; i<= ROOM; i++)
{ 
   System.out.println("Enter square feet of wall:" + i);
 wallpersquareFeet = sc.nextInt();
totalpersquareFeet = wallpersquareFeet+ totalpersquareFeet;
}

gallonsofpaintrequired(totalpersquareFeet);
float paintNeed=gallonsofpaintrequired(totalpersquareFeet);

float hoursNeeded  = hoursoflaborrequired(totalpersquareFeet);
float paintPrice =costofthepaint (  paintNeed, paintingprice);
 float labourPrice = laborcharges(  hoursNeeded);
System.out.println(" total paint needed :" +gallonsofpaintrequired(totalpersquareFeet));

System.out.println(" total hours needed :" +hoursoflaborrequired(totalpersquareFeet));

System.out.println(" total cost of paint :" +costofthepaint(paintNeed,paintingprice));

System.out.println(" total labour charges :" +laborcharges(hoursNeeded));

System.out.println(" total cost of paint job :" +totalcostofthepaintjob(paintPrice,labourPrice));
}


public static float gallonsofpaintrequired( float totalpersquareFeet)
{ 
  float paintNeed = (totalpersquareFeet/115);
return paintNeed;
}

public static float hoursoflaborrequired( float totalpersquareFeet)
{ 
   float hoursNeeded =( totalpersquareFeet*100/115);
return hoursNeeded;
}

public static float costofthepaint( float paintNeed,float paintCost)
{ 
   float paintPrice = paintNeed * paintCost;
return paintPrice;
}

public static float laborcharges(float hoursNeeded)
{ 
   float labourPrice = hoursNeeded* 18;
return labourPrice;
}

public static float totalcostofthepaintjob( float paintPrice,float labourPrice)
{ 
   float totalPrice = paintPrice+labourPrice;
return totalPrice;
}
    
}
    
