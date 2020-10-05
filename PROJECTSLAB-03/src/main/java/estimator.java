/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class estimator {
    
    Scanner sc= new Scanner(System.in);
  static float sqft=115;
  
     public static void main(String args[ ])
    {
   
       Scanner sc = new Scanner(System.in);
   
    double roompaint;
    double priceofpaint;
    double SqFtR;
    double TSqFt=0;
    double charge=0;
    System.out.println("PLease enter the no of rooms to be painted:");
    roompaint=sc.nextFloat();
    for(int i=0;i<roompaint;i++)
    {
        System.out.println("PAINT THE ROOM PER EACH SQUARE FT:");
        SqFtR=sc.nextFloat();
        TSqFt=TSqFt+SqFtR;
        
    }
    System.out.println("PRICE OF THE PAINT PER GALLON:");
    priceofpaint=sc.nextFloat();
    System.out.println("TOTAL SQ FT :"+TSqFt);
   
     gallonsofpaintrequired(TSqFt);
     System.out.println("TOTAL AEAA REQUIRE TO PAINT:"+TSqFt);
     
     hoursoflaborrequired(TSqFt);
     System.out.println("HOURS REQUIRED FOR LABOUR:"+TSqFt);

     costofthepaint( TSqFt, priceofpaint);
     System.out.println("COST OF THE PAINT MATERIAL: "+priceofpaint);
      
     laborcharges( TSqFt, charge);
     System.out.println("LABOUR CHARGES:"+charge);
      
     totalcostofthepaintjob(TSqFt, priceofpaint);
     System.out.println("TOTAL COST OF THE PAINT JOB:"+TSqFt);
    }

     
     public static double gallonsofpaintrequired( double TSqFt)
    { 
           
           return (1/sqft)* TSqFt;
    }


    public static double hoursoflaborrequired( double TSqFt)
    { 
      
            return (8/sqft)* TSqFt;
    }



   public static double costofthepaint( double TSqFt,double priceofpaint)
    { 
          
          return (8/sqft)* TSqFt*priceofpaint;
    }

 
    public static double laborcharges(double TSqFt,double charge)
    { 
           
           return (8/sqft)* TSqFt*18;
    }


     public static double totalcostofthepaintjob(double TSqFt, double priceofpaint)
    { 
           
           return (1/sqft)* TSqFt*priceofpaint +(8/sqft)* TSqFt*18;
    }
}




    

    
