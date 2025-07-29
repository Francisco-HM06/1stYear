
package Activity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Francisco15_9
{
    public static void main(String[] arags)
    {
        double diviD, diviS, rep;
        rep=0;                                               
        Scanner input = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat ("0.00");
        
        System.out.print("Dividend  : ");
        diviD= input.nextDouble();
        System.out.print("Divisor   : ");
        diviS= input.nextDouble();
        System.out.print("-------------------------------------------------\n");
        
        if (diviD>=1 && diviS>=1 && diviD>=diviS)
        { 
            while (diviD>=diviS)
                    {
                      diviD-=diviS;
                      rep++;
                    }
            System.out.println("Quotient  : " + twodec.format(rep));
                        if (diviD!=0)
                        {
                        System.out.println("Remainder : " + twodec.format(diviD));    
                        } 
        }
        else if (diviD>=1 && diviS>=1 && diviD<diviS)
        {
        System.out.println("Unable to process");
        }
        else 
        {
        System.out.println("Zero/Negative number/s not accepted");       
        }
    }
}
