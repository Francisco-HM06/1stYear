
package trialSampleProb;
import java.util.*;

public class VowelConsonant 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        boolean vowelTracker =false;
        String longestVowelConsonant ="";
        String currentChar_Outer="";
        
        System.out.println("Enter String: ");
        String inputLetters =in.nextLine().toLowerCase().trim();
        
        for(int ctr=0; ctr<inputLetters.length(); ctr++)
        {
            if(vowelChecker(inputLetters.charAt(ctr), vowelTracker)) 
            {
                currentChar_Outer = "" + inputLetters.charAt(ctr); // it must be vowel
                
                for( int ctr2 = ctr+1; ctr2<inputLetters.length(); ctr2++)
                {
                    char checkingChar= currentChar_Outer.charAt(currentChar_Outer.length()-1);
                    
                    char checkingCharNext = inputLetters.charAt(ctr2);
                    
                    if(vowelChecker(checkingChar,vowelTracker) && !vowelChecker(checkingCharNext, vowelTracker))
                    {
                       currentChar_Outer += checkingCharNext;
                       ctr++;
                    }
                    
                    else if(!vowelChecker(checkingChar,vowelTracker) && vowelChecker(checkingCharNext, vowelTracker))
                    {
                       currentChar_Outer += checkingCharNext;
                       ctr++;
                    }
                    
                    else
                        break;
                }
            }
            
            if(longestVowelConsonant.length()<currentChar_Outer.length())
            {
                longestVowelConsonant = currentChar_Outer;
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Longest Alternate \n"
                + "Vowel-Consonant: " + longestVowelConsonant);
    }
    
    public static boolean vowelChecker(char letterThrown, boolean vowelTracker)
    {
        if(letterThrown =='a'|| letterThrown == 'e' || letterThrown =='i'||
                letterThrown =='o' || letterThrown =='u')
        {
            vowelTracker = true;
        }
        
        else
            vowelTracker = false;
        return vowelTracker;
    }
}