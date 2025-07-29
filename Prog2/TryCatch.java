package FranciscoHannahMae;
import java.io.*;
import java.util.*;

public class TryCatch 
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        String userAnswers [] = new String [10];
        String correctAnswers [] = new String[10];
        
        try
        {
            File file = new File("C:\\Users\\Hannah Mae Francisco\\Downloads\\answers.txt");
            Scanner reader = new Scanner (file);
            
             for (int i=0; i<10 && reader.hasNextLine(); i++)
            {
                correctAnswers[i]=reader.nextLine().trim().toUpperCase();
            }
             reader.close();
             
             System.out.print("Enter name: ");
             String name = input.nextLine();
             
             for(int ctr=0; ctr<10; ctr++)
           {
               do{
                   System.out.print("(" + (ctr+1) + ".)"+" Enter Answer: ");
                   userAnswers[ctr] = input.nextLine().trim().toUpperCase();
               
                    if(!userAnswers[ctr].equals("A") && !userAnswers[ctr].equals("B") && !userAnswers[ctr].equals("C")&&
                       !userAnswers[ctr].equals("D"))
                            System.out.println("Error in inputing..."); 
               } while(!userAnswers[ctr].equals("A") && !userAnswers[ctr].equals("B") && !userAnswers[ctr].equals("C")&&
                       !userAnswers[ctr].equals("D"));
               
           }  
             
             int numCorrect=0;
             String wrongCorrect [] = new String[10];
             for(int ctr=0; ctr<10; ctr++)
             {
                 if(userAnswers[ctr].equals(correctAnswers[ctr]))
                 {
                     numCorrect++;
                     wrongCorrect [ctr]="Correct";
                 }
                 else
                     wrongCorrect [ctr]="Wrong";
             }
             
             System.out.println("Number of Correct Answers: " + numCorrect);
             
           
            FileWriter userResponses = new FileWriter("C:\\Users\\Hannah Mae Francisco\\Downloads\\userResponses.txt", true);
            
            userResponses.write("Name: " + name + "\tScore: " + numCorrect + "\n\n");
            for(int ctr=0; ctr<10; ctr++)
             {
                 userResponses.write( "(" + (ctr+1) + ".) " + userAnswers[ctr] + "\t" + wrongCorrect [ctr] + "\n");
             }
            userResponses.write("----------------------------------------------------------------\n");
            userResponses.close();
            
            System.out.println("Record Saved Successfully...");
        }catch(FileNotFoundException e)
        {
            System.out.println("File not Found...");
        }
        
    }
    
}
