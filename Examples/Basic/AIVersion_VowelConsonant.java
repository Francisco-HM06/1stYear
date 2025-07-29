
package Examples.Basic;
import java.util.Scanner;

public class AIVersion_VowelConsonant {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter characters: ");
        // Read entire line and convert to lowercase for simplicity
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        
        String longestSubstring = ""; // to track the longest valid sequence

        // Loop over each index in the input string
        for (int i = 0; i < input.length(); i++) 
        {
            // We assume that a valid pattern must start with a vowel.
            if (!isVowel(input.charAt(i))) 
            {
                continue;
            }
            
            // Start a new candidate substring from this index
            String currentSub = "" +input.charAt(i);
            
            // Extend the candidate substring as long as the alternating condition holds.
            for (int j = i + 1; j < input.length(); j++) {
                char lastChar = currentSub.charAt(currentSub.length()-1);
                System.out.println("last: " + lastChar);
                char currentChar = input.charAt(j);
                System.out.println("current: " + currentChar);
                System.out.println("---------------------------------------");
                // If last character is a vowel, then current must be a consonant
                if (isVowel(lastChar) && !isVowel(currentChar)) {
                    currentSub += currentChar;
                    i++;
                }
                // If last character is a consonant, then current must be a vowel
                else if (!isVowel(lastChar) && isVowel(currentChar)) {
                    currentSub += currentChar;
                    i++;
                }
                // Pattern breaks if two consecutive characters are both vowels or both consonants
                else {
                    break;
                }
            }
            
            // Update longest if current substring is longer
            if (currentSub.length() > longestSubstring.length()) {
                longestSubstring = currentSub;
            }
        }
        
        System.out.println("Longest alternating vowel-consonant substring: " + longestSubstring);
    }
    
    // Helper method to determine if a character is a vowel
    private static boolean isVowel(char c) {
        // Check against vowels; returns true if found, false otherwise.
        return "aeiou".indexOf(c) != -1;
    }
}

    
