package Assignments;
// Assignment # : 4
// Name         : Yongsung Park
// StudentID    : 1218042098
// Lecture      : MWF 9:40-10:30 AM
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.

import java.util.*;

public class Assignment4
 {
  public static void main(String[] args)
   {
       // local variables, can be accessed anywhere from the main method
       char input1 = 'Z';
       String inputInfo;
       String companyName, nameOfCEO, street, city, state, numOfEmployeeStr;
       int numOfEmployees;
       String line = new String();

       // instantiate a Company object
       Company company1 = new Company();

       printMenu();

       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);

       do  // will ask for user input
        {
            System.out.print("\nWhat action would you like to perform?\n");
            line = scan.nextLine();

            if (line.length() == 1)
            {
                input1 = line.charAt(0);
                input1 = Character.toUpperCase(input1);

                // matches one of the case statement
                switch (input1)
                {
                    case 'A':   //Add Company
                        System.out.print("\nPlease enter the Company information: ");
                        System.out.print("\nEnter the company name: ");
                        companyName = scan.nextLine();
                        company1.setCompanyName(companyName);

                        System.out.print("\nEnter number of employees: ");
                        numOfEmployeeStr = scan.nextLine();
                        numOfEmployees = Integer.parseInt(numOfEmployeeStr);
                        company1.setNumOfEmployees(numOfEmployees);

                        System.out.print("\nEnter the name of CEO: ");
                        nameOfCEO = scan.nextLine();
                        company1.setNameOfCEO(nameOfCEO);

                        System.out.print("\nEnter its location - Street: ");
                        street = scan.nextLine();
                        System.out.print("\nEnter its location - City: ");
                        city = scan.nextLine();
                        System.out.print("\nEnter its location - State: ");
                        state = scan.nextLine();
                        company1.setAddress(street, city, state);
                        break;
                    case 'D':   //Display Company
                        System.out.print(company1);
                        break;
                    case 'Q':   //Quit
                        break;
                    case '?':   //Display Menu
                        printMenu();
                        break;
                    default:
                        System.out.print("\nUnknown action");
                        break;
                }
          }
         else
          {
              System.out.print("\nUnknown action");
          }
        } while (input1 != 'Q' || line.length() != 1);
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Company\n" +
                        "D\t\tDisplay Company\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}