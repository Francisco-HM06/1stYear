// Hebrew's Book Cafe
// BSIT 1C-G1
// All rights reserved 2024-2025.
package Project;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class FinalProject_ComProg2_1
{
    static String defUsername = "admin1";
    static String defPassword = "adminpass1";
    
   
    
    public static void main(String[] args)
    {
        loginMenu();
    }

    public static void loginMenu()
    {
        Scanner x = new Scanner(System.in);
        
        System.out.println("WELCOME!");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("| [L] Log In |     | [A] Account Setting |     | [E] Exit |");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.print("Choose an option: ");
        try
        {
            char choice = Character.toUpperCase(x.next().charAt(0));
            String usernameTry = "";
            String passTry = "";
            int tries = 0;

            switch (choice)
            {
                case 'L':
                    System.out.print("Enter username: ");
                    usernameTry = x.next();
                    if (!usernameTry.equals(defUsername))
                    {
                        System.out.println("Account does not exist.\n");
                        loginMenu();
                        return;
                    }
                    do
                    {
                        System.out.print("Enter Password: ");
                        passTry = x.next();
                        if (!passTry.equals(defPassword))
                        {
                             System.out.println("Incorrect password. " +(2 - tries) +" attempt/s remaining.");
                             tries++;
                        }
                        if (passTry.equals(defPassword))
                        {
                            mainMenu();
                            return;
                        }
                    }
                    while (tries < 3);
                    System.out.println("Too many failed attempts. Try again later.\n");
                    break;

                case 'A':
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("| [C] Change Credentials |     | [V] View Credentials |     | [B] Back |");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.print("Choose an action: ");
                    char selection = Character.toUpperCase(x.next().charAt(0));
                    switch (selection)
                    {
                        case 'C': 
                            System.out.println("\nC H A N G E  C R E D E N T I A L S");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                            System.out.print("Enter current username: ");
                            String currentUser = x.next();
                            if (!currentUser.equals(defUsername))
                            {
                                System.out.println("Account does not exist.\n");
                                loginMenu();
                            }
                            System.out.print("Enter current password: ");
                            String currentPass = x.next();
                            if (currentPass.equals(defPassword))
                            {
                                String newUsername;
                                while (true)
                                {
                                    System.out.print("Enter new username with at least 5 characters: ");
                                    newUsername = x.next();
                                    if (newUsername.length()>5)
                                    {
                                        break;
                                    }
                                    else 
                                    {
                                        System.out.println("Username must be at least 5 characters.");
                                    }
                                }      
                            String newPassword;
                            while (true)
                            {
                                System.out.print("Enter new password with 8 charaters "
                                                + "with uppercase,\nspecial character and number: ");
                                newPassword = x.next(); 
                                boolean number = false;
                                boolean specialChar = false;
                                boolean upperCase = false;
                                for (int a=0; a<newPassword.length(); a++)
                                {
                                    char b = newPassword.charAt(a);
                                    if (b >= '0' && b <= '9')
                                    {
                                        number = true;
                                    }
                                    if (!((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b >= '0' && b <= '9')))
                                    {
                                        specialChar = true;
                                    }
                                    if  (b >= 'A' && b <= 'Z')
                                    {
                                        upperCase = true;
                                    }
                                }    
                                if (newPassword.length() >= 8 && number && specialChar && upperCase)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Password must be at least 8 characters with uppercase, special character and number.");
                                }   
                            }
                            defUsername = newUsername;
                            defPassword = newPassword;
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                            System.out.println("Credentials updated!\n");
                            loginMenu();
                            }
                            else
                            {
                            System.out.println("Incorrect current password.\n");
                            }
                        break;
                    
                    case 'V':
                            System.out.println("Username: "+ defUsername);
                            System.out.println("Password: ********");
                            System.out.print("View password? (Y/N): ");
                            char select = Character.toUpperCase(x.next().charAt(0));
                            switch (select)
                            {
                                case 'Y':
                                    System.out.print("Enter username: ");
                                    usernameTry = x.next();
                                    if (!usernameTry.equals(defUsername))
                                    {
                                        System.out.println("Account does not exist.\n");
                                        loginMenu();
                                    }
                                    if (usernameTry.equals(defUsername))
                                        System.out.print("Enter Password: ");
                                        passTry = x.next();
                                        if (!passTry.equals(defPassword))
                                        {
                                            System.out.println("Incorrect password. Try again later.\n");
                                        }
                                        if (passTry.equals(defPassword))
                                        {
                                            System.out.println("Password: "+ defPassword+ "\n");
                                        }
                                    loginMenu();
                                    break;
                                case 'N':
                                    System.out.print("\n");
                                    loginMenu();
                                    break;
                                    
                                default:
                                    System.out.println("Invalid action.\n");
                                    loginMenu();
                            }
                            break;
                            
                    case 'B':
                            System.out.print("\n");
                            loginMenu();
                            break;
                    
                    default:
                        System.out.println("Invalid action.\n");
                        loginMenu();
                        break;       
                    }
                        
                case 'E':
                        System.out.print("Proceed to exit? (Y/N): ");
                        char confirm = Character.toUpperCase(x.next().charAt(0));
                        if (confirm=='Y')
                        {
                            System.out.println("Exiting program...\n");
                            System.exit(0);
                        }
                        else if (confirm=='N')
                        {
                            System.out.print("\n");
                            loginMenu();
                        }
                        else
                        {
                            System.out.println("Invalid selection. Returning to log in.\n");
                            loginMenu();
                        }
                        break;

                default:
                        System.out.println("Invalid choice.\n");
                        loginMenu();
                        break;
            }
        }
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred.");
        }
    }


    public static void mainMenu()
    {   
        int maxQuantity=3, minQuantity=0, maximumBookType=5, maximumCustomers=5, costumerCount = 0;
        int lengthOfCode=5;
        
        ArrayList<String>codeOfBooks1 = new ArrayList <>();              ArrayList<Integer> quantityOfBooks1 = new ArrayList <>();    ArrayList<Integer> priceOfBooks1 = new ArrayList <>(); 
            codeOfBooks1.add("IT106_Introduction to Computing_1st Year");           quantityOfBooks1.add(3);                               priceOfBooks1.add(220);  
            codeOfBooks1.add("CC001_Computer Programming 1_1st Year");              quantityOfBooks1.add(3);                               priceOfBooks1.add(220);                                      
            codeOfBooks1.add("CC002_Computer Programming 2_1st Year");              quantityOfBooks1.add(3);                               priceOfBooks1.add(220);  
            codeOfBooks1.add("CC102_Platform Technologies_1st Year");               quantityOfBooks1.add(3);                               priceOfBooks1.add(220);
       
        ArrayList<String>codeOfBooks2 = new ArrayList <>();              ArrayList<Integer> quantityOfBooks2 = new ArrayList <>();    ArrayList<Integer> priceOfBooks2 = new ArrayList <>(); 
            codeOfBooks2.add("DSA01_Data Structures and Algorithms_2nd Year");     quantityOfBooks2.add(3);                                priceOfBooks2.add(220);  
            codeOfBooks2.add("IM001_Information Management_2nd Year");             quantityOfBooks2.add(3);                                priceOfBooks2.add(220);                                      
            codeOfBooks2.add("OOP01_Object-oriented Programming_2nd Year");        quantityOfBooks2.add(3);                                priceOfBooks2.add(220);
               
        ArrayList<String>codeOfBooks3 = new ArrayList <>();              ArrayList<Integer> quantityOfBooks3 = new ArrayList <>();    ArrayList<Integer> priceOfBooks3 = new ArrayList <>(); 
            codeOfBooks3.add("NET01_Networking 1_3rd Year");                       quantityOfBooks3.add(3);                                priceOfBooks3.add(220);  
            codeOfBooks3.add("QM001_Quantitative Methods_3rd Year");               quantityOfBooks3.add(3);                                priceOfBooks3.add(220);                                      
            codeOfBooks3.add("EDP01_Event-Driven Programming_3rd Year");           quantityOfBooks3.add(3);                                priceOfBooks3.add(220);
               
        ArrayList<String>codeOfBooks4 = new ArrayList <>();              ArrayList<Integer> quantityOfBooks4 = new ArrayList <>();    ArrayList<Integer> priceOfBooks4 = new ArrayList <>(); 
            codeOfBooks4.add("ADS01_Data Structures and Algorithms_4th Year");     quantityOfBooks4.add(3);                                priceOfBooks4.add(220);  
            codeOfBooks4.add("IDA01_Introduction of Data Analytics_4th Year");     quantityOfBooks4.add(3);                                priceOfBooks4.add(220);                                      
            codeOfBooks4.add("WST01_Web Systems and Technologies_4th Year");       quantityOfBooks4.add(3);                                priceOfBooks4.add(220);
        
        String[][] customerInfo = new String[5][5];
        ArrayList<ArrayList<String>> customerOrders = new ArrayList<>();
        ArrayList<ArrayList<Integer>> customerQtys = new ArrayList<>();
        ArrayList<ArrayList<Integer>> customerPrices = new ArrayList<>();
        
        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, 
                    customerQtys, customerPrices, costumerCount, lengthOfCode);
        //=addItemSection(bookCode);
    }
    
    // updated case Sales Report and Log Out
    public static void displayHome(ArrayList<String> codeOfBooks1, ArrayList<Integer> quantityOfBooks1, ArrayList<Integer> priceOfBooks1, 
                                   ArrayList<String>codeOfBooks2, ArrayList<Integer> quantityOfBooks2,  ArrayList<Integer> priceOfBooks2, 
                                   ArrayList<String>codeOfBooks3, ArrayList<Integer> quantityOfBooks3,  ArrayList<Integer> priceOfBooks3, 
                                   ArrayList<String>codeOfBooks4, ArrayList<Integer> quantityOfBooks4,  ArrayList<Integer> priceOfBooks4, 
                                   int maxQuantity,int minQuantity, int maximumBookType, int maximumCustomers, String[][] customerInfo,
                                   ArrayList<ArrayList<String>> customerOrders,
                                   ArrayList<ArrayList<Integer>> customerQtys,
                                   ArrayList<ArrayList<Integer>> customerPrices, int costumerCount, int lengthOfCode)
    {
        Scanner in = new Scanner(System.in);
        int numberOfClient=5;
        System.out.println("\n--------------------------------------------------------------------------------------------------------");
        System.out.println("WELCOME, " + defUsername + "!");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("D A S H  B O A R D");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        
        System.out.println("| [I] INVENTORY | \t | [A] ADD ITEM | \t\t | [S] SALES REPORT |\n\n" + 
                           "| [C] CART VIEW | \t | [M] CUSTOMER MANAGEMENT | \t | [L] LOG OUT |\n\n" +
                           "| [F] ABOUT FORM | \t | [R] LICENSE | \t\t | [V] VIEW ACCOUNT DETAILS");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        
        System.out.print("Enter the Section: ");
        String inputDashBoard =in.next().toUpperCase().trim();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        in.nextLine();

         
        switch (inputDashBoard)
        {
            case "I":
            {
                System.out.println("WELCOME TO INVENTORY\n");
                inventorySectionDisplayOnly(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                            codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4, lengthOfCode);
                
                System.out.println("--------------------------------------------------------------------------------------------------------");
                System.out.println("\t  ACTION: ");
                System.out.println("[S] SEARCH BOOK ITEM, [A] ADD NEW BOOK,  [U] UPDATE, [D] DELETE, [B] <BACK");
                System.out.print("What Action do you Want to Perform? : ");
                String choiceInventory = in.nextLine().trim().toUpperCase();
                System.out.println("--------------------------------------------------------------------------------------------------------");
                
                switch(choiceInventory)
                {
                    case "S":
                    {
                        String anotherBookTransaction;
                        
                        do
                        {
                            int searchError=0;
                            String searchCode;
                            int searchIndex=-1;
                            do
                            {
                                System.out.print("Enter the Code of the Book Item to Search: ");
                                searchCode=in.next().toUpperCase().trim();
                                if(searchCode.length()!=lengthOfCode){
                                    System.out.println("Invalid Code of the Book Item");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");  
                                }
                            }while(searchCode.length()!=lengthOfCode);

                            for (int ctr=0; ctr<1; ctr++)
                            {
                                searchIndex=searchBookItem(codeOfBooks1, quantityOfBooks1, 
                                            priceOfBooks1, searchIndex,  searchCode, lengthOfCode);
                                if(searchIndex>-1)
                                    searchError++;
                                searchIndex=searchBookItem(codeOfBooks2, quantityOfBooks2, 
                                            priceOfBooks2, searchIndex,  searchCode, lengthOfCode);
                               if(searchIndex>-1)
                                    searchError++;
                                searchIndex=searchBookItem(codeOfBooks3, quantityOfBooks3, 
                                            priceOfBooks3, searchIndex,  searchCode, lengthOfCode);
                                if(searchIndex>-1)
                                    searchError++;
                                searchIndex=searchBookItem(codeOfBooks4, quantityOfBooks4, 
                                            priceOfBooks4, searchIndex,  searchCode, lengthOfCode);
                                if(searchIndex>-1)
                                    searchError++;
                            }

                            if(searchError==0)
                            {
                                System.out.println(searchCode + " Does Not Exist in Any Category. Please Try Again");
                                System.out.println("--------------------------------------------------------------------------------------------------------");
                            }
                            
                        System.out.print("Do You Want to Search Another Book?"
                         + "\n [YES] [NO]: ");
                        anotherBookTransaction=in.next();
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        
                        }while(anotherBookTransaction.equalsIgnoreCase("YES"));
                        
                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                     codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                      maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, 
                                      customerQtys, customerPrices,costumerCount, lengthOfCode);
                         break;
                        } //case S
                    
                    //05-06
                    case "A":
                    {
                        String anotherBookTransaction="";
                        do
                        {
                        char selectedCategory=selectingCategory();

                        if(selectedCategory=='1')
                            {
                                if(codeOfBooks1.size()<maximumBookType)
                                {
                                    String category="_1st Year";
                                    codeOfBooks1.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                                    quantityOfBooks1=addNewQuantity(quantityOfBooks1,maxQuantity, minQuantity); //quantity
                                    priceOfBooks1=addNewPrice(priceOfBooks1);    //price
                                    System.out.println("Successfully Added");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");
                                }

                                else 
                                {
                                    System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                     System.out.println("--------------------------------------------------------------------------------------------------------");
                                    break;
                                }
                            }

                        else if(selectedCategory=='2')
                            {   
                                if(codeOfBooks2.size()<maximumBookType)
                                {
                                    String category="_2nd Year";
                                    codeOfBooks2.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                                    quantityOfBooks2=addNewQuantity(quantityOfBooks2, maxQuantity, minQuantity); // quantity
                                    priceOfBooks2=addNewPrice(priceOfBooks2);
                                    System.out.println("Successfully Added");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");
                               }

                                else 
                                {
                                    System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                     System.out.println("--------------------------------------------------------------------------------------------------------");
                                    break;
                                }
                            }
                        else if(selectedCategory=='3')
                            { 
                                 if(codeOfBooks3.size()<maximumBookType) //it's 3
                                {
                                     
                                    String category="_3rd Year";
                                    codeOfBooks3.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                                    quantityOfBooks3=addNewQuantity(quantityOfBooks3,maxQuantity, minQuantity); //quantity
                                    priceOfBooks3=addNewPrice(priceOfBooks3);    //price
                                    System.out.println("Successfully Added");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");

                                }
                                 else 
                                {
                                    System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                    break;
                                }
                            }

                        else if(selectedCategory=='4') // it's 4
                        {
                             if(codeOfBooks4.size()<maximumBookType) //it's 3
                                {
                                    String  category="_4th Year";
                                    codeOfBooks4.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                                    quantityOfBooks4=addNewQuantity(quantityOfBooks4,maxQuantity, minQuantity); //quantity
                                    priceOfBooks4=addNewPrice(priceOfBooks4);    //price
                                    System.out.println("Successfully Added");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");

                                }
                             else 
                                {
                                    System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");
                                    break;
                                }
                        }

                        else
                        { 
                            System.out.println("Invalid Category...Cannot Execute the Action");
                            System.out.println("--------------------------------------------------------------------------------------------------------"); 
                            displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                     codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                      maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount,lengthOfCode);
                            break;
                        }
                        
                        System.out.print("Do You Want to add Another Book?"
                         + "\n [YES] [NO]: ");
                        anotherBookTransaction=in.next();
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        
                        }while(anotherBookTransaction.equalsIgnoreCase("YES"));
                        
                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                     codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                      maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount, lengthOfCode);
                        break;
                    } // end of add new

                    
                    case "U" :
                    {
                        String anotherBookTransaction="", category, whatToUpdate;
                        do
                        {
                            System.out.println("[C] CODE & NAME, [Q] QUANTITY, [A] CATEGORY, [P] PRICE, [B] <BACK" );
                            System.out.print("What Do You Want to Update? : ");
                            whatToUpdate=in.next().trim();
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                            
                            // UPDATED-04-24
                            
                            if(whatToUpdate.equalsIgnoreCase("B") || !whatToUpdate.equalsIgnoreCase("C") && !whatToUpdate.equalsIgnoreCase("Q")
                                    && !whatToUpdate.equalsIgnoreCase("P") && !whatToUpdate.equalsIgnoreCase("A"))
                            {
                                if (!whatToUpdate.equalsIgnoreCase("B") && !whatToUpdate.equalsIgnoreCase("C") && !whatToUpdate.equalsIgnoreCase("Q")
                                    && !whatToUpdate.equalsIgnoreCase("P") && !whatToUpdate.equalsIgnoreCase("A"))
                                        System.out.println(whatToUpdate + " is Invalid Input...Cannot Update the Item");
                                
                                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                            codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                            maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                break;
                            }
                            
                            char selectedCategory=selectingCategory(); //selection of category: '1' means first year
                            
                            if(selectedCategory=='1')
                            {
                                 category="_1st Year";
                                 if(whatToUpdate.equalsIgnoreCase("C"))
                                    codeOfBooks1=updateItemCodeName(codeOfBooks1,codeOfBooks2, codeOfBooks3,codeOfBooks4,category, lengthOfCode, selectedCategory);
                                 else if(whatToUpdate.equalsIgnoreCase("Q"))
                                     quantityOfBooks1=updateItemQuantity(codeOfBooks1,quantityOfBooks1,category,maxQuantity, minQuantity, lengthOfCode);
                                 else if(whatToUpdate.equalsIgnoreCase("P"))
                                     priceOfBooks1=updateItemPrice(codeOfBooks1,priceOfBooks1,category, lengthOfCode);
                                 
                                 else if(whatToUpdate.equalsIgnoreCase("A"))              // CATEGORY; move also the quantity, price
                                                                                            //            change the category too
                                 {
                                     System.out.print("Are You Sure You Want to Update Category? " + 
                                        "\n [YES] [NO]: ");
                                    String categoryConfirmation=in.next().trim();
                                    if(categoryConfirmation.equalsIgnoreCase("YES"))
                                    {
                                         String changeCategoryItem;
                                         do
                                        {
                                            System.out.print("Enter Book Code You Want To Change The Category: ");
                                            changeCategoryItem=in.next().toUpperCase().trim();
                                            System.out.println("--------------------------------------------------------------------------------------------------------");
                                            if(changeCategoryItem.length()!=lengthOfCode){
                                                System.out.println("Invalid Code of the Book Item");
                                                System.out.println("--------------------------------------------------------------------------------------------------------");  
                                            }
                                        }while(changeCategoryItem.length()!=lengthOfCode);
                                        
                                        for(int ctr=0; ctr<codeOfBooks1.size(); ctr++) //change codeOfBooks
                                        {
                                            if(codeOfBooks1.get(ctr).indexOf(changeCategoryItem,0)>-1) //change codeOfBooks
                                            {
                                                System.out.println("[1] 1st YEAR , [2] 2nd YEAR, [3] 3rd YEAR, [4] 4th YEAR");
                                                System.out.print("In Which Category You Want to Move the Item: ");
                                                char destinedCategory =in.next().charAt(0);
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                                
                                                if(destinedCategory=='1')
                                                {
                                                    System.out.println("Book Item is Already in the Category. Kindly Try Again");
                                                    System.out.println("--------------------------------------------------------------------------------------------------------");
                                                    break;
                                                }

                                                else if(destinedCategory=='2' && codeOfBooks2.size()<maximumBookType)
                                                {
                                                    String Newcategory="_2nd Year"; //codeOfBooks1
                                                    codeOfBooks2.add(codeOfBooks1.get(ctr).replace(category,Newcategory));
                                                    quantityOfBooks2.add(quantityOfBooks1.get(ctr));
                                                    priceOfBooks2.add(priceOfBooks1.get(ctr));
                                                }

                                                else if(destinedCategory=='3'&& codeOfBooks3.size()<maximumBookType)
                                                {
                                                    String Newcategory="_3rd Year";
                                                    codeOfBooks3.add(codeOfBooks1.get(ctr).replace(category,Newcategory));
                                                    quantityOfBooks3.add(quantityOfBooks1.get(ctr));
                                                    priceOfBooks3.add(priceOfBooks1.get(ctr));

                                                }

                                                else if(destinedCategory=='4'&& codeOfBooks4.size()<maximumBookType)
                                                {
                                                    String Newcategory="_4th Year";
                                                    codeOfBooks4.add(codeOfBooks1.get(ctr).replace(category,Newcategory));
                                                    quantityOfBooks4.add(quantityOfBooks1.get(ctr));
                                                    priceOfBooks4.add(priceOfBooks1.get(ctr));
                                                }

                                                else{
                                                    System.out.println("Cannot Move the Item...Invalid Destination Category or");
                                                    System.out.println("You've Reached the Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                                    System.out.println("--------------------------------------------------------------------------------------------------------");
                                                    break;
                                                }
                                                
                                                codeOfBooks1.remove(ctr);
                                                quantityOfBooks1.remove(ctr);
                                                priceOfBooks1.remove(ctr);
                                                
                                                System.out.println( changeCategoryItem + " is Successfully Changed");
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                                break;

                                            } // end of for loop of size of books
                                            if(codeOfBooks1.get(ctr).indexOf(changeCategoryItem,0)==-1 && ctr==(codeOfBooks1.size()-1))
                                            {
                                                System.out.println("Book Code Is Not Found in the Selected Category");          // changed
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                            }
                                        }//for loop
                                    } // yes confirmation

                                    else
                                    {
                                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                                codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                                maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                        break;
                                    }
                                 } // end of category
                                 
                                 else
                                 {
                                     System.out.println("Invalid Input to Update the Item");
                                     System.out.println("--------------------------------------------------------------------------------------------------------");
                                 }

                            } //  1st year

                            else if(selectedCategory=='2')
                                {   
                                    category="_2nd Year";
                                    if(whatToUpdate.equalsIgnoreCase("C"))
                                        codeOfBooks2=updateItemCodeName(codeOfBooks1,codeOfBooks2, codeOfBooks3,codeOfBooks4,category, lengthOfCode,selectedCategory);
                                    else if(whatToUpdate.equalsIgnoreCase("Q"))
                                        quantityOfBooks2=updateItemQuantity(codeOfBooks2,quantityOfBooks2,category, maxQuantity, minQuantity, lengthOfCode);
                                    else if(whatToUpdate.equalsIgnoreCase("P"))
                                        priceOfBooks2=updateItemPrice(codeOfBooks2,priceOfBooks2,category, lengthOfCode);
                                    else if(whatToUpdate.equalsIgnoreCase("A"))              
                                    {
                                        System.out.print("Are You Sure You Want to Update Category? " + 
                                           "\n [YES] [NO]: ");
                                       String categoryConfirmation=in.next().trim();
                                       if(categoryConfirmation.equalsIgnoreCase("YES"))
                                       {
                                             String changeCategoryItem;
                                             do
                                            {
                                                 System.out.print("Enter Book Code You Want To Change The Category: ");
                                                 changeCategoryItem=in.next().toUpperCase().trim();
                                                 System.out.println("--------------------------------------------------------------------------------------------------------");
                                                 if(changeCategoryItem.length()!=lengthOfCode){
                                                     System.out.println("Invalid Code of the Book Item");
                                                     System.out.println("--------------------------------------------------------------------------------------------------------");  
                                                 }
                                            }while(changeCategoryItem.length()!=lengthOfCode);
                                           for(int ctr=0; ctr<codeOfBooks2.size(); ctr++) //change codeOfBooks
                                           {
                                               if(codeOfBooks2.get(ctr).indexOf(changeCategoryItem,0)>-1) //change codeOfBooks
                                               {
                                                   System.out.println("[1] 1st YEAR , [2] 2nd YEAR, [3] 3rd YEAR, [4] 4th YEAR");
                                                   System.out.print("In Which Category You Want to Move the Item: ");
                                                   char destinedCategory =in.next().charAt(0);
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   if(destinedCategory=='1' && codeOfBooks1.size()<maximumBookType)
                                                   {
                                                       String Newcategory="_1st Year";
                                                       codeOfBooks1.add(codeOfBooks2.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks1.add(quantityOfBooks2.get(ctr));
                                                       priceOfBooks1.add(priceOfBooks2.get(ctr));
                                                   }

                                                   else if(destinedCategory=='2')
                                                   {
                                                       System.out.println("Book Item is Already in the Category. Kindly Try Again");
                                                       break;
                                                   }

                                                   else if(destinedCategory=='3' && codeOfBooks3.size()<maximumBookType )
                                                   {
                                                       String Newcategory="_3rd Year";
                                                       codeOfBooks3.add(codeOfBooks2.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks3.add(quantityOfBooks2.get(ctr));
                                                       priceOfBooks3.add(priceOfBooks2.get(ctr));

                                                   }

                                                   else if(destinedCategory=='4' && codeOfBooks4.size()<maximumBookType)
                                                   {
                                                       String Newcategory="_4th Year";
                                                       codeOfBooks4.add(codeOfBooks2.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks4.add(quantityOfBooks2.get(ctr));
                                                       priceOfBooks4.add(priceOfBooks2.get(ctr));
                                                   }

                                                   else{
                                                       System.out.println("Cannot Move the Item...Invalid Destination Category or ");
                                                       System.out.println("You've Reached the Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                                       break;
                                                   }
                                                   codeOfBooks2.remove(ctr);
                                                   quantityOfBooks2.remove(ctr);
                                                   priceOfBooks2.remove(ctr);

                                                   System.out.println( changeCategoryItem + " is Successfully Changed");
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   break;

                                               } // end of for loop of size of books
                                               // change the codeOfBooks
                                               if(codeOfBooks2.get(ctr).indexOf(changeCategoryItem,0)==-1 && ctr==(codeOfBooks2.size()-1))
                                               {
                                                   System.out.println("Book Code Is Not Found in the Selected Category");          // changed
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                               }
                                           }//end of loop
                                       } // yes confirmation

                                       else
                                       {
                                           displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                                   codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                                   maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                           break;
                                       }
                                    } // end of category
                                    
                                    else
                                    {
                                        System.out.println("Invalid Input to Update the Item");
                                        System.out.println("--------------------------------------------------------------------------------------------------------");
                                    }
                                } //2nd year
                            
                            else if(selectedCategory=='3')
                                { 
                                    category="_3rd Year"; 
                                    if(whatToUpdate.equalsIgnoreCase("C"))
                                        codeOfBooks3=updateItemCodeName(codeOfBooks1,codeOfBooks2, codeOfBooks3,codeOfBooks4,category, lengthOfCode,selectedCategory);
                                    else if(whatToUpdate.equalsIgnoreCase("Q"))
                                        quantityOfBooks3=updateItemQuantity(codeOfBooks3,quantityOfBooks3,category, maxQuantity, minQuantity, lengthOfCode);
                                    else if(whatToUpdate.equalsIgnoreCase("P"))
                                        priceOfBooks3=updateItemPrice(codeOfBooks3,priceOfBooks3,category, lengthOfCode);
                                    
                                    else if(whatToUpdate.equalsIgnoreCase("A"))              
                                    {
                                        System.out.print("Are You Sure You Want to Update Category? " + 
                                           "\n [YES] [NO]: ");
                                       String categoryConfirmation=in.next().trim();
                                       if(categoryConfirmation.equalsIgnoreCase("YES"))
                                       {
                                            String changeCategoryItem;
                                              do
                                             {
                                                 System.out.print("Enter Book Code You Want To Change The Category: ");
                                                 changeCategoryItem=in.next().toUpperCase().trim();
                                                 System.out.println("--------------------------------------------------------------------------------------------------------");
                                                 if(changeCategoryItem.length()!=lengthOfCode){
                                                     System.out.println("Invalid Code of the Book Item");
                                                     System.out.println("--------------------------------------------------------------------------------------------------------");  
                                                 }
                                             }while(changeCategoryItem.length()!=lengthOfCode);
                                           for(int ctr=0; ctr<codeOfBooks3.size(); ctr++) //change codeOfBooks
                                           {
                                               if(codeOfBooks3.get(ctr).indexOf(changeCategoryItem,0)>-1) //change codeOfBooks
                                               {
                                                   System.out.println("[1] 1st YEAR , [2] 2nd YEAR, [3] 3rd YEAR, [4] 4th YEAR");
                                                   System.out.print("In Which Category You Want to Move the Item: ");
                                                   char destinedCategory =in.next().charAt(0);
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   if(destinedCategory=='1' && codeOfBooks1.size()<maximumBookType)
                                                   {
                                                       String Newcategory="_1st Year";
                                                       codeOfBooks1.add(codeOfBooks3.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks1.add(quantityOfBooks3.get(ctr));
                                                       priceOfBooks1.add(priceOfBooks3.get(ctr));
                                                   }

                                                   else if(destinedCategory=='2' && codeOfBooks2.size()<maximumBookType)
                                                   {
                                                        String Newcategory="_2nd Year"; //codeOfBooks1
                                                        codeOfBooks2.add(codeOfBooks3.get(ctr).replace(category,Newcategory));
                                                        quantityOfBooks2.add(quantityOfBooks3.get(ctr));
                                                        priceOfBooks2.add(priceOfBooks3.get(ctr));
                                                   }

                                                   else if(destinedCategory=='3')
                                                   {
                                                       System.out.println("Book Item is Already in the Category. Kindly Try Again");
                                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                                       break;
                                                   }

                                                   else if(destinedCategory=='4' && codeOfBooks4.size()<maximumBookType)
                                                   {
                                                       String Newcategory="_4th Year";
                                                       codeOfBooks4.add(codeOfBooks3.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks4.add(quantityOfBooks3.get(ctr));
                                                       priceOfBooks4.add(priceOfBooks3.get(ctr));
                                                   }

                                                   else{
                                                       System.out.println("Cannot Move the Item...Invalid Destination Category or ");
                                                       System.out.println("You've Reached the Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                                       break;
                                                   }
                                                   codeOfBooks3.remove(ctr);
                                                   quantityOfBooks3.remove(ctr);
                                                   priceOfBooks3.remove(ctr);
                                                   System.out.println( changeCategoryItem + "  is Successfully Changed");
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   break;

                                               } // end of for loop of size of books
                                               // change the codeOfBooks
                                               if(codeOfBooks3.get(ctr).indexOf(changeCategoryItem,0)==-1 && ctr==(codeOfBooks3.size()-1))
                                               {
                                                   System.out.println("Book Code Is Not Found in the Selected Category");          // changed
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                               }
                                           }//end of loop
                                       } // yes confirmation

                                       else
                                       {
                                           displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                                   codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                                   maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                           break;
                                       }
                                    } // end of category
                                    else
                                    {
                                        System.out.println("Invalid Input to Update the Item");
                                        System.out.println("--------------------------------------------------------------------------------------------------------");
                                    }
                                }// 3rd year

                            else if(selectedCategory=='4')
                                {   
                                    category="_4th Year";
                                    if(whatToUpdate.equalsIgnoreCase("C"))
                                        codeOfBooks4=updateItemCodeName(codeOfBooks1,codeOfBooks2, codeOfBooks3,codeOfBooks4,category, lengthOfCode,selectedCategory);
                                    else if(whatToUpdate.equalsIgnoreCase("Q"))
                                        quantityOfBooks4=updateItemQuantity(codeOfBooks4,quantityOfBooks4,category, maxQuantity, minQuantity, lengthOfCode);
                                    else if(whatToUpdate.equalsIgnoreCase("P"))
                                        priceOfBooks4=updateItemPrice(codeOfBooks4,priceOfBooks4,category, lengthOfCode);
                                    
                                    else if(whatToUpdate.equalsIgnoreCase("A"))              
                                    {
                                        System.out.print("Are You Sure You Want to Update Category? " + 
                                           "\n [YES] [NO]: ");
                                       String categoryConfirmation=in.next().trim();
                                       if(categoryConfirmation.equalsIgnoreCase("YES"))
                                       {
                                           String changeCategoryItem;
                                            do
                                           {
                                               System.out.print("Enter Book Code You Want To Change The Category: ");
                                               changeCategoryItem=in.next().toUpperCase().trim();
                                               System.out.println("--------------------------------------------------------------------------------------------------------");
                                               if(changeCategoryItem.length()!=lengthOfCode){
                                                   System.out.println("Invalid Code of the Book Item");
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");  
                                               }
                                           }while(changeCategoryItem.length()!=lengthOfCode);
                                           for(int ctr=0; ctr<codeOfBooks4.size(); ctr++) //change codeOfBooks
                                           {
                                               if(codeOfBooks4.get(ctr).indexOf(changeCategoryItem,0)>-1) //change codeOfBooks
                                               {
                                                   System.out.println("[1] 1st YEAR , [2] 2nd YEAR, [3] 3rd YEAR, [4] 4th YEAR");
                                                   System.out.print("In Which Category You Want to Move the Item: ");
                                                   char destinedCategory =in.next().charAt(0);
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   if(destinedCategory=='1' && codeOfBooks1.size()<maximumBookType)
                                                   {
                                                       String Newcategory="_1st Year";
                                                       codeOfBooks1.add(codeOfBooks4.get(ctr).replace(category,Newcategory));
                                                       quantityOfBooks1.add(quantityOfBooks4.get(ctr));
                                                       priceOfBooks1.add(priceOfBooks4.get(ctr));
                                                   }

                                                   else if(destinedCategory=='2' && codeOfBooks2.size()<maximumBookType)
                                                   {
                                                        String Newcategory="_2nd Year"; //codeOfBooks1
                                                        codeOfBooks2.add(codeOfBooks4.get(ctr).replace(category,Newcategory));
                                                        quantityOfBooks2.add(quantityOfBooks4.get(ctr));
                                                        priceOfBooks2.add(priceOfBooks4.get(ctr));
                                                   }

                                                   else if(destinedCategory=='3' && codeOfBooks3.size()<maximumBookType)
                                                   {
                                                        String Newcategory="_3rd Year";
                                                        codeOfBooks3.add(codeOfBooks4.get(ctr).replace(category,Newcategory));
                                                        quantityOfBooks3.add(quantityOfBooks4.get(ctr));
                                                        priceOfBooks3.add(priceOfBooks4.get(ctr));
                                                   }

                                                   else if(destinedCategory=='4')
                                                   {
                                                       System.out.println("Book Item is Already in the Category. Kindly Try Again");
                                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                                       break;
                                                   }

                                                   else{
                                                       System.out.println("Cannot Move the Items..Invalid Destination Category or ");
                                                       System.out.println("You've Reached the Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                                       break;
                                                   }
                                                   codeOfBooks4.remove(ctr);
                                                   quantityOfBooks4.remove(ctr);
                                                   priceOfBooks4.remove(ctr);
                                                   System.out.println( changeCategoryItem + " is Sucessfully Changed");
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                                   break;

                                               } // end of for loop of size of books
                                               // change the codeOfBooks
                                               if(codeOfBooks4.get(ctr).indexOf(changeCategoryItem,0)==-1 && ctr==(codeOfBooks4.size()-1))
                                               {
                                                   System.out.println("Book Code Is Not Found in the Selected Category");          // changed
                                                   System.out.println("--------------------------------------------------------------------------------------------------------");
                                               }
                                           }//end of loop
                                       } // yes confirmation

                                       else
                                       {
                                           displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                                   codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                                   maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                           break;
                                       }
                                    }// end of category
                                    
                                    else
                                    {
                                        System.out.println("Invalid Input to Update the Item");
                                        System.out.println("--------------------------------------------------------------------------------------------------------");
                                    }
                                }// 4th year
                            
                            else
                            { 
                                System.out.println("Invalid Category...Cannot Execute the Action");
                                System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                         codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                          maxQuantity, minQuantity, maximumBookType, maximumCustomers,customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                                break;
                            }
                            
                            System.out.print("Do You Want to Update Another Book Item?"
                             + "\n [YES] [NO]: ");
                            anotherBookTransaction=in.next();
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                           
                        }while(anotherBookTransaction.equalsIgnoreCase("YES"));
                        
                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                        break;
                    } // end of update section
                    
                    case "D":
                    {
                        String anotherBookTransaction="";
                        System.out.print("Are You Sure You Want to Delete Book Item? \n" +
                                "[YES] [NO] : " );
                        String deleteConfirmation = in.next().trim();
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        
                        if(deleteConfirmation.equalsIgnoreCase("YES"))
                        {
                            do
                            {
                                char selectedCategory=selectingCategory();
                                if(selectedCategory=='1')
                                {
                                    String deleteItem;
                                    do
                                   {
                                       System.out.print("Enter Book Code of the Book You Want To Delete: ");
                                       deleteItem=in.next().toUpperCase().trim();
                                       System.out.println("--------------------------------------------------------------------------------------------------------");
                                       if(deleteItem.length()!=lengthOfCode){
                                           System.out.println("Invalid Code of the Book Item");
                                           System.out.println("--------------------------------------------------------------------------------------------------------");  
                                       }
                                   }while(deleteItem.length()!=lengthOfCode);
                                   
                                    for(int ctr=0; ctr<codeOfBooks1.size(); ctr++)
                                    {
                                        if(codeOfBooks1.get(ctr).indexOf(deleteItem,0)>-1)
                                        {
                                        codeOfBooks1.remove(ctr);
                                        quantityOfBooks1.remove(ctr);
                                        priceOfBooks1.remove(ctr);
                                        System.out.println( deleteItem + " is Successfully Removed");
                                        System.out.println("--------------------------------------------------------------------------------------------------------");
                                        break;

                                        }
                                        if(codeOfBooks1.get(ctr).indexOf(deleteItem,0)==-1 && ctr==(codeOfBooks1.size()-1))
                                        {
                                            System.out.println("Book Code Is Not Found in the Selected Category");
                                            System.out.println("--------------------------------------------------------------------------------------------------------");
                                        }
                                    }
                                }

                                else if(selectedCategory=='2')
                                    {
                                        String deleteItem;
                                        do
                                       {
                                           System.out.print("Enter Book Code of the Book You Want To Delete: ");
                                           deleteItem=in.next().toUpperCase().trim();
                                           System.out.println("--------------------------------------------------------------------------------------------------------");
                                           if(deleteItem.length()!=lengthOfCode){
                                               System.out.println("Invalid Code of the Book Item");
                                               System.out.println("--------------------------------------------------------------------------------------------------------");  
                                           }
                                       }while(deleteItem.length()!=lengthOfCode);
                                        
                                        for(int ctr=0; ctr<codeOfBooks2.size(); ctr++)
                                        {
                                            if(codeOfBooks2.get(ctr).indexOf(deleteItem,0)>-1)
                                            {
                                            codeOfBooks2.remove(ctr);
                                            quantityOfBooks2.remove(ctr);
                                            priceOfBooks2.remove(ctr);
                                            System.out.println( deleteItem + " is Successfully Removed");
                                            System.out.println("--------------------------------------------------------------------------------------------------------");
                                            break;

                                            }
                                            if(codeOfBooks2.get(ctr).indexOf(deleteItem,0)==-1 && ctr==(codeOfBooks2.size()-1))
                                            {
                                                System.out.println("Book Code Is Not Found in the Selected Category");
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                            }
                                        }
                                    }
                                else if(selectedCategory=='3')
                                    {   
                                        String deleteItem;
                                        do
                                       {
                                           System.out.print("Enter Book Code of the Book You Want To Delete: ");
                                           deleteItem=in.next().toUpperCase().trim();
                                           System.out.println("--------------------------------------------------------------------------------------------------------");
                                           if(deleteItem.length()!=lengthOfCode){
                                               System.out.println("Invalid Code of the Book Item");
                                               System.out.println("--------------------------------------------------------------------------------------------------------");  
                                           }
                                       }while(deleteItem.length()!=lengthOfCode);
                                        for(int ctr=0; ctr<codeOfBooks3.size(); ctr++)
                                        {
                                            if(codeOfBooks3.get(ctr).indexOf(deleteItem,0)>-1)
                                            {
                                            codeOfBooks3.remove(ctr);
                                            quantityOfBooks3.remove(ctr);
                                            priceOfBooks3.remove(ctr);
                                            System.out.println( deleteItem + " is Successfully Removed");
                                            System.out.println("--------------------------------------------------------------------------------------------------------");
                                            break;

                                            }
                                            if(codeOfBooks3.get(ctr).indexOf(deleteItem,0)==-1 && ctr==(codeOfBooks3.size()-1))
                                            {
                                                System.out.println("Book Code Is Not Found in the Selected Category");
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                            }
                                        }

                                    }

                                else if(selectedCategory=='4')
                                    { 
                                        String deleteItem;
                                        do
                                       {
                                           System.out.print("Enter Book Code of the Book You Want To Delete: ");
                                           deleteItem=in.next().toUpperCase().trim();
                                           System.out.println("--------------------------------------------------------------------------------------------------------");
                                           if(deleteItem.length()!=lengthOfCode){
                                               System.out.println("Invalid Code of the Book Item");
                                               System.out.println("--------------------------------------------------------------------------------------------------------");  
                                           }
                                       }while(deleteItem.length()!=lengthOfCode);
                                        for(int ctr=0; ctr<codeOfBooks4.size(); ctr++)
                                        {
                                            if(codeOfBooks4.get(ctr).indexOf(deleteItem,0)>-1)
                                            {
                                            codeOfBooks4.remove(ctr);
                                            quantityOfBooks4.remove(ctr);
                                            priceOfBooks4.remove(ctr);
                                            System.out.println( deleteItem + " is Successfully Removed");
                                            System.out.println("--------------------------------------------------------------------------------------------------------");
                                            break;

                                            }
                                            if(codeOfBooks4.get(ctr).indexOf(deleteItem,0)==-1 && ctr==(codeOfBooks4.size()-1))
                                            {
                                                System.out.println("Book Code Is Not Found in the Selected Category");
                                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                            }
                                        }  
                                    }

                                else
                                     { 
                                        System.out.println("Invalid Category...Cannot Execute the Action");
                                        System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                                 codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                                  maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount, lengthOfCode);
                                        break;
                                    }

                                System.out.print("Do You Want to Remove Another Book?"
                                 + "\n [YES] [NO]: ");
                                anotherBookTransaction=in.next();
                                System.out.println("--------------------------------------------------------------------------------------------------------");
                            }while(!anotherBookTransaction.equalsIgnoreCase("NO"));
                        } // yes
                        
                        else if(deleteConfirmation.equalsIgnoreCase("NO"))
                        {
                            displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                            codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                            maxQuantity, minQuantity, maximumBookType, maximumCustomers,customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                            break;   
                        }
                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                        break;
                    } // end of case DELETE
                    
                    case "B":
                    {
                    displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                    break;
                    }// end of case back section
                    
                    default :
                    {
                        System.out.println("invalid Action");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                        break;
                    }
                } //end of switch of Actions Under Inventory
            break;
            } // end of case I - Inventory
            
            //05-06
            case "A":
            {
                System.out.println("ADD ITEM SECTION");
                
                
                String anotherBookTransaction="";
                do
                {
                char selectedCategory=selectingCategory();

                if(selectedCategory=='1')
                    {
                        if(codeOfBooks1.size()<maximumBookType)
                        {
                            String category="_1st Year";
                            codeOfBooks1.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                            quantityOfBooks1=addNewQuantity(quantityOfBooks1,maxQuantity, minQuantity); //quantity
                            priceOfBooks1=addNewPrice(priceOfBooks1);    //price
                            System.out.println("Successfully Added");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                        }

                        else 
                        {
                            System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                             System.out.println("--------------------------------------------------------------------------------------------------------");
                            break;
                        }
                    }

                else if(selectedCategory=='2')
                    {   
                        if(codeOfBooks2.size()<maximumBookType)
                        {
                            String category="_2nd Year";
                            codeOfBooks2.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                            quantityOfBooks2=addNewQuantity(quantityOfBooks2, maxQuantity, minQuantity); // quantity
                            priceOfBooks2=addNewPrice(priceOfBooks2);
                            System.out.println("Successfully Added");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                       }

                        else 
                        {
                            System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                             System.out.println("--------------------------------------------------------------------------------------------------------");
                            break;
                        }
                    }
                else if(selectedCategory=='3')
                    { 
                         if(codeOfBooks3.size()<maximumBookType) //it's 3
                        {

                            String category="_3rd Year";
                            codeOfBooks3.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                            quantityOfBooks3=addNewQuantity(quantityOfBooks3,maxQuantity, minQuantity); //quantity
                            priceOfBooks3=addNewPrice(priceOfBooks3);    //price
                            System.out.println("Successfully Added");
                            System.out.println("--------------------------------------------------------------------------------------------------------");

                        }
                         else 
                        {
                            System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                            break;
                        }
                    }

                else if(selectedCategory=='4') // it's 4
                {
                     if(codeOfBooks4.size()<maximumBookType) //it's 3
                        {
                            String  category="_4th Year";
                            codeOfBooks4.add(addNewBookItem(codeOfBooks1,codeOfBooks2,codeOfBooks3,codeOfBooks4,category, lengthOfCode));
                            quantityOfBooks4=addNewQuantity(quantityOfBooks4,maxQuantity, minQuantity); //quantity
                            priceOfBooks4=addNewPrice(priceOfBooks4);    //price
                            System.out.println("Successfully Added");
                            System.out.println("--------------------------------------------------------------------------------------------------------");

                        }
                     else 
                        {
                            System.out.println("Maximum of " + maximumBookType + " Types of Book per Year Level (1st - 4th Year)");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                            break;
                        }
                }

                else
                { 
                    System.out.println("Invalid Category...Cannot Execute the Action");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                             codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                              maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount,lengthOfCode);
                    break;
                }

                System.out.print("Do You Want to add Another Book?"
                 + "\n [YES] [NO]: ");
                anotherBookTransaction=in.next();
                System.out.println("--------------------------------------------------------------------------------------------------------");

                }while(anotherBookTransaction.equalsIgnoreCase("YES"));

                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                             codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                              maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount, lengthOfCode);
                break;
            } //end of case A
            
            case "C": {
                System.out.println("CART VIEW SECTION");
                DecimalFormat df = new DecimalFormat("0.00");
                int bookPrice = 0;
                int bookStock = 0;
                int category = -1;
                int numQuan = 0;
                double totalPrice = 0;
                double installment = 0;
                double remainBal = 0;
                double itemTotal =0; 
                double totalItemVat =0; 
                double itemDiscount = 0;
                String bookName = "";
                String bookCategory = "";
                
                while (costumerCount < maximumCustomers) {

                    ArrayList<String> orders = new ArrayList<>();
                    ArrayList<Integer> qtys = new ArrayList<>();
                    ArrayList<Integer> prices = new ArrayList<>();
                    System.out.print("Customer Name: ");
                    String inputName = in.nextLine().trim().toUpperCase();

                    int existingCustomerIndex = -1;
                    for (int i = 0; i < costumerCount; i++) {
                        if (customerInfo[i][0] != null && customerInfo[i][0].equalsIgnoreCase(inputName)) {
                            existingCustomerIndex = i;
                            break;
                        }
                    }

                    int currentIndex;
                    if (existingCustomerIndex != -1) {
                        currentIndex = existingCustomerIndex;
                        System.out.println("Existing customer found. Adding to previous data...");
                        System.out.print("Change Payment Method? Current: " + customerInfo[currentIndex][1] + " [Y/N]: ");
                        String changePayment = in.next().toUpperCase();
                        if (changePayment.equals("Y")) {
                            System.out.print("New Payment Method (C/I): ");
                            customerInfo[currentIndex][1] = in.next().toUpperCase();
                    }
                    } else {
                        currentIndex = costumerCount;
                        customerInfo[currentIndex][0] = inputName;
                        do {
                            System.out.print("Payment Method: |[C] Cash | |[I] Installment |: ");
                            customerInfo[currentIndex][1] = in.next().toUpperCase();
                            if (!customerInfo[currentIndex][1].equalsIgnoreCase("C") && ! customerInfo[currentIndex][1].equalsIgnoreCase("I")) {
                                System.out.println("Invalid payment method.");
                            }
                        } while (! customerInfo[currentIndex][1].equalsIgnoreCase("C") && !customerInfo[currentIndex][1].equalsIgnoreCase("I"));
                        do{
                            System.out.print("PWD/Senior Citizen? [Y/N]: ");
                            customerInfo[currentIndex][2] = in.next().toUpperCase();
                            if(!customerInfo[currentIndex][2].equalsIgnoreCase("Y") && ! customerInfo[currentIndex][2].equalsIgnoreCase("N")) {
                                System.out.println("Please input a valid option.");
                            }
                        } while (!customerInfo[currentIndex][2].equalsIgnoreCase("Y") && !customerInfo[currentIndex][2].equalsIgnoreCase("N"));
                    }
                    String addOrder = "Y";
                    
                    while (addOrder.equalsIgnoreCase("Y")) {
                        int bookIndex = -1;
                        try{
                        System.out.print("Enter Item Code: ");
                        String itemCode = in.next().toUpperCase().trim();
                        
                        for (int ctr = 0; ctr < codeOfBooks1.size(); ctr++) {
                            if (codeOfBooks1.get(ctr).substring(0, 5).equalsIgnoreCase(itemCode)) {
                                bookName = codeOfBooks1.get(ctr).substring(6, codeOfBooks1.get(ctr).length() - 9);
                                bookCategory = "1st Year";
                                bookPrice = priceOfBooks1.get(ctr);
                                bookStock = quantityOfBooks1.get(ctr);
                                bookIndex = ctr;
                                category = 1;
                                break;
                            }
                        }
                            for (int ctr = 0; ctr < codeOfBooks2.size(); ctr++) {
                            if (codeOfBooks2.get(ctr).substring(0, 5).equalsIgnoreCase(itemCode)) {
                                bookName = codeOfBooks2.get(ctr).substring(6, codeOfBooks2.get(ctr).length() - 9);
                                bookCategory = "2nd Year";
                                bookPrice = priceOfBooks2.get(ctr);
                                bookStock = quantityOfBooks2.get(ctr);
                                bookIndex = ctr;
                                category = 2;
                                break;
                            }
                        }
                            for (int ctr = 0; ctr < codeOfBooks3.size(); ctr++) {
                            if (codeOfBooks3.get(ctr).substring(0, 5).equalsIgnoreCase(itemCode)) {
                                bookName = codeOfBooks3.get(ctr).substring(6, codeOfBooks3.get(ctr).length() - 9);
                                bookCategory = "3rd Year";
                                bookPrice = priceOfBooks3.get(ctr);
                                bookStock = quantityOfBooks3.get(ctr);
                                bookIndex = ctr;
                                category = 3;
                                break;
                            }
                        }
                            for (int ctr = 0; ctr < codeOfBooks4.size(); ctr++) {
                            if (codeOfBooks4.get(ctr).substring(0, 5).equalsIgnoreCase(itemCode)) {
                                bookName = codeOfBooks4.get(ctr).substring(6, codeOfBooks4.get(ctr).length() - 9);
                                bookCategory = "4th Year";
                                bookPrice = priceOfBooks4.get(ctr);
                                bookStock = quantityOfBooks4.get(ctr);
                                bookIndex = ctr;
                                category = 4;
                                break;
                            }
                        }

                        if (bookIndex == -1) {
                            System.out.println("Book not found.");
                            continue;
                        }
                        if (bookStock == 0){
                            System.out.println("Item Out of Stock.");
                            continue;
                        }
                        System.out.print("Quantity: ");
                        int itemQuan = in.nextInt();

                        if (itemQuan > bookStock){
                            System.out.println("Insufficient Stock.");
                            continue;
                        }
                        if (itemQuan <= 0){
                            System.out.println("Invalid Quantity.");
                            continue;
                        }
                        
                        orders.add(itemCode + "_" + bookName);
                        qtys.add(itemQuan);
                        prices.add(bookPrice);
                       
                        if (category == 1) quantityOfBooks1.set(bookIndex, bookStock - itemQuan);
                        if (category == 2) quantityOfBooks2.set(bookIndex, bookStock - itemQuan);
                        if (category == 3) quantityOfBooks3.set(bookIndex, bookStock - itemQuan);
                        if (category == 4) quantityOfBooks4.set(bookIndex, bookStock - itemQuan);
                        } catch (InputMismatchException ime) {
                            System.out.println("Invalid input... Please enter a valid number for quantity.");
                            in.nextLine();
                            continue;
                        } catch (Exception e) {
                            System.out.println("Invalid item code. Please try again");
                            continue;
                        }
                        System.out.print("Add another order? [Y/N]: ");
                        addOrder = in.next();
                    }
                    for (int q=0; q<orders.size(); q++){
                        itemTotal += qtys.get(q) * prices.get(q);
                        }
                        totalItemVat = itemTotal * 0.12;
                        if (customerInfo[currentIndex][2].equalsIgnoreCase("Y")) {     //discount for senior
                            itemDiscount += itemTotal * 0.20;  
                            totalItemVat=0;
                        }
                        for(int w=0; w<qtys.size();w++)
                        {
                            numQuan += qtys.get(w);
                        }
                        if (customerInfo[currentIndex][1].equalsIgnoreCase("C") && numQuan >= 3) {
                            itemDiscount += itemTotal * 0.05;      //discount for cash payment and 3 items was bought
                        }
                        totalPrice = (itemTotal - itemDiscount) + totalItemVat;
                        if (customerInfo[currentIndex][1].equalsIgnoreCase("I")) {
                            installment = totalPrice * 0.60;          //installment mode of payment
                            remainBal = totalPrice - installment;}
                        
                    if (existingCustomerIndex != -1) {
                        customerOrders.get(currentIndex).addAll(orders);
                        customerQtys.get(currentIndex).addAll(qtys);
                        customerPrices.get(currentIndex).addAll(prices);

                        double existingTotal = Double.parseDouble(customerInfo[currentIndex][3]);
                        double existingBalance = Double.parseDouble(customerInfo[currentIndex][4]);

                        customerInfo[currentIndex][3] = df.format(existingTotal + totalPrice);
                        customerInfo[currentIndex][4] = df.format(existingBalance + remainBal);
                    } else {
                        customerOrders.add(orders);
                        customerQtys.add(qtys);
                        customerPrices.add(prices);

                        customerInfo[currentIndex][3] = df.format(totalPrice);
                        customerInfo[currentIndex][4] = df.format(remainBal);
                    }
                    
                      if (customerInfo[currentIndex][1].equalsIgnoreCase("C"))
                    {
                    System.out.println("\n============================== RECEIPT ================================");
                    System.out.println("Customer: " + customerInfo[currentIndex][0]);
                    System.out.printf("%-35s %11s %9s %12s\n", "Book Title", "Qty", "Price", "Subtotal");
                    System.out.println("-----------------------------------------------------------------------");
                    for (int j = 0; j < orders.size(); j++) {
                        int sub = qtys.get(j) * prices.get(j);
                        System.out.printf("%-35s %9d %9d %9d\n", orders.get(j), qtys.get(j), prices.get(j), sub);
                    }
                    System.out.println("-----------------------------------------------------------------------");
                    int totalQty = 0;
                        for (int q : qtys) {
                            totalQty += q;
                        }
                    System.out.println("Total Quantity Purchased:\t\t\t " + totalQty + " item(s)");
                    System.out.println("Subtotal                :\t\t\t Php " + df.format(itemTotal));
                    System.out.println("Discount                :\t\t\t Php " + df.format(itemDiscount));
                    System.out.println("VAT                     :\t\t\t Php " + df.format(totalItemVat));
                    System.out.println("Grand Total             :\t\t\t Php " + customerInfo[currentIndex][3]);
                    System.out.println("=======================================================================\n");
                    
                    receipt(customerInfo, orders, qtys, prices,itemTotal, itemDiscount,totalItemVat, 
                    installment,  remainBal,  maximumCustomers, customerQtys,  customerOrders, customerPrices, currentIndex, costumerCount);
                    }
                    else if(customerInfo[currentIndex][1].equalsIgnoreCase("I"))
                    {
                        System.out.println("\n============================== RECEIPT ================================");
                        System.out.println("Customer: " + customerInfo[currentIndex][0]);
                        System.out.printf("%-35s %11s %9s %12s\n", "Book Title", "Qty", "Price", "Subtotal");
                        System.out.println("-----------------------------------------------------------------------");
                        for (int j = 0; j < orders.size(); j++) {
                            int sub = qtys.get(j) * prices.get(j);
                            System.out.printf("%-35s %9d %9d %9d\n", orders.get(j), qtys.get(j), prices.get(j), sub);
                        }
                        System.out.println("-----------------------------------------------------------------------");

                        int totalQty = 0;
                        for (int q : qtys) {
                            totalQty += q;
                        }
                        System.out.println("Total Quantity Purchased:\t\t\t" + totalQty + " item(s)");
                        System.out.println("Subtotal:\t\t\t\t\tPhp " + df.format(itemTotal));
                        System.out.println("Discount:\t\t\t\t\tPhp " + df.format(itemDiscount));
                        System.out.println("VAT:\t\t\t\t\t\tPhp " + df.format(totalItemVat));
                        System.out.println("Grand Total:\t\t\t\t\tPhp " + customerInfo[currentIndex][3]);
                        System.out.println("First Installment:\t\t\t\tPhp " + df.format(installment));
                        System.out.println("Remaining Balance:\t\t\t\tPhp " + customerInfo[currentIndex][4]);
                        System.out.println("=======================================================================\n");
                        receipt( customerInfo, orders, qtys, prices,itemTotal, itemDiscount, totalItemVat, 
                        installment, remainBal,  maximumCustomers, customerQtys,  customerOrders, customerPrices,currentIndex, costumerCount);
                        
                    }
                
                    if (existingCustomerIndex == -1) {
                        costumerCount++;
                    }
                    itemTotal = 0; itemDiscount =0;totalItemVat =0; installment = 0; remainBal=0; totalPrice=0; //reset the values after a costumer

                    if (costumerCount < maximumCustomers) {
                        System.out.print("Next customer? [Y/N]: ");
                        String next = in.next();
                        in.nextLine();
                        if (!next.equalsIgnoreCase("Y")) break;
                    }
                }
                
                if(costumerCount == maximumCustomers)                                   //updated
                {
                    System.out.println("You've Reached Maximum Numbber of Customer");
                    System.out.println("--------------------------------------------------------------------------------------------------------\n");
                }
                
                System.out.println("\n============ S U M M A R Y   O F   A L L  C U S T O M E R =============");
                for (int x = 0; x < customerInfo.length; x++) {
                    if (customerInfo[x][0] != null) {
                        System.out.println("\nCustomer: " + customerInfo[x][0]);
                        System.out.printf("%-35s %11s %9s %12s \n", "Book Title", "Qty", "Price", "Subtotal");
                        System.out.println("-----------------------------------------------------------------------");
                        ArrayList<String> orders = customerOrders.get(x);
                        ArrayList<Integer> qtys = customerQtys.get(x);
                        ArrayList<Integer> prices = customerPrices.get(x);
                        for (int j = 0; j < orders.size(); j++) {
                            int sub = qtys.get(j) * prices.get(j);
                            System.out.printf("%-35s %10d %8d %9d \n", orders.get(j), qtys.get(j), prices.get(j), sub);
                        }
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Grand total:\t\t\t\t\tPhp " + customerInfo[x][3]);
                        System.out.println("Balance    :\t\t\t\t\tPhp " + customerInfo[x][4]);
                        System.out.println("=======================================================================\n");
                    }
                }
                

                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                             codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                              maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount, lengthOfCode);
                
                break;
            }//case C

            
            case "M":
            {       System.out.println("CUSTOMER MANAGEMENT");
                    System.out.println("");
                    int costumerId = 01;
                    if (customerInfo[0][0] != null)
                    {
                    System.out.printf("%-15s %-25s %-15s %20s %20s\n", "Customer ID", "Customer Name", "MOP", "PWD/Senior Citizen", "Remaining Balance" );
                    System.out.println("-------------------------------------------------------------------------------------------------------");

                    for (int x = 0; x < customerInfo.length; x++) {
                        if (customerInfo[x][1] != null) { 
                            System.out.printf(
                                "%-15d %-25s %-17s %-21s %-20s\n",
                                costumerId,
                                customerInfo[x][0],
                                customerInfo[x][1],
                                customerInfo[x][2],
                                customerInfo[x][4]
                            );
                        }
                        costumerId++; 
                    }
                    System.out.println("");

                    System.out.println("| [E] Edit Customer | \t | [R] Retrieve Customer | \t | [D] Delete Customer | \t | [X] Exit |");
                    System.out.print("What Action do you Want to Perform? ");
                    String choice = in.next().toUpperCase();
                    in.nextLine(); 

                    switch (choice) {
                        case "E":
                        {
                            String editMore = "Y";
                        do {
                           try{
                           
                            System.out.print("Enter Customer ID to edit: ");
                            int idToEdit = in.nextInt();
                            updatedCustomerInfo(customerInfo, idToEdit);
                            
                               System.out.print("Do you want to edit another customer information? [Y] [N]");
                               editMore = in.next();
                            }catch (InputMismatchException ime){
                               System.out.println("Invalid customer ID");
                               in.nextLine();
                               continue;
                           }
                        }while (!editMore.equalsIgnoreCase("N"));
                           
                           break;
                        }

                        case "R": {
                            String retrieveMore = "Y";
                            do{
                            System.out.print("Enter Customer ID to retrieve: ");
                            int idToRetrieve = in.nextInt();
                            in.nextLine();

                            if (idToRetrieve <= 0 || idToRetrieve > customerInfo.length || customerInfo[idToRetrieve - 1][0] == null) {
                                System.out.println("Invalid Customer ID.");
                                break;
                            }

                            int i = idToRetrieve - 1;
                            System.out.println("Name                : " + customerInfo[i][0]);
                            System.out.println("Payment Method      : " + customerInfo[i][1]);
                            System.out.println("PWD/Senior Citizen  : " + customerInfo[i][2]);
                            System.out.println("Total Price         : Php " + customerInfo[i][3]);
                            System.out.println("Total Balance       : Php " + customerInfo [i][4]);

                            ArrayList<String> orders = customerOrders.get(i);
                            ArrayList<Integer> qtys = customerQtys.get(i);
                            ArrayList<Integer> prices = customerPrices.get(i);

                            System.out.printf("%-35s %9s %9s %9s\n", "Item", "Qty", "Price", "Total");
                            System.out.println("-----------------------------------------------------------------");
                            for (int j = 0; j < orders.size(); j++) {
                                System.out.printf("%-35s %9d %9d %9d\n", orders.get(j), qtys.get(j), prices.get(j), qtys.get(j) * prices.get(j));
                            }
                                System.out.print("Do you want to retrieve more costumer information? [Y] [N]");
                                retrieveMore = in.next();
                            }while(!retrieveMore.equalsIgnoreCase("N"));
                            break;
                        }

                        case "D": {
                            String deleteMore = "Y";
                            do{
                            System.out.print("Enter Customer ID to delete: ");
                            int idToDelete = in.nextInt();
                            in.nextLine();

                            if (idToDelete <= 0 || idToDelete > customerInfo.length || customerInfo[idToDelete - 1][0] == null) {
                                System.out.println("Invalid Customer ID.");
                                break;
                            }

                            int i = idToDelete - 1;
                            for (int j = i; j < customerInfo.length - 1; j++) {
                                customerInfo[j] = customerInfo[j + 1];
                            }
                            customerInfo[customerInfo.length - 1] = new String[5];

                            customerOrders.remove(i);
                            customerQtys.remove(i);
                            customerPrices.remove(i);

                            System.out.println("Customer deleted successfully.");
                            System.out.print("Do you want to delete more costumer information? [Y] [N]");
                            deleteMore = in.next();
                            }while(!deleteMore.equalsIgnoreCase("N"));
                            break;
                        }
                        case "X":
                        {System.out.println("Exiting Customer Management Menu...");
                            break; 
                        }
                        default:
                        {System.out.println("Invalid option. Please try again.");
                            break;
                        }
                        
                        }
                        }
                    else 
                    {
                        System.out.println("No costumer yet...");
                    }
                    displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                             codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                              maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices,costumerCount, lengthOfCode);
                    
                    break;  }
           case "S":
            {
                System.out.println("SALES REPORT");
                System.out.println("Code" + " ".repeat(6) +
                                    "Book Title" + " ".repeat(20) +
                                    "Total Sold" + " ".repeat(4) +
                                    "Remaining" +" ".repeat(10) +
                                    "Total Sales");

                    ArrayList<String>[] allCodes       = new ArrayList[] {codeOfBooks1, codeOfBooks2, codeOfBooks3, codeOfBooks4};
                    ArrayList<Integer>[] allQuantities = new ArrayList[] {quantityOfBooks1, quantityOfBooks2, quantityOfBooks3, quantityOfBooks4};
                    ArrayList<Integer>[] allPrices     = new ArrayList[] {priceOfBooks1, priceOfBooks2, priceOfBooks3, priceOfBooks4};

                    ArrayList<String> codes = new ArrayList<>();
                    ArrayList<String> titles = new ArrayList<>();
                    ArrayList<Integer> soldCounts = new ArrayList<>();

                    // Calculate sold count per book
                    for (int i = 0; i < allCodes.length; i++) {
                        for (int j = 0; j < allCodes[i].size(); j++) {
                            String full = allCodes[i].get(j);
                            String code = full.substring(0, 5);
                            String title = full.substring(6, full.length() - 9);
                            int price = allPrices[i].get(j);
                            int remain = allQuantities[i].get(j);

                            int sold = 0;

                            for (int c = 0; c < customerOrders.size(); c++) {
                                ArrayList<String> order = customerOrders.get(c);
                                ArrayList<Integer> qtys = customerQtys.get(c);
                                for (int d = 0; d < order.size(); d++) {
                                    String orderCode = order.get(d).substring(0, 5);
                                    if (orderCode.equals(code)) {
                                        sold += qtys.get(d);
                                    }
                                }
                            }

                            int totalSales = sold * price;

                            System.out.println(code + "    " + title + " ".repeat(35 - title.length()) +
                                sold + " ".repeat(15 - String.valueOf(sold).length()) +
                                remain + " ".repeat(20 - String.valueOf(remain).length()) +
                                totalSales);

                            // Save for best/least
                            codes.add(code);
                            titles.add(title);
                            soldCounts.add(sold);
                        }
                    }

                    // Find best and least
                    int maxSold = soldCounts.get(0);
                    int minSold = soldCounts.get(0);
                    for (int i = 1; i < soldCounts.size(); i++) {
                        if (soldCounts.get(i) > maxSold)
                            maxSold = soldCounts.get(i);
                        if (soldCounts.get(i) < minSold)
                            minSold = soldCounts.get(i);
                    }

                    System.out.println("\nBest-selling Book(s) - sold " + maxSold + " unit(s):");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    for (int i = 0; i < soldCounts.size(); i++) {
                        if (soldCounts.get(i) == maxSold) {
                            System.out.println(codes.get(i) + "    " + titles.get(i));
                        }
                    }
                    
                    System.out.println("========================================================================================================");
                    System.out.println("\nLeast-selling Book(s) - sold " + minSold + " unit(s):");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    for (int i = 0; i < soldCounts.size(); i++) {
                        if (soldCounts.get(i) == minSold) {
                            System.out.println(codes.get(i) + "    " + titles.get(i));
                        }
                    }
                    
                    displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                    break;
            }
            
            case "L":
            {
                Scanner x = new Scanner(System.in);
                System.out.print("Proceed to log out? (Y/N): ");
                char enter = Character.toUpperCase(x.next().charAt(0));
                if (enter == 'Y')
                {
                    System.out.println("Logging out...\n");
                    loginMenu();
                } 
                else if (enter == 'N')
                {
                    mainMenu();
                }
                else
                {
                    System.out.println("Invalid input.");
                    mainMenu();
                }
                break;
            }
                            // end of case L - Log-Out
            case "F":
            {
                String course = "BSIT 1C - G1";
               String[] names = new String[] {
                                                "Clement, Clarence Mari V.    ",
                                                "Culilap, Lovely Joyce J.     ",
                                                "De Guzman, Wilfred Clarenn T.",
                                                "Francisco, Hannah Mae C.     ",
                                                "Lopez, Shanley Nina DG.      "
                                            };
               String[] info = new String [] {
                                            "yenzclemente@gmail.com    ",
                                            "ljculilap@gmail.com       ",
                                            "wilfredclarenn@gmail.com  ",
                                            "hannahfrancisco@gmail.com ",
                                            "shanlopez@gmail.com       "
                                        };
               String[] roles = new String []{
                   "Log In", "Costumer Management", "Log In", "Inventory", "Sales Report"
               };
                System.out.println("Presented by: ");
               for(int x=0 ; x<5; x++){
                System.out.println("\t" + names[x] + "\t" + course + "\t" + info[x] + "\t" + roles[x]);
               }
                System.out.println("");
                System.out.println("Presented to: \n\t Engr. Evelyn C. Samson\n" +
                                    "               Instructor");
                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                break;
            }
            
            case "R" : 
            {
                String storeName = "Hebrew's Book Cafe\n" + "BSIT 1C-G1\n";
                String copyRightN = "This Point of Sale and Inventory System of Hebrew's Book Cafe is protected by\n"
                        + "Philippine and International copyright laws. Reproduction and distribution of the \n"
                        + "source code without the owners' permission are prohibited.\n\n" + 
                        "All rights reserved 2024-2025.";
                
                System.out.println("C O P Y R I G H T  N O T I C E\n");
                System.out.println(storeName + "\n" + copyRightN);
               
                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                break;
            }
            case "V":
            {
                System.out.println("Username: "+ defUsername);
                System.out.println("Password: ********");
                System.out.print("Show Password? (Y/N): ");
                char choice = Character.toUpperCase(in.next().charAt(0));
                switch (choice)
                {
                    case 'Y':
                        System.out.println("Password: " + defPassword);
                        break;
                    case 'N':
                        System.out.println("Password hidden...");
                        break;
                }
                mainMenu();
            }
            default:
            {
                System.out.println("Error...That Section Is Not Found");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                displayHome(codeOfBooks1, quantityOfBooks1,priceOfBooks1,codeOfBooks2,quantityOfBooks2, priceOfBooks2,
                    codeOfBooks3,quantityOfBooks3, priceOfBooks3,codeOfBooks4,quantityOfBooks4, priceOfBooks4,
                    maxQuantity, minQuantity, maximumBookType, maximumCustomers, customerInfo, customerOrders, customerQtys, customerPrices, costumerCount, lengthOfCode);
                break;
            }
        } // end of switch Dash Board
    } //end of displayHome()
    
// pabago yung location ng file
    public static void receipt(String[][] customerInfo, ArrayList<String> orders, ArrayList<Integer> qtys, ArrayList<Integer> prices,
            double itemTotal, double itemDiscount, double totalItemVat,double installment, double remainBal, int maximumCustomers,
            ArrayList<ArrayList<Integer>> customerQtys, ArrayList<ArrayList<String>> customerOrders,  ArrayList<ArrayList<Integer>> customerPrices, 
            int currentIndex, int costumerCount)
    {
            DecimalFormat df = new DecimalFormat("0.00");
            try{
                
                PrintWriter receipt = new PrintWriter(new FileWriter("C:\\Users\\Hannah Mae Francisco\\Downloads\\ReceiptCopy.txt", true));
               
                if(customerInfo[currentIndex][1].equalsIgnoreCase("C"))
                {
                     receipt.write("\n============================== RECEIPT ================================\n");
                     receipt.write("Customer #" + (costumerCount+1) + ": " + customerInfo[currentIndex][0] + "\n");
                     receipt.printf("%-35s %11s %9s %12s\n", "Book Title", "Qty", "Price", "Subtotal" + "\n");
                     receipt.write("-----------------------------------------------------------------------\n");
                    for (int j = 0; j < orders.size(); j++) {
                        int sub = qtys.get(j) * prices.get(j);
                       receipt.printf("%-35s %9d %9d %9d\n", orders.get(j), qtys.get(j), prices.get(j), sub);
                    }
                    receipt.write("-----------------------------------------------------------------------\n");
                    int totalQty = 0;
                        for (int q : qtys) {
                            totalQty += q;
                        }
                     receipt.write("Total Quantity Purchased:\t\t\t " + totalQty + " item(s)" + "\n");
                     receipt.write("Subtotal                :\t\t\t Php " + df.format(itemTotal)+ "\n");
                     receipt.write("Discount                :\t\t\t Php " + df.format(itemDiscount)+ "\n");
                     receipt.write("VAT                     :\t\t\t Php " + df.format(totalItemVat)+ "\n");
                     receipt.write("Grand Total             :\t\t\t Php " + customerInfo[currentIndex][3] + "\n");
                     receipt.write("=======================================================================\n");
                }
                
                    else if(customerInfo[currentIndex][1].equalsIgnoreCase("I"))
                    {
                    receipt.write("\n============================== RECEIPT ================================\n");
                    receipt.write("Customer #" + (costumerCount+1) + ": " + customerInfo[currentIndex][0]+ "\n");
                    receipt.printf("%-35s %11s %9s %12s\n", "Book Title", "Qty", "Price", "Subtotal");
                    receipt.write("-----------------------------------------------------------------------\n");
                    for (int j = 0; j < orders.size(); j++) {
                        int sub = qtys.get(j) * prices.get(j);
                        receipt.printf("%-35s %9d %9d %9d\n", orders.get(j), qtys.get(j), prices.get(j), sub);
                    }
                    receipt.write("-----------------------------------------------------------------------\n");

                    int totalQty = 0;
                    for (int q : qtys) {
                        totalQty += q;
                    }
                    receipt.write("Total Quantity Purchased:\t\t\t" + totalQty + " item(s)\n");
                    receipt.write("Subtotal:\t\t\t\t\tPhp " + df.format(itemTotal)+ "\n");
                    receipt.write("Discount:\t\t\t\t\tPhp " + df.format(itemDiscount)+ "\n");
                    receipt.write("VAT:\t\t\t\t\t\tPhp " + df.format(totalItemVat)+ "\n");
                    receipt.write("Grand Total:\t\t\t\t\tPhp " + customerInfo[currentIndex][3]+ "\n");
                    receipt.write("First Installment:\t\t\t\tPhp " + df.format(installment)+ "\n");
                    receipt.write("Remaining Balance:\t\t\t\tPhp " + customerInfo[currentIndex][4]+ "\n");
                    receipt.write("=======================================================================\n");
                    }
                
                receipt.close();

                System.out.println("Record saved successfully.");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
                }
            catch(IOException e){
                System.out.println("An error occured in saving the record...");
                }
}// 
    public static int searchBookItem(ArrayList<String> codeOfBooks, ArrayList<Integer> quantityOfBooks, 
                                        ArrayList<Integer> priceOfBooks, int searchIndex, String searchCode, int lengthOfCode)
    {
        
        DecimalFormat twodec = new DecimalFormat("0.00");
        for(int ctr=0; ctr<codeOfBooks.size(); ctr++)
            {
                searchIndex=codeOfBooks.get(ctr).indexOf(searchCode);
                if(codeOfBooks.get(ctr).indexOf(searchCode)>-1)
                {
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    int codeWidth= 11; int nameWidth = 45;int categoryWidth = 16; int qtyWidth= 11;int priceWidth= 11;
                    
                    System.out.println( "Code"+ " ".repeat(7) + "Item Name"+ " ".repeat(36)+ "Category" 
                    + " ".repeat(5) + "Quantity" + " ".repeat(5) + "Price (Php)");
                    String itemCode = codeOfBooks.get(ctr).substring(0, lengthOfCode);
                    String itemName = codeOfBooks.get(ctr).substring(lengthOfCode+1, codeOfBooks.get(ctr).length() - 9);
                    String category = codeOfBooks.get(ctr).substring(codeOfBooks.get(ctr).length() - 8);
                    String quantity = "" + quantityOfBooks.get(ctr);
                    String price    = "" + twodec.format(priceOfBooks.get(ctr));

                    System.out.println(
                        itemCode + " ".repeat(codeWidth - itemCode.length()) +
                        itemName + " ".repeat(nameWidth - itemName.length()) +
                        category + " ".repeat(categoryWidth - category.length())+
                        quantity + " ".repeat(qtyWidth - quantity.length()) +
                        price + " ".repeat(priceWidth - price.length())
                    );
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        return searchIndex;
    } // searchBookItem()
    public static char selectingCategory()
    {
        Scanner in = new Scanner(System.in);
        char selectedCategory;
        String forTestingCategory;
        
        do{
            System.out.println("[1] 1st YEAR , [2] 2nd YEAR, [3] 3rd YEAR, [4] 4th YEAR");
            System.out.print("In Which Category You Want to Take the Selected Action: ");
            forTestingCategory =in.next().trim();
            if(forTestingCategory.length()!=1)
            {
                System.out.println("Invalid Category...Cannot Execute the Action");
                System.out.println("--------------------------------------------------------------------------------------------------------");
            }
        } while(forTestingCategory.length()!=1);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        return selectedCategory=forTestingCategory.charAt(0);
    } // end of selectingCategory()

    // updated: 05-11
    public static void inventorySectionDisplayOnly(ArrayList<String> codeOfBooks1, ArrayList<Integer> quantityOfBooks1, ArrayList<Integer> priceOfBooks1, 
                                                       ArrayList<String>codeOfBooks2, ArrayList<Integer> quantityOfBooks2,  ArrayList<Integer> priceOfBooks2, 
                                                       ArrayList<String>codeOfBooks3, ArrayList<Integer> quantityOfBooks3,  ArrayList<Integer> priceOfBooks3, 
                                                       ArrayList<String>codeOfBooks4, ArrayList<Integer> quantityOfBooks4,  ArrayList<Integer> priceOfBooks4, int lengthOfCode)
{
    DecimalFormat twodec = new DecimalFormat("0.00");
    int codeWidth= 11; int nameWidth = 45;int categoryWidth = 16; int qtyWidth= 11;int priceWidth= 11;

    System.out.println( "Code"+ " ".repeat(7) + "Item Name"+ " ".repeat(36)+ "Category" 
    + " ".repeat(5) + "Quantity" + " ".repeat(5) + "Price (Php)");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    System.out.println();

    for (int ctr = 0; ctr < codeOfBooks1.size(); ctr++) {
        String itemCode = codeOfBooks1.get(ctr).substring(0, lengthOfCode);
        String itemName = codeOfBooks1.get(ctr).substring(lengthOfCode+1, codeOfBooks1.get(ctr).length() - 9);
        String category = codeOfBooks1.get(ctr).substring(codeOfBooks1.get(ctr).length() - 8);
        String quantity = "" + quantityOfBooks1.get(ctr);
        String price    = "" + twodec.format(priceOfBooks1.get(ctr));

        System.out.println(
            itemCode + " ".repeat(codeWidth - itemCode.length()) +
            itemName + " ".repeat(nameWidth - itemName.length()) +
            category + " ".repeat(categoryWidth - category.length())+
            quantity + " ".repeat(qtyWidth - quantity.length()) +
            price + " ".repeat(priceWidth - price.length())
        );
    }
    System.out.println();

        for(int ctr = 0; ctr < codeOfBooks2.size(); ctr++) {
            String itemCode = codeOfBooks2.get(ctr).substring(0, lengthOfCode);
            String itemName = codeOfBooks2.get(ctr).substring(lengthOfCode+1, codeOfBooks2.get(ctr).length() - 9);
            String category = codeOfBooks2.get(ctr).substring(codeOfBooks2.get(ctr).length() - 8);
            String quantity = "" + quantityOfBooks2.get(ctr);
            String price    = "" + twodec.format(priceOfBooks2.get(ctr));

            System.out.println(
                itemCode + " ".repeat(codeWidth - itemCode.length()) +
                itemName + " ".repeat(nameWidth - itemName.length()) +
                category + " ".repeat(categoryWidth - category.length())+
                quantity + " ".repeat(qtyWidth - quantity.length()) +
                price + " ".repeat(priceWidth - price.length())
            );
        }

        System.out.println("");
        for(int ctr = 0; ctr < codeOfBooks3.size(); ctr++) {
            String itemCode = codeOfBooks3.get(ctr).substring(0, lengthOfCode);
            String itemName = codeOfBooks3.get(ctr).substring(lengthOfCode+1, codeOfBooks3.get(ctr).length() - 9);
            String category = codeOfBooks3.get(ctr).substring(codeOfBooks3.get(ctr).length() - 8);
            String quantity = "" + quantityOfBooks3.get(ctr);
            String price = "" + twodec.format(priceOfBooks3.get(ctr));

            System.out.println(
                itemCode + " ".repeat(codeWidth - itemCode.length()) +
                itemName + " ".repeat(nameWidth - itemName.length()) +
                category + " ".repeat(categoryWidth - category.length())+
                quantity + " ".repeat(qtyWidth - quantity.length()) +
                price + " ".repeat(priceWidth - price.length())
            );
        }

        System.out.println("");
        for(int ctr = 0; ctr < codeOfBooks4.size(); ctr++) {
            String itemCode = codeOfBooks4.get(ctr).substring(0, lengthOfCode);
            String itemName = codeOfBooks4.get(ctr).substring(lengthOfCode+1, codeOfBooks4.get(ctr).length() - 9);
            String category = codeOfBooks4.get(ctr).substring(codeOfBooks4.get(ctr).length() - 8);
            String quantity = "" + quantityOfBooks4.get(ctr);
            String price = "" + twodec.format(priceOfBooks4.get(ctr));

            System.out.println(
                itemCode + " ".repeat(codeWidth - itemCode.length()) +
                itemName + " ".repeat(nameWidth - itemName.length()) +
                category + " ".repeat(categoryWidth - category.length())+
                quantity + " ".repeat(qtyWidth - quantity.length()) +
                price + " ".repeat(priceWidth - price.length())
            );
    }
} // end of inventorySectionAnotherOption()

    //05-06
    public static ArrayList<String> updateItemCodeName(ArrayList<String>codeOfBooks1,ArrayList<String>codeOfBooks2,ArrayList<String>codeOfBooks3,ArrayList<String>codeOfBooks4,
                                                        String category, int lengthOfCode, char selectedCategory)
    {
        Scanner in = new Scanner(System.in);
        ArrayList <String> noCodeBookReturn =new ArrayList <>();
        String oldElement, updated;
        String updatedBookCodeName="";
        String categoryError = ""+ selectedCategory;
        boolean errorCode;
        int indexCodeError=-1;
        do
        {
            do
            {
                System.out.print("Enter the Current Code of the Book Item: ");
                oldElement=in.next().toUpperCase().trim();
                if(oldElement.length()!=lengthOfCode){
                    System.out.println("Invalid Code of the Book Item");
                    System.out.println("--------------------------------------------------------------------------------------------------------");  
                }
            }while(oldElement.length()!=lengthOfCode);

            for(int ctr=0; ctr<codeOfBooks1.size(); ctr++) //by category
            {
                if(codeOfBooks1.get(ctr).indexOf(oldElement)>-1)
                {
                    indexCodeError=1; // by category
                    
                    if (indexCodeError==Integer.parseInt(categoryError))
                    {
                        do
                        {
                            System.out.print("Enter New " + lengthOfCode + "-CHARACTER Book Code: ");
                            updated=in.next().toUpperCase().trim();
                            errorCode=true;

                            for(int ctr2=0; ctr2<codeOfBooks1.size(); ctr2++)
                            {
                                if(codeOfBooks1.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 1st Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks2.size(); ctr2++)
                            {
                                if(codeOfBooks2.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 2nd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks3.size(); ctr2++)
                            {
                                if(codeOfBooks3.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 3rd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks4.size(); ctr2++)
                            {
                                if(codeOfBooks4.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 4th Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }
                        } while (updated.length()!=lengthOfCode ||  errorCode ==false);  

                        in.nextLine();
                        updatedBookCodeName=updated + "_";
                        System.out.print("Enter New Book Name To Add: ");
                        updatedBookCodeName+=in.nextLine().trim();
                        updatedBookCodeName+=category;
                        
                        codeOfBooks1.set(ctr, updatedBookCodeName);
                        System.out.println("Successfully Updated");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        return codeOfBooks1;
                    } // if 
                    
                    break;
                }
            }//for of codeOfBook1

            for(int ctr=0; ctr<codeOfBooks2.size(); ctr++) //by category
            {
                if(codeOfBooks2.get(ctr).indexOf(oldElement)>-1)
                {
                    indexCodeError=2; //by category
                    
                    if (indexCodeError==Integer.parseInt(categoryError))
                    {
                        do
                        {
                            System.out.print("Enter New " + lengthOfCode + "-CHARACTER Book Code: ");
                            updated=in.next().toUpperCase().trim();
                            errorCode=true;

                            for(int ctr2=0; ctr2<codeOfBooks1.size(); ctr2++)
                            {
                                if(codeOfBooks1.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 1st Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks2.size(); ctr2++)
                            {
                                if(codeOfBooks2.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 2nd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks3.size(); ctr2++)
                            {
                                if(codeOfBooks3.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 3rd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks4.size(); ctr2++)
                            {
                                if(codeOfBooks4.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 4th Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }
                        } while (updated.length()!=lengthOfCode ||  errorCode ==false);  

                        in.nextLine();
                        updatedBookCodeName=updated + "_";
                        System.out.print("Enter New Book Name To Add: ");
                        updatedBookCodeName+=in.nextLine().trim();
                        updatedBookCodeName+=category;

                        codeOfBooks2.set(ctr, updatedBookCodeName);
                        System.out.println("Successfully Updated");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        return codeOfBooks2;
                    }
                    
                    break;
                }
            }//for of codeOfBook2

            for(int ctr=0; ctr<codeOfBooks3.size(); ctr++) //by category
            {
                if(codeOfBooks3.get(ctr).indexOf(oldElement)>-1)
                {
                    indexCodeError=3; // by category
                    
                    if (indexCodeError==Integer.parseInt(categoryError))
                    {
                        do
                        {
                            System.out.print("Enter New " + lengthOfCode + "-CHARACTER Book Code: ");
                            updated=in.next().toUpperCase().trim();
                            errorCode=true;

                            for(int ctr2=0; ctr2<codeOfBooks1.size(); ctr2++)
                            {
                                if(codeOfBooks1.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 1st Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks2.size(); ctr2++)
                            {
                                if(codeOfBooks2.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 2nd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks3.size(); ctr2++)
                            {
                                if(codeOfBooks3.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 3rd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks4.size(); ctr2++)
                            {
                                if(codeOfBooks4.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 4th Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }
                        } while (updated.length()!=lengthOfCode ||  errorCode ==false);  

                        in.nextLine();
                        updatedBookCodeName=updated + "_";
                        System.out.print("Enter New Book Name To Add: ");
                        updatedBookCodeName+=in.nextLine().trim();
                        updatedBookCodeName+=category;

                        codeOfBooks3.set(ctr, updatedBookCodeName);
                        System.out.println("Successfully Updated");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        return codeOfBooks3;
                    }
                    
                    break;
                }
            }//for of codeOfBook3

            for(int ctr=0; ctr<codeOfBooks4.size(); ctr++) //by category
            {
                if(codeOfBooks4.get(ctr).indexOf(oldElement)>-1)
                {
                    indexCodeError=4; // by category
                    
                    if (indexCodeError==Integer.parseInt(categoryError))
                    {
                        do
                        {
                            System.out.print("Enter New " + lengthOfCode + "-CHARACTER Book Code: ");
                            updated=in.next().toUpperCase().trim();
                            errorCode=true;

                            for(int ctr2=0; ctr2<codeOfBooks1.size(); ctr2++)
                            {
                                if(codeOfBooks1.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 1st Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks2.size(); ctr2++)
                            {
                                if(codeOfBooks2.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 2nd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks3.size(); ctr2++)
                            {
                                if(codeOfBooks3.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 3rd Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }

                            for(int ctr2=0; ctr2<codeOfBooks4.size(); ctr2++)
                            {
                                if(codeOfBooks4.get(ctr2).indexOf(updated)>-1)
                                {
                                    System.out.println(updated + " Already Exists in 4th Year Category");
                                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                                    errorCode=false;
                                    break;
                                }
                            }
                        } while (updated.length()!=lengthOfCode ||  errorCode ==false);  

                        in.nextLine();
                        updatedBookCodeName=updated + "_";
                        System.out.print("Enter New Book Name To Add: ");
                        updatedBookCodeName+=in.nextLine().trim();
                        updatedBookCodeName+=category;

                        codeOfBooks4.set(ctr, updatedBookCodeName);
                        System.out.println("Successfully Updated");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        return codeOfBooks4;
                    }
                    
                    break;
                }
            }//for of codeOfBook4
            if(indexCodeError==-1 || indexCodeError!=Integer.parseInt(categoryError))
                {
                    System.out.println(oldElement + " Does Not Exist in Selected Category. Please Try Again");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                }
        } while(indexCodeError==-1 || indexCodeError!=Integer.parseInt(categoryError));
        
        return noCodeBookReturn;
    } // end of updateItemCodeName()
    
        public static String[][] updatedCustomerInfo(String[][] customerInfo, int customerId) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        if (customerId <= 0 || customerId > customerInfo.length || customerInfo[customerId - 1][0] == null) {
            System.out.println("Invalid Customer ID.");
            return customerInfo;
        }
            System.out.println("| [A] Name |     | [B] Payment Method |    | [C] Condition |    | [D] Balance |" );
            System.out.print("What info do you want to edit? ");
            String edit = in.next().toUpperCase();
            in.nextLine();
            int i = customerId - 1;
            switch (edit)
            {
                case "A" :
                {
                    System.out.print("Enter New Name: ");
                    String updatedName = in.nextLine().trim().toUpperCase();
                    customerInfo[i][0] = updatedName;
                    break;
                }
                case "B" :
                {
                    System.out.print("Enter new payment method: ");
                    String updatedMOP = in.nextLine().trim().toUpperCase();
                    System.out.print("Enter new balance: ");
                    String newBalance =in.next();
                    customerInfo[i][1] = updatedMOP;
                    customerInfo[i][4] = newBalance;
                    break;
                }
                case "C" : 
                {
                    System.out.print("PWD/Senior Citizen? [YES/NO]: ");
                    String updatedCondition = in.nextLine().trim().toUpperCase();
                    customerInfo[i][2] = updatedCondition;
                    break;
                }
                case "D" :
                {
                    System.out.print("Enter new balance: ");
                    String newBalance =in.next();
                    double balance = Double.parseDouble(newBalance);
                    if (balance < 0)
                        System.out.println("Invalid Data. Balance cannot be negative");
                    customerInfo[i][4] = df.format(balance);
                    break;
                }
            }
        System.out.println("Customer successfully updated.");
        return customerInfo;
    }

    public static ArrayList<Integer> updateItemQuantity(ArrayList<String> codeOfBooks,ArrayList<Integer> quantityOfBooks, String category,
                                                        int maxQuantity, int minQuantity, int lengthOfCode)
    {
        Scanner in = new Scanner(System.in);
        int updatedQuantity =-1;
        String codeItem;
        boolean actionError =true; 
        do
        {
            System.out.print("Enter the Code of the Book Item to Change Quantity: ");
            codeItem=in.next().toUpperCase().trim();
            if(codeItem.length()!=lengthOfCode){
                System.out.println("Invalid Code of the Book Item");
                System.out.println("--------------------------------------------------------------------------------------------------------");  
            }
        }while(codeItem.length()!=lengthOfCode);
        
        for(int ctr=0; ctr<codeOfBooks.size(); ctr++)
        {
            if(codeOfBooks.get(ctr).indexOf(codeItem)>-1)
            {
                    try
                    {
                        System.out.println("[A] ADD STOCK\t [M] MANUALLY UPDATE BOOK ITEM");
                        System.out.print("What Action do you Want to Perform? : ");
                        String actionUpdate = in.next().toUpperCase().trim();
                        
                        if(actionUpdate.equalsIgnoreCase("A"))
                        {
                            int currentQuantity = quantityOfBooks.get(ctr);
                            
                            if(currentQuantity==maxQuantity || currentQuantity>maxQuantity)
                            {
                              System.out.println("Maximum of "+ maxQuantity+ " pcs per book type (1st - 4th year)");
                              System.out.println("--------------------------------------------------------------------------------------------------------");   
                            }
                            
                            while(currentQuantity<maxQuantity)
                            {
                                currentQuantity++;
                                System.out.println("Sucessfully Updated");
                                 quantityOfBooks.set(ctr,currentQuantity);
                                System.out.println("--------------------------------------------------------------------------------------------------------");
                                System.out.println("Current Quantity of " + codeItem + ": " + quantityOfBooks.get(ctr) + "pc/s");
                                System.out.print("Increment the stock again? "
                                        + "[YES] [NO] : ");
                                String askContinue =in.next().toUpperCase().trim();
                                System.out.println("--------------------------------------------------------------------------------------------------------");   
                                if(askContinue.equalsIgnoreCase("NO") || !askContinue.equalsIgnoreCase("YES"))
                                    break;
                                
                                if(askContinue.equalsIgnoreCase("YES") && currentQuantity==maxQuantity || currentQuantity>maxQuantity)
                                {
                                  System.out.println("Maximum of "+ maxQuantity+ " pcs per book type (1st - 4th year)");
                                  System.out.println("--------------------------------------------------------------------------------------------------------");   
                                }
                            }
                            
                            return quantityOfBooks;
                        }
                        else if(actionUpdate.equalsIgnoreCase("M"))
                        {
                            do
                            {
                                System.out.print("Enter New Quantity of " + codeItem + ": ");
                                updatedQuantity=in.nextInt();

                                if(updatedQuantity>maxQuantity)
                                {
                                  System.out.println("Maximum of "+ maxQuantity+ " pcs per book type (1st - 4th year)");
                                  System.out.println("--------------------------------------------------------------------------------------------------------");   
                                }

                                else if(updatedQuantity<minQuantity)
                                {
                                    System.out.println("Invalid input for quantity");
                                    System.out.println("--------------------------------------------------------------------------------------------------------");   
                                }
                            } while (updatedQuantity<minQuantity || updatedQuantity>maxQuantity);
                            
                            quantityOfBooks.set(ctr, updatedQuantity);
                            System.out.println("Sucessfully Updated");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                            return quantityOfBooks;
                        }
                        
                        else 
                        {
                            System.out.println("Action Cannot Perform...Invalid Input");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid input for quantity");
                        System.out.println("--------------------------------------------------------------------------------------------------------"); 
                        in.nextLine();
                    }
                break;
            }//bookitem is found
            
            if(codeOfBooks.get(ctr).indexOf(codeItem)==-1 && ctr==(codeOfBooks.size()-1))
            {
                System.out.println(codeItem + " Does Not Exist in Selected Category. Please Try Again");
                System.out.println("--------------------------------------------------------------------------------------------------------");
            }
        }
        return quantityOfBooks;
    } // end of updateItemCodeQuantity()
    
    public static ArrayList<Integer> updateItemPrice(ArrayList<String> codeOfBooks,ArrayList<Integer> priceOfBooks, String category, int lengthOfCode)
    {
        Scanner in = new Scanner(System.in);
        int updatedPrice=-1, minPrice=0;
        String codeItem;
        
        do
        {
            System.out.print("Enter Code of the Book Item to Change the Price: ");
            codeItem=in.next().toUpperCase().trim();
            if(codeItem.length()!=lengthOfCode){
                System.out.println("Invalid Code of the Book Item");
                System.out.println("--------------------------------------------------------------------------------------------------------");  
            }
        }while(codeItem.length()!=lengthOfCode);
        
        for(int ctr=0; ctr<codeOfBooks.size(); ctr++)
        {
            if(codeOfBooks.get(ctr).indexOf(codeItem)>-1)
            {
                do
                {
                    try{
                        System.out.print("Enter New Price of " + codeItem + ": ");
                        updatedPrice=in.nextInt();

                        if(updatedPrice<minPrice)
                        {
                            System.out.println("Invalid Input for Price");
                            System.out.println("--------------------------------------------------------------------------------------------------------");
                        }    
                    }
                    catch (InputMismatchException e)
                    {
                    System.out.println("Invalid input for Price");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    in.nextLine();
                    }
                
              }while (updatedPrice<minPrice);
                
                priceOfBooks.set(ctr, updatedPrice);
                System.out.println("Successfully Updated");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                break;
            }
            
            if(codeOfBooks.get(ctr).indexOf(codeItem)==-1 && ctr==(codeOfBooks.size()-1))
            {
                System.out.println(codeItem + " Does Not Exist in Selected Category. Please Try Again");
                System.out.println("--------------------------------------------------------------------------------------------------------");
            }
        }
        return priceOfBooks;
    } // end of updateItemPrice()

    public static String addNewBookItem(ArrayList<String> codeOfBooks1,ArrayList<String>codeOfBooks2,ArrayList<String>codeOfBooks3,ArrayList<String>codeOfBooks4,String category, int lengthOfCode)
    {
         Scanner in = new Scanner(System.in);
         String inputNewBookCode="";
         boolean errorCode;
         
        System.out.println("ADD NEW BOOK");
        
        do{
            do{
                System.out.print("Enter New " + lengthOfCode + "-CHARACTER Book Code To Add: ");
                inputNewBookCode=in.next().toUpperCase().trim();
            } while (inputNewBookCode.length()!=lengthOfCode);
            
            errorCode=true;
             
            for(int ctr=0; ctr<codeOfBooks1.size(); ctr++)
            {
                if(codeOfBooks1.get(ctr).indexOf(inputNewBookCode)>-1)
                {
                    System.out.println(inputNewBookCode + " Already Exists in 1st Year Category");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    errorCode=false;
                    break;
                }
            }
            
            for(int ctr=0; ctr<codeOfBooks2.size(); ctr++)
            {
                if(codeOfBooks2.get(ctr).indexOf(inputNewBookCode)>-1)
                {
                    System.out.println(inputNewBookCode + " Already Exists in 2nd Year Category");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    errorCode=false;
                    break;
                }
            }
            
            for(int ctr=0; ctr<codeOfBooks3.size(); ctr++)
            {
                if(codeOfBooks3.get(ctr).indexOf(inputNewBookCode)>-1)
                {
                    System.out.println(inputNewBookCode + " Already Exists in 3rd Year Category");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    errorCode=false;
                    break;
                }
            }
            
            for(int ctr=0; ctr<codeOfBooks4.size(); ctr++)
            {
                if(codeOfBooks4.get(ctr).indexOf(inputNewBookCode)>-1)
                {
                    System.out.println(inputNewBookCode + " Already Exists in 4th Year Category");
                    System.out.println("--------------------------------------------------------------------------------------------------------"); 
                    errorCode=false;
                    break;
                }
            }
        } while (errorCode ==false);
        
        inputNewBookCode=inputNewBookCode + "_";
         in.nextLine();
         
        System.out.print("Enter New Book Name To Add: ");
        inputNewBookCode+=in.nextLine().trim();
        inputNewBookCode+=category;
      //  codeOfBooks.add(inputNewBookCode);
        return inputNewBookCode;
    } // end of addNewBookItem()

    public static ArrayList<Integer> addNewQuantity(ArrayList<Integer> quantity_price, int maxQuantity, int minQuantity)
    {
        int quantity=-1;
        Scanner in = new Scanner(System.in);
        
        do
        {
            try{
                System.out.print("Enter quantity: ");
                quantity = in.nextInt();
                if(quantity>maxQuantity)
                {
                    System.out.println("Maximum of " + maxQuantity + " pcs per book type (1st - 4th year)");
                    System.out.println("--------------------------------------------------------------------------------------------------------");   
                }
                else if(quantity<minQuantity)
                {
                    System.out.println("Invalid input for quantity");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input for Quantity");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                in.nextLine();
            }
        } while(quantity>maxQuantity || quantity<minQuantity);
        quantity_price.add(quantity); 
        return quantity_price;
    } // end of addNewQuantity()
    
    public static ArrayList<Integer> addNewPrice(ArrayList<Integer> quantity_price)
    { 
        Scanner in = new Scanner(System.in);
        int price=-1, minPrice=0;
        
        do 
        {
            try
            {
               System.out.print("Enter Price: ");
                price = in.nextInt();

                if(price<minPrice)
                   {
                        System.out.println("Invalid Input for Price");
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                   } 
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input for Price");
                System.out.println("--------------------------------------------------------------------------------------------------------"); 
                in.nextLine();
            }
        } while (price<minPrice);
        
        quantity_price.add(price);
        return quantity_price;
    } // end of addNewPrice()
}// end of class