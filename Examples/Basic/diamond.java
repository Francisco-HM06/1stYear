package Examples.Basic;
import java.util.Scanner;
        
public class diamond 
{
    
    public static void main (String[]args)
    {
    
    Scanner input = new Scanner(System.in);
    int num; 
    int f=0;
    int sec;
    int space;
    int s_num; 
    int y; 
    int x; 
    
    System.out.print("Enter an input: ");
    num = input.nextInt();
    s_num=num;
   for (y=1; y<=num; y++)
   { 
       
       for(space=s_num; space>=1; space--) 
        {
           System.out.print(" "); 
        }
       s_num--;
      for (f=1; f<=2*y-1; f++) //14
        {
         System.out.print("*");
        }
        System.out.println();
   }
   s_num=1;
   f--;
  // for (x=y-2; x>=1; x--) // x= 6
  for (x=1; x<=y-2; x++)
   {
         s_num++;
        for (space=1; space<=s_num; space++ ) // s_num= 2
        {
          System.out.print(" "); 
        }
        
        for (sec=f-2*x; sec>=1; sec-- )
        { 
            System.out.print("*");
        }
        System.out.println();   
   }
        
    }
    
    
    
}
