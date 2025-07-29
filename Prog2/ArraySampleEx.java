package Prog2;
import java.util.*;

public class ArraySampleEx
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int number[] = new int[10];
    
    System.out.println("Enter 10 Integers: ");
    for (int x=0; x<10; x++)
       number[x] = input.nextInt();
   
    System.out.println("Array Values: ");
    for (int x=0; x<number.length;x++)
        System.out.print(number[x] + " ");
    
    System.out.println();
    System.out.println("--------------------------------------");
    System.out.println("Array Values in Reverse: ");
    for (int x=number.length-1; x>=0; x--)
        System.out.print(number[x] + " ");
    System.out.println();
    
    System.out.println("--------------------------------------");
    System.out.print("Enter index number [0-9]: ");
    int indexNum = input.nextInt();
    System.out.println("Element inside: " + number[indexNum]);
      
  } // main  
   
}// class
