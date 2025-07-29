
package Examples.Basic;
import java.io.*;

public class FileManagement_Create 
{
    public static void main(String[] args) 
    {
         File sampleFile = new File("sampleFile");
         
         try
         {
             if(sampleFile.createNewFile())
             System.out.println("File Creation Successfully...");
         } 
         catch(IOException e)
         {
             System.out.println("Creation Error...");
         }
         
    }
}
