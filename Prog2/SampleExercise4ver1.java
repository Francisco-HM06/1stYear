
package Prog2;
import java.util.*;
public class SampleExercise4ver1 
{
    public static void main(String[] args) {
         char reference [] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z'}; 
        Scanner in =new Scanner (System.in);
        
        System.out.println("- LETTER COUNTER -");
        System.out.print("Enter Sentence: ");
        String inputSentence=in.nextLine().toLowerCase();
        System.out.println("---------------------------------------------");
        
        for(int ctr1=0; ctr1<reference.length; ctr1++){
           
            int countingLetter=0;
            
            for(int ctr2=0; ctr2<inputSentence.length(); ctr2++)
              if(reference[ctr1]==inputSentence.charAt(ctr2))
                {
                   countingLetter++; 
                }  
            
            
            if(countingLetter>0)
                System.out.println(reference[ctr1] + ": " + countingLetter);
        }   
    }
    
    
}
