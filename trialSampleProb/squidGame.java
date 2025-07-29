package trialSampleProb;
import java.util.*;

public class squidGame
{
    
    public static String whoGoesFree(int n, int k, String prisoners[])
    {
        int counter=0;
        int numEliminated=0;
        System.out.println(Arrays.toString(prisoners));
        int updatedNumPlayers=n;
        int round=1;
        int countingLastPlayer=0;
        
       do
       {
            for(int ctr=0;ctr<updatedNumPlayers; ctr++)
           {
                if((counter+1)%k==0){
                    prisoners[ctr]="-";
                    ++numEliminated;
                    countingLastPlayer=0;
                }
                else{
                    countingLastPlayer++;
                }
                
                counter++;
            } // elimation 
           
           
           counter=countingLastPlayer;
           
           System.out.print("Round " + round +": [ ");                               
           round++;                                                               
           
           for(int ctrPrint=0; ctrPrint<updatedNumPlayers;ctrPrint++)             
           {
               System.out.print(prisoners[ctrPrint]);
               if(ctrPrint+1<updatedNumPlayers)
                   System.out.print(", ");
           }
           System.out.print(" ] --> ");
     
           for(int ctr2=0;ctr2<n-1;ctr2++)
           {
               if(prisoners[ctr2].equals("-")){
                   for(int ctr3=ctr2; ctr3<n-1;ctr3++)
                       prisoners[ctr3]=prisoners[ctr3+1];  
               }        
           } // removing the eliminated not yet need updated n
           
           updatedNumPlayers= n-numEliminated;
           
           System.out.print("[ ");         
           for(int ctrPrint=0; ctrPrint<updatedNumPlayers;ctrPrint++)
           { 
               System.out.print(prisoners[ctrPrint]);
               if(ctrPrint+1<updatedNumPlayers)
                   System.out.print(", ");
           }
           System.out.print(" ] ");
           System.out.println(" ");
       }while(updatedNumPlayers>0 && updatedNumPlayers!=1);
        
     return prisoners[0];
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,k;
        
        System.out.print("Number of People to be Executed: ");
        n=input.nextInt();
        
        System.out.print("Step Size: ");
        k=input.nextInt();
        System.out.println("----------------------------------------------------------");
        
        String prisoners[]= new String [n];
        for(int x=0; x<n; x++)
        {
            prisoners [x]= Integer.toString(x);
        }
        
        String survivor = whoGoesFree(n,k, prisoners);
        System.out.println("----------------------------------------------------------");  
        System.out.println("The Survivor is: " + "#" + survivor);
    }
}
