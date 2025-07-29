
package Examples.Basic;
import java.util.*;

public class ArraySampleAgain 
{
    public static void main (String [] args)
    {
        /*int elementsList[] = new int [] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    
        for(int x = 4; x<elementsList.length-1; x++)
            elementsList[x] = elementsList[x+1];    
        
        
        System.out.println(Arrays.toString(elementsList));*/
        
        w3Removal();
        //anotherExample();
    }
    
    public static void w3Removal()
    {
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter number of elements: ");
        int numElement = in.nextInt();
        
        String elementsList[] = new String [numElement];
        String destination [] = new String [elementsList.length-1];
        
        System.out.println("Enter Strings:  ");
        
        for(int elCtr =0; elCtr<numElement; elCtr++)
        {
            System.out.print(elCtr+1 + ".) ");
            elementsList[elCtr] = in.next();
        }
       
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the number of element you want to remove: ");
        int removeElem = in.nextInt();
        System.out.println("Removing: " + elementsList[removeElem-1] );
        System.out.println("---------------------------------------------------");
        System.out.println("Original Array: " + Arrays.toString(elementsList));
        
        for(int elCtr2 =removeElem-1; elCtr2< (elementsList.length-1); elCtr2++)
            elementsList[elCtr2]= elementsList[elCtr2 + 1];
       
        System.arraycopy(elementsList, 0, destination, 0, elementsList.length-1);
        
        System.out.println("Modified Array: " + Arrays.toString(destination));
        System.out.print("Modified Array (for loop): " );
        for (int printCtr=0; printCtr<elementsList.length-1; printCtr++)
        {
            System.out.print(elementsList[printCtr] + " ");
        }
            System.out.println(" ");
    }
    
    public static void anotherExample()
    {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(my_array));     
   
        // Define the index of the element to be removed (second element, index 1, value 14).
        int removeIndex = 1;

        // Loop to remove the element at the specified index.
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        
        // Print the modified array after removing the second element.
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}
