
package Prog2;
import java.util.*;

public class Activity3 
{
    public static void main (String [] args)
    {
       /* Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of elements:  ");
        int numElements = input.nextInt();
        
        int arrayNum[] = new int [numElements];
        
        System.out.println("Enter " + numElements + " numbers: ");
        
        for(int ctr=0; ctr<numElements; ctr++)
        {
            arrayNum[ctr] = input.nextInt();
        }

        for(int ctr=0; ctr<numElements; ctr++)
        {
            for (int ctr2=ctr+1; ctr2<numElements; ctr2++)
            {
                  if(arrayNum[ctr] == arrayNum[ctr2])
                    arrayNum[ctr2]=-101;
            }
        }
        
        int removeDup[] = new int [numElements];
        int dupCtr=0;
                 
        for (int ctr=0; ctr<numElements; ctr++)
            {   
                   if(arrayNum[ctr] !=-101)
                    {    
                       removeDup[dupCtr] = arrayNum[ctr];
                       ++dupCtr;
                    }       
            }
        
        System.out.println("Array after removing duplicates: ");
        for(int ctr=0; ctr<dupCtr; ctr++)
            System.out.print( removeDup[ctr] + " ");
        System.out.println(""); */
        
        
        System.out.println("--------------------------------------------------");
        anotheroption();
    }
    
    public static void anotheroption()
    {
    Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of elements:  ");
        int numElements = input.nextInt();
        
        int arrayNum[] = new int [numElements];
        int tracker =0;
                
        System.out.println("Enter " + numElements + " numbers: ");
        
       for(int ctr=0; ctr<numElements; ctr++)
       {
           arrayNum[ctr] =input.nextInt();
       }
       
       
       for(int ctr=0; ctr<numElements-tracker; ctr++)
       {
           for(int ctr2=ctr+1; ctr2<numElements-tracker; ctr2++)
            {
                if(arrayNum[ctr] == arrayNum[ctr2])
                {
                    tracker++;
                    
                            for(int ctr3=ctr2+1; ctr3<numElements-tracker; ctr3++ )
                         {
                             arrayNum[ctr2] = arrayNum[ctr3];
                         }
                    
                }
            }
       }
       
       System.out.println("Array after removing duplicates: ");
        for(int ctr=0; ctr<numElements-tracker; ctr++)
            System.out.print(  arrayNum[ctr] + " ");
        System.out.println("");
    }
}
