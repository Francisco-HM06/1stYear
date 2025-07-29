package Prog2;
import java.util.*;

public class Activity5 
{
    public static void main(String[] args)
    {
        int digits =4;
        int inputNum[] = new int [digits];
        int proDigits[] = new int [digits];
        Scanner in = new Scanner (System.in);
        
        try
        {
            System.out.print("Enter 4-digit #: ");
            String fourNum =in.next();
            System.out.println("-------------------------------------------");
            
            if (fourNum.length()!= digits)
            {
                System.exit(0);
            }
            
            for (int ctr=0; ctr<digits; ctr++)   
            {
                inputNum[ctr] = Integer.parseInt("" + fourNum.charAt(ctr));
            }
            
        }
        catch (NumberFormatException e) {
            System.exit(0);
        }
        
        for (int ctr=0; ctr<digits; ctr++)   
            {
               proDigits[ctr] = (inputNum[ctr] + 7) % 10;
            }
        
        System.out.print("Processed Digits: ");
        for (int ctr=0; ctr<digits; ctr++)   
            {
                System.out.print(proDigits[ctr]);
            }
        System.out.println("");
        
        int firstDigit = proDigits[0];
        proDigits[0]=proDigits[2];
        proDigits[2]=firstDigit;
        
        int secondDigit = proDigits[1];
        proDigits[1] = proDigits[3];
        proDigits[3]=secondDigit;
        
        System.out.print("Swapped Digits  : ");
        for (int ctr=0; ctr<digits; ctr++)   
            {
                System.out.print(proDigits[ctr]);
            }
        System.out.println("");
    }
}
