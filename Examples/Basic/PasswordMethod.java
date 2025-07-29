
package Examples.Basic;
import java.util.*;

public class PasswordMethod 
{ 
  public static void valid_Password(String inputPassword)
  {
      int numDigit=0; 
      int invalidLength = 9; // this is 10 characters; start with 0
     
      if (inputPassword.length()>=invalidLength)
      {
            for (int ctr=0; ctr <= inputPassword.length()-1; ctr++)
            {
            char character = inputPassword.charAt(ctr);
        
            letter( inputPassword, character);
            numDigit= numeric(character, numDigit); 
            } 
      }
      
      else 
      {
          System.out.println("Password must have atleast 10 Characters");
      }
      
      
  }// vP
  
  public static void letter(String inputPassword, char character)
  {
      
        if (character >= 'A' && character <= 'Z')
        {
            System.out.println("Valid Password with letters" + character);
        } 
     return;
  } // letter
  
  public static int numeric(char character, int numDigit)
  { 
    
    if ( character >= '0'  && character<= '9' )
        { 
            numDigit++;
            System.out.println("Valid Password with numeric " + numDigit); 
        } 
         
        return numDigit;
  }
  // numeric
  
  
  public static void main (String [] args)
  {
      Scanner input = new Scanner (System.in);
      
      System.out.println("A password must have at least ten characters.\n" +
                         "A password consists of only letters and digits.\n" +
                         "A password must contain at least two digits.");
      
      System.out.print("ENter Your Password: ");
      String inputPassword = input.nextLine().toUpperCase();
      
      valid_Password(inputPassword);
      
  } // end of main 
    
}// end of class
