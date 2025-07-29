package Examples.Basic;
import java.util.*;

public class MiddleCharacter 
{
    public static String middleCharEven(String inputName)
    {
      int firstChar = (inputName.length()/2)-1;
      int secondChar = (inputName.length()/2);
      
      String printMid = inputName.charAt(firstChar) + " , " + 
                        inputName.charAt(secondChar);
      
      return printMid;
    }
    
    public static void middleCharOdd(String inputName)
    {
     char middleNameOdd = inputName.charAt(inputName.length()/2);
     
        System.out.println("Middle char of " + inputName + ": " + middleNameOdd);
    }
    
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");  
        String inputName = input.next();
        
        if (inputName.length()%2 ==0) // even
        {
            System.out.println("Middle chars of " + inputName + ": " +
                                middleCharEven(inputName));
        }
        
        else if (inputName.length()%2 !=0)
        {
         middleCharOdd(inputName); 
        }
    }
}
