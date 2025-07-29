package Project;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelBillComputation                                
{
    public static void main(String[] args)
    {   
        System.out.println("Project No. 9 \nHotel Bill Computation \n");
        System.out.println("Culilap, Lovely Joyce J. \nFrancisco, Hannah Mae C. \nLopez, Shanley Nina DG.\n");
        System.out.println("BSIT 1C-G1");
        System.out.println("\n--------------------------------------------------------------------------------------------------");
       
        Scanner input = new Scanner(System.in);  
        char anotherTrans;
        do
        {
        welcome();
        roomType_Bill();
                do
                {
                System.out.println("--------------------------------------------------------------------------------------------------");    
                System.out.println("\nDo you want another transaction?"); 
                System.out.print("\n [Y] Yes \t\t\t [N] No : "); 
                anotherTrans=input.next().charAt(0); 
                anotherTrans=Character.toUpperCase(anotherTrans);
                System.out.println("\n--------------------------------------------------------------------------------------------------\n");

                if (anotherTrans!='Y' && anotherTrans!='N' ) 
                    {
                     System.out.println("Invalid input."); 
                     System.out.println("--------------------------------------------------------------------------------------------------\n");
                    }
                }while (anotherTrans!='Y' && anotherTrans!='N' );
                 
        } while(anotherTrans =='Y'); 
        
        System.out.println("Thank you for Booking at SML Hotel!"); 
    } //main
    
        public static void welcome()
        {
        System.out.println("Welcome to SML Hotel!");
        System.out.println("\n\t\tRoom Type \t\t\t\t\t\t\t Rate");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n[S] Standard  \t\t\t\t\t\t\t\t\t Php 1,800.00");
        System.out.println("\t->Max occupancy : 2 guests");
        System.out.println("\n[M] Deluxe    \t\t\t\t\t\t\t\t\t Php 2,300.00");
        System.out.println("\t->Max occupancy : 2 guests \n\tAdditional guest: 1 extra guest (with charge of 10% of room rate)");
        System.out.println("\n[L] Suite     \t\t\t\t\t\t\t\t\t Php 3,000.00");
        System.out.println("\t->Max occupancy : 4 guests \n\tAdditional guest: 2 extra guest (with charge of 10% of room rate)");
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        }
        
        public static int sPrice()
        {
            int sPrice = 1800;
            return sPrice;  
        }
        public static int dPrice()
        {
            int dPrice= 2300;
            return dPrice;
        }
        public static int lPrice()
        {
            int lPrice = 3000;
            return lPrice;
        }
        
        public static void roomType_Bill()
        {
            char room;
            Scanner input = new Scanner(System.in);
            System.out.print("\nPlease select a room type : ");
            room = input.next().charAt(0);
            room = Character.toUpperCase(room);
            System.out.println("--------------------------------------------------------------------------------------------------\n");

                    switch (room)
                    {
                        case 'S':
                        {
                          standardRoom();
                          break;
                        }

                        case 'M':
                        {
                          deluxeRoom();
                          break;
                        }

                        case 'L':
                        {
                          suiteRoom();
                          break;
                        }

                        default : 
                        {
                           System.out.println("Invalid Input"); 
                           System.out.println("\n--------------------------------------------------------------------------------------------------\n");
                           roomType_Bill();
                           break;
                        }
                    }
        }
        
        public static int night() //general 
        {
            int night;
            Scanner input = new Scanner(System.in);
                do
                {
                    System.out.print("Number of night/s : ");
                    night = input.nextInt();
                        if (night <=0)
                        {
                        System.out.println("\n--------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input"); 
                        System.out.println("--------------------------------------------------------------------------------------------------\n");
                        }
                } while (night<=0);
                
            return night;
        }
        
        
        public static void standardRoom()  
        {
            int noGuestS;
            Scanner input = new Scanner(System.in);
            System.out.println("Standard Room");
            System.out.print("Number of guests  : ");
            noGuestS=input.nextInt();
                if(noGuestS>2)
                {
                    System.out.println("Standard room can only accomodate 2 guests. Please enter a valid guest number or select other room type.");
                    System.out.println("--------------------------------------------------------------------------------------------------\n");
                    roomType_Bill();
                }
                else if (noGuestS<1)                                               
                {
                    System.out.println("Please enter a valid number of guest.");
                    System.out.println("--------------------------------------------------------------------------------------------------\n");
                    standardRoom();
                }
                else // valid input
                {
                    int nights = night();
                    int totalS= computeBillStandard(nights); 
                    displayBill(noGuestS, nights, totalS);
                    System.out.println("\nNote: Check the details above before proceeding");
                    System.out.println("--------------------------------------------------------------------------------------------------\n");
                    transactionConfirmation_S(noGuestS, nights, totalS); 
                }
        }
         
        public static int computeBillStandard(int nyt) 
        {
            int totalS;                 
            totalS= nyt * sPrice();
            return totalS;                      
        }    
            public static void displayBill(int g, int n, int ts) 
        {
            DecimalFormat twodec = new DecimalFormat("0.00");
            double vat;
            System.out.println("\nRoom Type         : Standard Room");
            System.out.println("Price per Night   : " + twodec.format(sPrice()));
            System.out.println("Number of guest/s : " + g);
            System.out.println("Number of night/s : " + n);
            System.out.println("Sub Total         : Php " + twodec.format(ts));
            
            vat = ts*0.12;
            ts+=vat;
            System.out.println("Value Added Tax   : " + twodec.format(vat));
            System.out.println("Total             : Php " + twodec.format(ts));
        }
        
            public static void transactionConfirmation_S(int g, int n, int ts)  
        {
            Scanner input = new Scanner (System.in);                    
            System.out.println("Do you want to confirm the transaction?"); 
            System.out.print("\n [Y] Yes \t\t\t [N] No : "); //  
            char trans=input.next().charAt(0); 
            trans=Character.toUpperCase(trans);
            System.out.println("\n--------------------------------------------------------------------------------------------------"); 
            
            if (trans=='N')
            {
                roomType_Bill();
            }
            else if (trans== 'Y')
            {
               System.out.println("The transaction is confirmed");
               System.out.println("--------------------------------------------------------------------------------------------------");  
               System.out.println("RECEIPT");
               displayBill(g,n,ts);
            }
            else 
            {
                System.out.println("Please insert a valid answer");
                System.out.println("--------------------------------------------------------------------------------------------------\n");
                transactionConfirmation_S(g,n,ts);
            }
        }
               
            
        public static void deluxeRoom() 
        {
           Scanner input = new Scanner(System.in);           
            System.out.println("Deluxe Room");
            System.out.print("Number of guests  : ");
            int noGuestM=input.nextInt(); 
            
                if (noGuestM==1 || noGuestM==2)
                 {
                     int nights = night();
                     double totalM = computeDeluxe(nights);                                  
                     additionalGuestM(totalM, noGuestM,nights);
                 }
                
                else if (noGuestM<1)
                 {
                    System.out.println("\n--------------------------------------------------------------------------------------------------");
                    System.out.println("Invalid Input"); 
                    System.out.println("--------------------------------------------------------------------------------------------------\n");
                    deluxeRoom();
                 }
                else 
                 
                 {
                  System.out.println("\n--------------------------------------------------------------------------------------------------");   
                  System.out.println("The deluxe room can only accommodate a maximum of 2 guests, with the option for 1 additional guest\n" +
                                      "Please enter 2 guests as the maximum occupancy before adding an extra guest. "); 
                  System.out.println("--------------------------------------------------------------------------------------------------");
                  deluxeRoom();
                 }  
        }
        
        public static double computeDeluxe(int nights)
        {
           double totalM= nights * dPrice();
           return totalM;
        }
        public static void additionalGuestM(double totalM,int noGuestM, int nights)
        {   
            Scanner input = new Scanner (System.in);
            System.out.print("\n Do you want to add a guest?"); 
            System.out.print("\n [Y] Yes \t\t\t [N] No : ");
            char addGuestM=input.next().charAt(0);
            addGuestM=Character.toUpperCase(addGuestM);
            System.out.println("--------------------------------------------------------------------------------------------------\n"); 
            int noaddGuestM=0;  
            
            if (addGuestM=='Y' || addGuestM=='N')
                            {
                                    if (addGuestM=='Y')
                                    {
                                    noaddGuestM = 1;
                                    totalM += (0.1*dPrice())* nights * noaddGuestM;
                                    }
                                    
                              displayBillDeluxe(noGuestM, nights, totalM, noaddGuestM);
                              System.out.println("\nNote: Check the details above before proceeding");
                              System.out.println("--------------------------------------------------------------------------------------------------\n");
                              transactionConfirmation_M(noGuestM, nights, totalM, noaddGuestM); 
                            }
            else 
                            {
                              System.out.println("Invalid Input"); 
                              System.out.println("--------------------------------------------------------------------------------------------------"); 
                              additionalGuestM(totalM,noGuestM,nights); 
                            }
        }
        
        public static void displayBillDeluxe( int noGuestM, int nights, double totalM, int noaddGuestM)
        {
            DecimalFormat twodec = new DecimalFormat("0.00");
            double vat;
            System.out.println("\nRoom Type         : Deluxe Room");
            System.out.println("Price per Night   : " + twodec.format(dPrice()));
            System.out.println("Number of guest/s : " + noGuestM);
            System.out.println("Additional guest  : " + noaddGuestM);
            System.out.println("Number of night/s : " + nights);
            System.out.println("Sub Total         : Php " + twodec.format(totalM)); 
            
            vat = totalM*0.12;
            totalM+=vat;
            System.out.println("Value Added Tax   : " + twodec.format(vat));
            System.out.println("Total             : Php " + twodec.format(totalM));   
        }
            public static void transactionConfirmation_M(int noGuestM, int nights, double totalM, int noaddGuestM)  
        {
            Scanner input = new Scanner (System.in);                    
            System.out.println("Do you want to confirm the transaction?"); 
            System.out.print("\n [Y] Yes \t\t\t [N] No : "); //  
            char trans=input.next().charAt(0); 
            trans=Character.toUpperCase(trans);
            System.out.println("\n--------------------------------------------------------------------------------------------------"); 
            
            if (trans=='N')
            {
                roomType_Bill();
            }
            else if (trans== 'Y')
            {
               System.out.println("The transaction is confirmed");
               System.out.println("--------------------------------------------------------------------------------------------------");          
               System.out.println("RECEIPT");
               displayBillDeluxe(noGuestM, nights, totalM, noaddGuestM);
            }
            else 
            {
                System.out.println("Please insert a valid answer");
                System.out.println("--------------------------------------------------------------------------------------------------\n");
                transactionConfirmation_M(noGuestM, nights, totalM, noaddGuestM);
            }
        }
        
            
        public static void suiteRoom()
        {
            Scanner input = new Scanner(System.in);
                                      
            System.out.println("Suite Room");
            System.out.print("Number of guests  : ");
            int noGuestL=input.nextInt(); 
            
                if (noGuestL>=1 && noGuestL<=4)
                 {
                     int nights = night();
                     double totalL = computeSuite(nights);
                     additionalGuestL(noGuestL, nights, totalL);
                 }
                
                else if (noGuestL<1)
                        {
                System.out.println("\n--------------------------------------------------------------------------------------------------");
                System.out.println("Invalid Input"); 
                System.out.println("--------------------------------------------------------------------------------------------------\n");
                suiteRoom();            
                        }
                else
                {
                 System.out.println("\n--------------------------------------------------------------------------------------------------");
                 System.out.println("The suite room can only accommodate a maximum of 4 guests, with the option for 2 additional guests\n" +
                                     "Please enter valid number of guests with 4 as the maximum occupancy before adding an extra guest/s. "); 
                 System.out.println("--------------------------------------------------------------------------------------------------\n");
                 suiteRoom();
                }
        }  
                
        public static double computeSuite(int nights)
        { 
           double totalL= nights * lPrice();
           return totalL;
        }
        public static void additionalGuestL(int noGuestL, int nights, double totalL)
        {   
            Scanner input = new Scanner (System.in);
            System.out.print("\n Do you want to add a guest?"); 
            System.out.print("\n [Y] Yes \t\t\t [N] No : ");
            char addGuestL=input.next().charAt(0);
            addGuestL=Character.toUpperCase(addGuestL);
            System.out.println("--------------------------------------------------------------------------------------------------");
            int noaddGuestL = 0;
            
            if (addGuestL=='Y')
                        {    
                            System.out.print("Enter the number of additional guests (1 or 2 only): ");
                            noaddGuestL=input.nextInt();
                            
                            if (noaddGuestL==1 || noaddGuestL==2) 
                                {      
                                totalL += (0.1 * lPrice()) * nights * noaddGuestL; 
                                displayBillSuite(noGuestL, nights, totalL, noaddGuestL);
                                System.out.println("\nNote: Check the details above before proceeding");
                                System.out.println("--------------------------------------------------------------------------------------------------\n");
                                transactionConfirmation_L(noGuestL, nights, totalL, noaddGuestL);                           
                              
                                }
                            else if (noaddGuestL<1)
                                {
                                System.out.println("--------------------------------------------------------------------------------------------------\n"); 
                                System.out.println("Invalid Input"); 
                                System.out.println("--------------------------------------------------------------------------------------------------\n"); 
                                additionalGuestL(noGuestL,nights, totalL);  
                                }   
                            else         
                                {
                                System.out.println("--------------------------------------------------------------------------------------------------\n"); 
                                System.out.println("Number of additional guests exceeded"); 
                                System.out.println("--------------------------------------------------------------------------------------------------\n"); 
                                additionalGuestL(noGuestL,nights, totalL);  
                                }
                        }
            else if (addGuestL=='N')
                        {
                        displayBillSuite(noGuestL, nights, totalL, noaddGuestL);
                        System.out.println("\nNote: Check the details above before proceeding");
                        System.out.println("--------------------------------------------------------------------------------------------------\n");
                        transactionConfirmation_L(noGuestL, nights, totalL, noaddGuestL);
                        }
            else 
                        {
                        System.out.println("Invalid Input"); 
                        System.out.println("--------------------------------------------------------------------------------------------------"); 
                        additionalGuestL(noGuestL, nights, totalL);   
                        }
        }
        public static void displayBillSuite( int noGuestL, int nights, double totalL, int noaddGuestL)
        {
            DecimalFormat twodec = new DecimalFormat("0.00");
            double vat; 
            System.out.println("\nRoom Type         : Suite Room");
            System.out.println("Price per Night   : " + twodec.format(lPrice()));
            System.out.println("Number of guest/s : " + noGuestL);
            System.out.println("Additional guest/s: " + noaddGuestL);
            System.out.println("Number of night/s : " + nights);
            System.out.println("Sub Total         : Php " + twodec.format(totalL));
            vat = totalL*0.12;
            totalL+=vat;
            System.out.println("Value Added Tax   : " + twodec.format(vat));
            System.out.println("Total             : Php " + twodec.format(totalL));   
        }
        
            public static void transactionConfirmation_L(int noGuestL, int nights, double totalL, int noaddGuestL)  
        {
            Scanner input = new Scanner (System.in);                    
            System.out.println("Do you want to confirm the transaction?"); 
            System.out.print("\n [Y] Yes \t\t\t [N] No : "); //  
            char trans=input.next().charAt(0); 
            trans=Character.toUpperCase(trans);
            System.out.println("\n--------------------------------------------------------------------------------------------------"); 
            
            if (trans=='N')
            {
                roomType_Bill();
            }
            else if (trans== 'Y')
            {
               System.out.println("The transaction is confirmed");
               System.out.println("--------------------------------------------------------------------------------------------------");          
               System.out.println("RECEIPT");
               displayBillDeluxe(noGuestL, nights, totalL, noaddGuestL);
            }
            else 
            {
                System.out.println("Please insert a valid answer");
                System.out.println("--------------------------------------------------------------------------------------------------\n");
                transactionConfirmation_L(noGuestL, nights, totalL, noaddGuestL);
            }
        }
        
}
     
        
        
        
        
      



