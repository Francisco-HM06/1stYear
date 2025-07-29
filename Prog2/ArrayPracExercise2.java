package Prog2;
import java.util.*;

public class ArrayPracExercise2 
{
 public static void main(String [] args)
 {
  Scanner in = new Scanner (System.in);
  int number [] = new int [10];
  int oddNum = 0;
  int evenNum =0; 
  int highestCtr =0; // put in array 
  int secondHighestCtr=0;
  int ctrCount1 =0;
          
  System.out.println("Enter 10 Integers: ");
  for (int ctr=0; ctr<10; ctr++)
  {
      System.out.print("");
      number[ctr] =in.nextInt();
     // highestNumbers [ctr] = number[ctr];
        
      if (number[ctr]%2 ==0)
          evenNum++;
      
      else 
          oddNum++;
      
       if (number[ctr]>highestCtr)
      {
        
         highestCtr =  number[ctr];
         ctrCount1++;
      }
       
       else if(number[ctr]!=highestCtr)
            if(number[ctr]>secondHighestCtr)
                secondHighestCtr=number[ctr]; 
      
  }
  
  /* for (int ctr1=0; ctr1<10; ctr1++)
   {
       if(number[ctr1]!=highestCtr)
            if(number[ctr1]>secondHighestCtr)
                secondHighestCtr=number[ctr1];
   }*/
  
     System.out.println("\n-----------------------------------------------------");
     System.out.println("Even Numbers Count: " + evenNum);
     System.out.println("Odd Numbers Count: " + oddNum);
     System.out.println("-----------------------------------------------------");
     
     System.out.println("Input Intergers: " + Arrays.toString(number));
     System.out.println("Highest Integer Value: " + highestCtr);
     System.out.println("Second Highest Integer Value: " + secondHighestCtr);
     System.out.println(" ");
     System.out.println("-----------------------------------------------------\n");
     //sortingArrayMethod(number);
     searchElement(number);
  //   sumElementsActSample3();
     
 }
 
 public static void sortingArrayMethod(int number[])
 {
      System.out.println("another method: ");
      Arrays.sort(number);
      System.out.println("Input Intergers Value:" + Arrays.toString(number));
      System.out.println("Second Highest Integer Value: " + number[number.length-2]);
 }
 
    public static void loopForSorting(int number [], int highestNumbers[], int ctrCount2, int highestCtr) 
    {
        for(int x=0; x<number.length; x++)        //sorting
      {
          for (int y= 0; y<number.length;y++)
              
              if(number[x]> number[y])
              {
              highestNumbers [ctrCount2]=number[y];
              ctrCount2++;
              }
      }
  
    highestNumbers [number.length-1] =highestCtr;
    }
    
    public static void sumElementsActSample3()
    {
        Scanner in = new Scanner(System.in);
        
        int sumElements []= new int [5];
        int sumVar =0;
        
        System.out.print("\nEnter 5 Integers: ");
        
        for(int ctr =0; ctr<5; ++ctr)
            sumElements[ctr] = in.nextInt();
        
        for(int ctr =0; ctr<5;++ctr)
            sumVar += sumElements[ctr];
        
        System.out.println("Sum of elements: " + sumVar);
    }
    
    public static void searchElement(int number [])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter number to search: ");
        int numSearch = in.nextInt();
        String found="";
       // int searchCtr =0;
        for(int ctr=0; ctr<10; ctr++)
        {
            if (numSearch == number[ctr])
            {
                found = found + ", " + ctr;
                System.out.print("Number is found.");
                System.out.println(" Number found at Index: " + found);
            }
        }
        System.out.println("Number is not found :<");
    }
    
}
