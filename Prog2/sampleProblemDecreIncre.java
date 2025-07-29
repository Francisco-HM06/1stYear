package Prog2;
import java.util.*;

public class sampleProblemDecreIncre 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        do
        {
        System.out.print("Enter a#: ");
        number = input.nextInt();
        
        if (number>=1 && number<=9)
        {
            System.out.println("OUTPUT: ");
           
            int decrement = number;
            
            for (int x = 1; x<=number; x++)      // loop
            {
                System.out.println(decrement);
                
                for (int y = 1; y<decrement; y++)  //loop
                {
                   System.out.print(decrement);
                   int  decrementForRows = decrement;
                    
                   for (int z=1; z<=y; z++)  //loop
                    {
                      decrementForRows--;
                      System.out.print("-" + decrementForRows);
                    }
                   
                   System.out.println(" ");   
                }
            
             decrement--;
            } 
        }
        
        }while (number != 0);
        
    }
}
