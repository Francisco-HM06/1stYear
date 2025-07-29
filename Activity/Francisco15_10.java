package Activity;
import java.util.Scanner;
public class Francisco15_10 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num, y, x, incre; incre=0;
        
        System.out.print("Input : ");
        num= input.nextInt();
        System.out.println("----------------------------------------------\n");
           
        if (num>0)                              // greater than zero 
        {
            System.out.println("Output 1: ");
            for (y=1; y<=num; y++)
                {
                    for (x=1; x<=y; x++)
                    {
                        System.out.print(x+" ");
                    }
                System.out.println();
                }
            
            System.out.println("\nOutput 2: ");
            for (y=1; y<=num; y++)
                {
                    for (x=1; x<=y; x++)
                    {
                        incre++;
                        System.out.print(incre +" ");
                    }
                System.out.println();
                }
        }
        else 
        {
            System.out.print("Zero/Negative number/s not accepted ");
        }
        System.out.println();
    }
}
