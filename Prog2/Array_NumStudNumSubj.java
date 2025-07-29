package Prog2;
import java.util.*;

public class Array_NumStudNumSubj 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter # of Students: ");
        int studNum = x.nextInt();
        
        System.out.print("Enter # of Subjects: ");
        int subjNum = x.nextInt();
        
        System.out.println("--------------------------------------------------");
        String subjArray[] = new String[subjNum];
        String studArray [] = new String [studNum];
        int gradeArray [] = new int [subjNum];
       
        System.out.println("Enter Subject Names: ");
        for (int subCount = 0; subCount<subjNum; subCount++)
        {
            System.out.print((subCount+1) + ". ");
            subjArray [subCount] = x.next();
        }
        System.out.println("--------------------------------------------------");  
        
        for (int studNumCtr = 0; studNumCtr<studNum; studNumCtr++)
        {
            System.out.print((studNumCtr+1) + ". " + "Name: ");
            studArray [studNumCtr] = x.next();
            int sum=0;

            for (int subNumCtr =0; subNumCtr<subjNum; subNumCtr++)
            {
                System.out.print("   Grade in " + subjArray[subNumCtr] + ": ");
                gradeArray [subNumCtr] = x.nextInt();
                sum += gradeArray[subNumCtr];
            }

            double average = sum/ subjNum;
            System.out.println("   Average Grade: " + average);
            System.out.println(" ");
        }
        
        System.out.println("--------------------------------------------------");  
       
    }//main
}


