package Examples.Basic;


public class Method_PrimeNumbers
{
    public static void instruction()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("P R I M E  N U M B E R S  F R O M  1 - 5 0 ");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Prime Numbers: ");
    }
    
    public static void printBetween(int start, int end)
    {
        for (int x = start; x<=end; x++)
        {
            for (int y =1; y<=x; y++)
            {
                
                if (x%y==0 && (x==y || y==1))
                {
                   System.out.println(x);  
                }
                
               
            }
        }
        
       
    }
    public static void isPrime()
    {
        
    }
    
    
    public static void storingVariable()
    {
        for (int y=1; y<=5; y++)
        {
                String hi = y + "";
               for (int x=1; x<=y; x++)
             {
                
                 hi = hi + " " + x + "-";
                 System.out.println(hi);
             } 
               
               System.out.println(" ");
               System.out.println(" ");
        }
        
    }
    
    public static void main (String [] args)
    {   
      
          instruction(); 
          printBetween(1,50);
        //storingVariable();
       
    }
}
