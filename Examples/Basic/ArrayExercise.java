
package Examples.Basic;
import java.util.*;

public class ArrayExercise 
{
    
   public static void compareLengthArray()
   {
      int [] a = {5,4,3,2,1}; 
      int [] b ={5,4,3,2,1};
      int [] c = a;
       char hi [] ={'h', 'a'};
      
      if (Arrays.equals(a,b))
           System.out.println("same data: a and b");
      if (a[2] == b[2])
           System.out.println("same data a2 and b2");
      if (a[3] == c[3])
          System.out.println("same data");
      
       String string1 = "banana";
       String string2 = "banana";
       System.out.println("string1 == string2: " + 
                (string1 == string2));
       
       System.out.println(hi);
       
       printArray() ; 
   }
   
   public static void printArray() 
   {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] stringArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // Print the entire array using Arrays.toString()
        System.out.println("The entered strings are: " + Arrays.toString(stringArray));

        scanner.close();
    }
   
   public static void main(String [] args)
   {
      compareLengthArray();  
   }
}
