/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTHIK
 */
import java.util.Scanner;

public class primenumber 
{
    
    public static void main(String[] args) {
        int Num=0;
         IsPrimeNUMBER(Num);
    }
       
    
       public static int IsPrimeNUMBER(int Num)
       {
           Scanner keyboard= new Scanner(System.in); 
          int b=0;
          System.out.println("ENTER THE NUMBER:");
            Num=keyboard.nextInt();
        
       
       
       for(int a=2;a<Num-1;a++)
       {
        if((Num % a)==0)
        {
            b=b+1;
            
        }
       }
       if(b==0)
       {
           System.out.println("YES IT IS A PRIME");
       }
       else
       {
           System.out.println("NO IT IS NOT A PRIME");
       }
      return (Num);
       }

   
    }
    