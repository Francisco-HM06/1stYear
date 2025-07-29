package Prog2;
import java.util.*;
import java.io.*;
public class FileManagementSample1 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        try{
             FileWriter myFile = new FileWriter("C:\\Users\\Hannah Mae Francisco\\Downloads\\MaiFile", true);
             
            // in.nextLine();
             System.out.print("Name: ");
             String name = in.nextLine();
             
             System.out.print("ID: ");
             String id = in.nextLine();
             
             System.out.print("Course: ");
             String course = in.nextLine();
             
             myFile.write("Name: " + name+ "\n");
             myFile.write("ID: " + id + "\n");
             myFile.write("Course: " + course + "\n");
             myFile.write("--------------------------------------------------------------------\n\n");
             
             myFile.close();
             
             System.out.println("Record Saved Successfully...");
             
              System.out.print("Print Record? [Y]/[N]: ");
            char print = in.next().toUpperCase().charAt(0);
        
            if(print==('Y'))
                readsFileData();
        } 
        catch (IOException e)
        {
            System.out.println("Error in Creation and Writing...");   
        }
    }
    
    public static File readsFileData() 
    {
        File fileReader = new File("C:\\Users\\Hannah Mae Francisco\\Downloads\\MaiFile");
        try
        {
            Scanner reader = new Scanner(fileReader);
            
            while(reader.hasNextLine())
            {
                String readPrint = reader.nextLine();
                
                System.out.println(readPrint);
            }
        } 
        catch(FileNotFoundException e)
        {
            System.out.println("Error in Printing...");   
        }

        
        return fileReader;
    }
}
