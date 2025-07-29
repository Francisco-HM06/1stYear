
package Prog2;
import java.util.*;
public class SampleExercise4ver2 
{
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        char reference [] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z'};
        
        System.out.println("- LETTER COUNTER -");
        System.out.print("Enter Sentence: ");
        String inputSentence=in.nextLine().toLowerCase();
        System.out.println("---------------------------------------------");
        
        for(int ctr1=0; ctr1<reference.length; ctr1++)
        {
            int countingLetter=0;
            countingLetter=countingLetter(inputSentence,countingLetter, reference[ctr1]);
            
            if(countingLetter>0)
                System.out.println(reference[ctr1] + ": " + countingLetter);
        }
    } // end of main
    
    public static int countingLetter( String inputSentence, int countingLetter,
            char reference)
    {
     int a=-1;
        for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
           a=inputSentence.indexOf(reference, a+1);
           int counter=a;
           if(counter>-1)
           {  
               countingLetter++;
               counter=-1;
           }
           
           else{
               break;
           }
        }
        
     return countingLetter;
    }
}



