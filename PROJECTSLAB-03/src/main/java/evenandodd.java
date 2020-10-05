/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
public class evenandodd {
    
  public static void main(String[] aa)
    {
        int EVEN_NUMBER=0;
        int ODD_NUMBER=0;
        int random=100;     
       Random value= new Random();
        
        for(int i=1;i<random;i++)
        {
            if(isEven(value.nextInt(i)))
                
            {
                EVEN_NUMBER=EVEN_NUMBER+1;
            }
            else
            {
                ODD_NUMBER=ODD_NUMBER+1;
            }
            
        }
    
    System.out.println("EVEN COUNT: "+EVEN_NUMBER);
    System.out.println("ODD COUNT: "+ODD_NUMBER);
    }
       
   
    
    public static boolean isEven(int num) {
    boolean isEven_Number = false;

    if ((num % 2) == 0) {
        isEven_Number = true;
    }
    return isEven_Number;

}


 
}


