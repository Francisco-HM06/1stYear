
package Activity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Francisco15_3 
{
    public static void main(String[] args)
    {
     double quiz,act,prog,exam,classStanding,finalGrade;
     Scanner input = new Scanner(System.in);
     DecimalFormat twodec = new DecimalFormat("0.00");
        
        System.out.print("Quiz           : ");
        quiz = input.nextDouble();
        
        System.out.print("Activity       : ");
        act = input.nextDouble();
        
        System.out.print("Project        : ");
        prog = input.nextDouble();
        
        System.out.print("Exam           : ");
        exam = input.nextDouble();
        
        System.out.print("Class Standing : ");
        classStanding = input.nextDouble();
        
        System.out.println("_____________________________________");
        finalGrade = ((quiz * 0.20) + (act * 0.15) + (prog * 0.25) +
                (exam * 0.30) + (classStanding * 0.10));
        System.out.println("Final Grade    : " + twodec.format(finalGrade));
    }
}
