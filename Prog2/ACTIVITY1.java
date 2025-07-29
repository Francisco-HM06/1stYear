
package Prog2;
import java.util.*;

public class ACTIVITY1
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int topScore=0, lowScore=1000;
        String topPlayer="", lowPlayer="";
        
        System.out.print("Enter # of Players: ");
        int playerNum = x.nextInt();
        
        System.out.println("---------------------");
        System.out.println("  S C O R E B O A R D");
        
        for(int ctr=0; ctr<playerNum; ctr++)
        {
            System.out.print((ctr+1) + ". Player's name: ");
            String playerName = x.next();
            System.out.print("   Score: ");
            int playerScore = x.nextInt();
            
            if(playerScore>topScore)
            {
                topScore=playerScore;
                topPlayer=playerName;
            }
            else if(playerScore==topScore)
            {
                topScore=playerScore;
                topPlayer = topPlayer + "," + playerName;
            }
            
            if(playerScore<lowScore)
            {
                lowScore=playerScore;
                lowPlayer = playerName;
            }
            else if(playerScore==lowScore)
            {
                lowScore=playerScore;
                lowPlayer = lowPlayer + "," + playerName;
            }
        }
        System.out.println("---------------------");
        System.out.println("Top Scorer: " + topPlayer 
                             + "-" + topScore);
        System.out.println("Least Scorer: " + lowPlayer 
                             + "-" + lowScore);
    }   
}
