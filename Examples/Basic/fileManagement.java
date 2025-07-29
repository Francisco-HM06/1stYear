package Examples.Basic;
import java.io.*;
import java.util.*;

import java.util.Scanner;

public class fileManagement
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter Your Message for Nina: ");
        String message = in.nextLine();
        
        try
        {
            FileWriter data1 = new FileWriter ("sampleFile");
            data1.write(message);
            System.out.println("Message is created successfully...");
            data1.close();
        } 
        catch (IOException e)
        {
            System.out.println("Error...");
        }
        
        in.close();
       
           // char reader [] = new char [100];
           // FileReader data1 = new FileReader ("sampleFile");
            
            /*File myFile = new File ("sampleFile");
            if (myFile.delete())
                System.out.println("Message is deleted successfully...");
            
            else
                System.out.println("Error. Not Deleted...");*/
            
        try
        {
            char reader [] = new char [100];
            FileReader data1 = new FileReader ("sampleFile");
            data1.read(reader);
            
            System.out.println(reader);
            System.out.println("Message is read successfully...");
        } 
        catch (IOException e)
        {
            System.out.println("Error...");
        }
        
        
        
    }
}
