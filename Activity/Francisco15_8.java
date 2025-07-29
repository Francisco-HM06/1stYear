package Activity;
import java.util.Scanner; import java.text.DecimalFormat;

public class Francisco15_8
{
    public static void main (String[] args)
    {
        double mulC, mulP,product, x; product=0;
        Scanner input = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat("0.00");
        
        System.out.print("Multiplicand : ");
        mulC=input.nextDouble();
        System.out.print("Multiplier   : ");
        mulP=input.nextDouble();
        System.out.println("\n-----------------------------------------------\n");

        if (mulC>=0 && mulP>=0)
        {
            for (x=1; x<=mulP; x++ )
            { 
                product+=mulC;
            }
            System.out.println("Product      : " + twodec.format(product));
        }
        else 
        {
            System.out.print("Negative number/s not accepted\n");
        }
        System.out.println("\n-----------------------------------------------");
    }
}

