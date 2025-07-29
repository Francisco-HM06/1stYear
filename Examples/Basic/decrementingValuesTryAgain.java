
package Examples.Basic;
import java.util.*;

public class decrementingValuesTryAgain 

{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
      
        int number; 
        
        final int flag = 0;
        
        do 
        {
            System.out.print("Enter a#: ");
            number = input.nextInt();  

            if(number >=1 && number <=9)
            {
               for (int x=number; x>=1; x--)
               {
                   System.out.print(x);
                   
                   for ( int y=x-1; y>=1; y--)
                   {
                       System.out.println(" ");
                       for (int z=x; z>=y; z--)
                       {
                           System.out.print(z);
                           
                           if (z>y)
                               System.out.print("-");
                       }
                        
                   }
                   System.out.println(" ");
               }
                //System.out.println(" ");
            }
        } while ( number != flag);
        
     
        String hi="0";
        String hello= "0";
        
        if (!hi.equals(hello))
        {
            System.out.println("not equals");
        }
      
    }
}
