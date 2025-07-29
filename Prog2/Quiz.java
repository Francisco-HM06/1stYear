package Prog2;
import java.util.*;

public class Quiz 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String choice="";
        int maxSize=5;
        int sizeTracker=0;
        String names [] = new String [maxSize];
        String phoneNum [] = new String [maxSize];
        
        
        System.out.println("------------------------------------------------");
        System.out.println("PHONE BOOK EMULATOR");
        System.out.println("------------------------------------------------");
        System.out.println("[C] - Create \n" +
                           "[D] - Delete\n" +
                           "[V] - View");
        System.out.println("------------------------------------------------");
        
        do
        {
            System.out.print("\nChoice: ");
            choice=in.next().toUpperCase();
            
            switch(choice)
            {
                case "C" : 
                {
                    String initialName="";
                    String initialPhoneNum="";
                    boolean error =true;
                    
                    in.nextLine();
                    System.out.print("Enter Name    : ");
                    initialName= in.nextLine().trim();

                    for (int ctr=0; ctr<maxSize; ctr++) //maxSize
                    {
                        if(initialName.equalsIgnoreCase(names[ctr]))
                        {
                            System.out.println("Name already exists..");
                            error=false;
                            break;
                        }
                    } //for
                    
                    if(error==false)
                        break;
                    
                    System.out.print("Enter Phone # : ");
                    initialPhoneNum= in.next().trim();

                    for (int ctr=0; ctr<maxSize; ctr++) //maxSize
                    {
                        if(initialPhoneNum.equalsIgnoreCase(phoneNum[ctr]))
                        {
                            System.out.println("Phone# already exists..");
                            error=false;
                            break;
                        }
                    } //for
                    
                    
                    if(error==false)
                        break;
                    
                        try
                        {
                            names[sizeTracker] =initialName;
                            phoneNum[sizeTracker]=initialPhoneNum;
                        } 
                        catch(ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("Memory Full..");
                            break;
                        }

                        sizeTracker++;
                        System.out.println("Contact saved..");
                 
                    break;
                } // case C
                
                case "V" : 
                {
                    System.out.println("------------------------------------------------");
                    System.out.println("NAME\tPHONE #");
                    for(int ctr=0; ctr<sizeTracker; ctr++)
                    {
                        System.out.println(names[ctr]+ "\t" 
                                + phoneNum[ctr]);
                    }
                    System.out.println("------------------------------------------------");
                    
                    break;
                } // case V
                
                case "D" : 
                {
                    in.nextLine().trim();
                    System.out.print("Name to Delete: ");
                    String nameToDelete = in.nextLine().trim();
                    
                    for (int ctr=0; ctr<maxSize; ctr++) //maxSize
                        {
                            if(nameToDelete.equalsIgnoreCase(names[ctr]))
                            {
                                for (int NextCtr=ctr; NextCtr<maxSize-1; NextCtr++)
                                {
                                    names[NextCtr] =names[NextCtr+1];
                                    phoneNum[NextCtr]=phoneNum[NextCtr+1];
                                }
                                
                                sizeTracker--;
                                System.out.println("Contact deleted..");
                                //error=false;
                                break;
                            }
                            
                            if(ctr==maxSize-1)
                                System.out.println("Contact does not exist..");
                        } //for
                    break;
                }
                
                default : 
                    break;
                
            }//switch
            
        } while(choice.equals("C") || choice.equals("D")  || choice.equals("V"));
    }
}
