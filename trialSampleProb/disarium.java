
package trialSampleProb;
import java.lang.Math;
import java.util.*;

public class disarium 
{
    public static void main(String[] args) 
    {
        arrayListVersion();
        
    }
    
    public static void arrayListVersion()
    {
        Scanner in = new Scanner(System.in);
        ArrayList <String> inputNumber = new ArrayList<>();
        boolean tracker = false;
        double trackerInt=0;
        System.out.println("Enter number: ");
        inputNumber.add(in.nextLine());
        
        for(int ctr=0; ctr<inputNumber.size(); ctr++)
        {
            for(int ctr1=0; ctr1<inputNumber.get(ctr).length(); ctr1++)
            {
                String converter ="" + inputNumber.get(ctr).charAt(ctr1);
                trackerInt +=Math.pow(Double.parseDouble(converter), ctr1+1);
            }
                
        }
        
        if(trackerInt==Double.parseDouble(inputNumber.get(0)))
            tracker=true;
        System.out.println("product: " + trackerInt);
        System.out.println("is " + inputNumber.get(0) + " disarium: " + tracker);
        
    }
}
