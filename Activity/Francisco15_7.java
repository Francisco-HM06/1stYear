package Activity;
import java.util.Scanner; import java.text.DecimalFormat;

public class Francisco15_7 
{
    public static void main (String[]args)
    {   Scanner input = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat("0.00");
        char productCode; double quantity, amountDue, uPriceA, uPriceB; 

        System.out.println("PRODUCT CODE      UNIT PRICE     AVAILABLE STOCKS");
        System.out.println("    A               120.00            20 ");
        System.out.println("    B               100.00            30 ");
        System.out.println("--------------------------------------------\n");
        uPriceA=120;
        uPriceB=100;
        System.out.print("Enter the Product Code : ");
        productCode = input.next().charAt(0);
        productCode = Character.toUpperCase(productCode); 
        
        if (productCode == 'A' )
        {
         System.out.print("Quantity               : ");
         quantity = input.nextDouble(); 
         System.out.println("\n--------------------------------------------\n");
                if(quantity>= 1 && quantity <=20) // not less than 1
                {
                System.out.println("Unit Price             : " + twodec.format(uPriceA));
                amountDue = uPriceA*quantity;                            
                System.out.println("Amount Due             : " + twodec.format(amountDue));
                }
                else if( quantity <=0)
                {
                 System.out.println("Invalid quantity"); 
                }
                else 
                {
                 System.out.println("Stock Not Sufficient");         
                }
        }
        else if(productCode == 'B')
        {
         System.out.print("Quantity               : ");
         quantity = input.nextDouble(); 
         System.out.println("\n--------------------------------------------\n");
         
                if(quantity>= 1 && quantity <=30) // not less than 1 
                {
                System.out.println("Unit Price             : " + twodec.format(uPriceB));
                amountDue = uPriceB*quantity; 
                System.out.println("Amount Due             : " + twodec.format(amountDue));
                }
                else if( quantity <=0)
                {
                 System.out.println("Invalid quantity"); 
                }
            else 
                {
                 System.out.println("Stock Not Sufficient");         
                }
        }
        else 
        {
         System.out.println("\n--------------------------------------------\n");
         System.out.println("Product is not available");  
        }
        System.out.println();
    }
}