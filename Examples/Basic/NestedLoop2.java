package Examples;

import java.util.Scanner;




public class NestedLoop2 {
    public static void main(String[] args)
   {
    
             Scanner input = new Scanner(System.in);
 
     int x,y,num;
        
      System.out.println("-----------------------------");
  
      System.out.print("Input  :   ");
       num=input.nextInt();
   
      System.out.println("Output 1: ");

     
 
            for (x=1;x<=num;x++)
            {

              System.out.print("*  ");

            }
     
       System.out.println("\n-----------------------------");
      
      
       System.out.println("Output 2: ");
 
      
          for ( y=1; y<=num;y++)
          {
              
                for (x=1;x<=num;x++)
                {

                  System.out.print("*  ");

                }
            
               System.out.println();    
             
          }  
              
       System.out.println("\n-----------------------------");
      
      
       System.out.println("Output 3: ");
 
          
          for ( y=1; y<=num;y++)
          {
              
                for (x=1;x<=y;x++)
                {

                  System.out.print("*  ");

                }
                System.out.println();    
             
          }   

           
         System.out.println("\n-----------------------------");
      
      
       System.out.println("Output 4a: ");
 
      
          for ( y=1; y<=num;y++)
          {
              
                for (x=y;x<=num;x++)
                {

                  System.out.print("*  ");

                }
            
               System.out.println();    
             
          }  
              
             System.out.println("\n-----------------------------");
      
       System.out.println("Output 4b: ");
 
      
          for ( y=1; y<=num;y++)
          {
              
                for (x=num;x>=y;x--)
                {

                  System.out.print("*  ");

                }
            
               System.out.println();    
             
          }  
              
       System.out.println("\n-----------------------------");
      
         System.out.println("Output 4c: ");
 
      
          for ( y=num; y>=1;y--)
          {
              
                for (x=1;x<=y;x++)
                {

                  System.out.print("*  ");

                }
            
               System.out.println();    
             
          }  
              
       System.out.println("\n-----------------------------");
      
       
       
       
       
       
       
      
     
      
   }
}

