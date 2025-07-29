package Prog2;
import java.util.*;

public class Activity4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String compressedStrings="";
        
        System.out.print("Enter a string: ");
        String orginalString = in.nextLine();
        
        for (int ctr1=0; ctr1<orginalString.length();ctr1++)
        {
           int tracker=1;
           char currentChar = orginalString.charAt(ctr1);
           String trackerString ="1";
           
           int ctr2;
           for (ctr2=ctr1+1; ctr2<orginalString.length();ctr2++)
           {
                if(orginalString.charAt(ctr2)==currentChar)
               {
                   ctr1++;
                   tracker++;
                   trackerString =""+ tracker;
               }
                
                else
                    break;
           }
           compressedStrings +=  currentChar + trackerString;
           
        }
        
       if (compressedStrings.length() <= orginalString.length())
       {
            System.out.println("Compressed string: " + compressedStrings);
        } 
       else 
       {
            compressedStrings=orginalString.substring(0);
            System.out.println("Compressed string: " + compressedStrings);
        }
    }
}
