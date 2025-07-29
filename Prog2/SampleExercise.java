
package Prog2;
import java.util.*;

public class SampleExercise
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        String employeeName = input.next();
        
        System.out.print ("Enter Department Code: ");
        String departmentCode = input.next().toUpperCase();
        
        int rateHour=0;
        
        if (departmentCode.equals("MIS") || departmentCode.equals("mis"))                      
        {
            System.out.print("Enter Position Code: ");
            int positionCode = input.nextInt(); 
            
            if (positionCode == 011 || positionCode == 11)
            {
                System.out.print("Enter Sub-Position : ");
                String Subposition = input.next().toUpperCase(); 
                
                if ( Subposition.equals("011A")) // or  "011a" || "011A" then delete .toUpperCase(); because of it has numbers. 
                {
                      System.out.println("Position: Senior Programmer");  
                              rateHour = 1000;
                          
                }
                else if (Subposition.equals("011B"))
                {
                        System.out.println("Position: Junior Programmer");
                              rateHour = 500;
                }
                else 
                {
                    System.out.print("Invalid sub-position code for Programmer!");
                    System.out.println("Goodbye...");
                    System.exit(0);
                }
               
            }
            
            else if (positionCode ==012 || positionCode ==12)
            {
                System.out.print("Enter Sub-Position : ");
                String Subposition = input.next().toUpperCase(); 
                
                if ( Subposition.equals("012A"))
                {
                      System.out.println("Position: System Analyst");  
                              rateHour = 900;
                          
                }
                else if (Subposition.equals("012B"))
                {
                        System.out.println("Position: Data Analyst");
                              rateHour = 800;
                }
                else 
                {
                    System.out.print("Invalid sub-position code for Analyst!");
                    System.out.println("Goodbye...");
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("Invalid Position Code");
                System.exit(0);
            }
        
        } //mis
        
        else if (departmentCode.equals("MKT"))
        {
            
            System.out.print("Enter Position Code: ");
            int positionCode = input.nextInt();  
            
            
            if (positionCode==021 || positionCode==21)
            {
                    System.out.println("Position: Advertiser");  
                     rateHour = 400;
            }
            
            else if (positionCode==022 || positionCode==22)
            {
                    System.out.println("Position: Staff");  
                     rateHour = 350;
            }
            
            else
            {
                    System.out.println("Invalid Position Code");
                    System.exit(0);
            }
        }
        
        else if (departmentCode.equals("ACT"))
        {
            System.out.print("Enter Position Code: ");
            int positionCode = input.nextInt();  
            
            if (positionCode==031 || positionCode==31)
            {
                    System.out.println("Position: Chief");  
                     rateHour = 550;
            }
            
            else  if (positionCode==032 || positionCode==32)
            {
                    System.out.println("Position: Cashier");  
                     rateHour = 450;
            }
            
            else
            {
                    System.out.println("Invalid Position Code");
                    System.exit(0);
            }
        }
        
        else
        {
        System.out.println("Invalid Department Code");
        System.exit(0);
        }
       
        System.out.print("Enter the number of hours worked: ");
        double hoursWork = input.nextDouble();
        
        System.out.print("Enter Status Code : ");
        String statusCode = input.next().toUpperCase();
        
        
        double gross = hoursWork * rateHour;     
        System.out.println ("Gross Salary is: " + gross);
        
        double birTax =0;
        double secTax =0;
        
        if (statusCode.equals("HOF")) 
        {
            birTax = gross * .10;
            secTax = gross * 0.05;
        }
     
        else if (statusCode.equals("SWD")) 
        {
            birTax = gross * .15;
            secTax = gross * 0.10;
        }
        else if (statusCode.equals("SOD")) 
        {
            birTax = gross * .20;
            secTax = gross * 0.15;
        }
        
        double deduction = birTax + secTax;
        double net = gross - deduction; 
        
        System.out.println ("Total Deduction: " + deduction);
        System.out.println ("Net Salary: " + net);
        
    }
          
}
