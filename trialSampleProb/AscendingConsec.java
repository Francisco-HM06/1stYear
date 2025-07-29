
package trialSampleProb;
import java.util.*;
public class AscendingConsec 
{ 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean ascending=false;
        int number []= new int [6];
        
        System.out.println("Enter the numbers: ");
        for(int ctr=0; ctr<6; ctr++)
        {
            number[ctr] =in.nextInt();
        }
        
        // if kung even or odd is the length
        for(int ctr=0; ctr<6; ctr+= 2)
        {     
            if(number[ctr]<=number[ctr+1])
                ascending=true;

            else
            {
                ascending = false;
                break;
            }
            
        }
        
        System.out.println("Ascending consecutive number: " + ascending);
        
        System.out.println("-----------------------------------------------------");
        throughArrayList();
    }
  
    public static void throughArrayList (){
        Scanner in = new Scanner(System.in);
        boolean ascending=true;
        ArrayList<Integer>number = new ArrayList<Integer>();
        
        System.out.println("Enter the numbers: ");
        for(int ctr=0; ctr<6; ctr++)
        {
           int x= in.nextInt();
           number.add(x);
        }
        
        for(int ctr=0; ctr<6; ctr+= 2)
        {
                
            if(number.get(ctr)<=number.get(ctr+1))
                ascending=true;

            else
            {
                ascending = false;
                break;
            }
            
        }
        
        System.out.println("Ascending consecutive number: " + ascending);
    } //end of method
  
}
