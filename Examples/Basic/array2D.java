package Examples.Basic;
import java.util.*;

public class array2D
{
   public static void main(String[] args) 
    {
       int [][] integers ={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
       
       for (int rows=0; rows<integers.length;rows++)
        {
            int sum=0;
            for (int columns=0; columns<integers[rows].length;columns++)
            {
                sum+=integers[rows][columns];
            }
            System.out.println("The sum of row " + (rows+1)+ ": " + sum);
        }
    }
}