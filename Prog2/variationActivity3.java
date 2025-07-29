
package Prog2;
import java.util.*;

public class variationActivity3 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the number of elements:  ");
        int numElements = input.nextInt();
        
        int arrayNum[] = new int [numElements];
         int removeDup[] = new int [numElements];
         int dupCtr=0;
        System.out.println("Enter " + numElements + " numbers: ");
        
        for(int ctr=0; ctr<numElements; ctr++)
        {
            arrayNum[ctr] = input.nextInt();
        }

        for(int ctr=0; ctr<numElements; ctr++)
        {
            for (int ctr2=ctr+1; ctr2<numElements; ctr2++)
            {
                   
                if(arrayNum[ctr] != arrayNum[ctr2])
                {
                   removeDup[dupCtr]= arrayNum[ctr];
                   ++dupCtr;
                }
                  
            }
        }
        
        System.out.println("Array after removing duplicates: ");
        System.out.println(Arrays.toString(arrayNum));
        
        for(int ctr=0; ctr<(arrayNum.length-dupCtr); ctr++)
            System.out.print( removeDup[ctr] + " ");
        System.out.println("");
    }
    
    
}
