
package Examples.Basic;

public class SumEvenNumbers 
{
   public static void main (String[]args)
   {
       int y, num=1, sum=0, i=1, condition=0;
       System.out.println("Sum of all Even Numbers, 1 up to 100");
       
       for (y=1; y<=100; y++)
       {
           if (y %2==0)
           {
           sum +=y;
           condition++;
           System.out.print("(" + condition + ")");
           System.out.println("SUM: " + sum); 
           }
       }
       
   }
     
    
    
}
