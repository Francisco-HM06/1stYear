package Prog2;
import java.util.*;

public class ArrayPracExercise1
{
     public static void main(String[] args)
     {
         Scanner x = new Scanner (System.in);
         
         System.out.print("Enter # of Students: ");
         int numStud = x.nextInt();
         
         System.out.print("Enter # of Subjects: ");
         int numSub = x.nextInt();
         
         String studName[] = new String[numStud];
         int studGrade[] = new int[numSub];
         String subjName[] = new String[numSub];
         double averageGrade[] = new double [numStud];
         String astArray[] = new String [numSub];
         
         for(int y=0; y<astArray.length; y++)
         {   
             astArray[y]=" ";
         }
             
         System.out.println("-------------------------------------");
         System.out.println("Enter Subject Names: ");
         for(int subjNameCtr=0;subjNameCtr<numSub; subjNameCtr++)
         {
             System.out.print(subjNameCtr+1 + ". " );
             subjName [subjNameCtr] = x.next();
         }
         System.out.println("-------------------------------------");
                 
         
         for (int studCtr = 0; studCtr<numStud; studCtr++)
        {
            System.out.print(studCtr+1 +". " + "Name: ");
            studName[studCtr]= x.next();
            int sum=0;
            
            for (int gradeCtr=0; gradeCtr<numSub;gradeCtr++ )
            {
                System.out.print("Grade in " +subjName [gradeCtr]+ ": " );
                studGrade[gradeCtr] = x.nextInt();
                sum+=studGrade[gradeCtr];    
                
                if (studGrade[gradeCtr]>=75)
                 astArray[gradeCtr] +="*";
            }
            
            averageGrade[studCtr]= sum/numSub;
            System.out.println("Average Grade: " + averageGrade[studCtr]);
            System.out.println(" ");
        }
        System.out.println("-------------------------------------");
        
             double gradeHigh=averageGrade[0];    //should be same type of the array
             double gradeLow=averageGrade[0];
             
       for (int aveCtr=0; aveCtr<numStud;aveCtr++)
        {
            if (averageGrade[aveCtr]>gradeHigh)
            {
                gradeHigh=averageGrade[aveCtr];
            }
            
            if(averageGrade[aveCtr]<gradeLow)
            {
                gradeLow=averageGrade[aveCtr];
            }
        }
         System.out.println("Summary of Average Grades");
         System.out.println("Highest Average Grade: "+ gradeHigh);
         System.out.println("Lowest Average Grade: " + gradeLow);
         System.out.println("-------------------------------------");
         
         System.out.println("Grade Chart: ");
         System.out.println("Subject Name       No. of Student who passed");
         
         for(int gradeCtr1=0; gradeCtr1<numSub;gradeCtr1++)
         {
             System.out.println(subjName [gradeCtr1] + "\t\t"+ 
                     astArray[gradeCtr1] );
         }
     }// main

}
