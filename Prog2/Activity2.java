

package Prog2;
import java.util.*; 
        
public class Activity2 
{
    
    public static int channelUp(int channel)
    {
        if (channel>=1 && channel<100) // put in variables
           channel++;
        return channel;        
    }
    public static int channelDown(int channel)
    {
        if (channel>1 && channel<=100)
            channel--;
        return channel;    
        
    }
    
    public static int volumeUp(int volume)
    {
        if (volume>=0 && volume<20)
            volume++;
        return volume;    
        
    }
    
    public static int volumeDown(int volume)
    {
        if (volume>0 && volume<20)
          volume--;
        return volume;          
    }
    
    public static void display(int channel, int volume)
    {
        System.out.println("-------------------------------------------");
        System.out.println("Channel: " + channel);
        System.out.println("Volume:  " + volume);
        System.out.println("-------------------------------------------");
    }
    
    public static void menu()
    {
        System.out.println("Channel Up: +");
        System.out.println("Channel Down: -");
        System.out.println("Volume Up: ++");
        System.out.println("Volume Down: --");
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("POWER ON");
        
        int channel = 2;
        int volume = 5; 
        String choice;
        display(channel, volume);
        
        do
        {
            menu();
            System.out.print("Choice: ");
            choice = input.next();

            switch (choice)
            {
                case "+" : 
                {
                   channel = channelUp(channel); 
                   display(channel, volume);
                   break;
                }

                case "-" : 
                {
                    channel = channelDown(channel);
                    display(channel, volume);
                    break;
                }

                case "++" : 
                {
                    volume = volumeUp(volume);
                    display(channel, volume);
                    break;
                }

                case "--" : 
                {
                    volume = volumeDown(volume);
                    display(channel, volume);
                    break;
                }
                
                case "o" : 
                {
                    display(channel, volume);
                    System.out.println("POWER OFF");
                    break;
                }

            }
    
        } while (choice!="o");   
    }
}
