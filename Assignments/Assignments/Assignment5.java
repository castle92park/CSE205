package Assignments;

//Assignment # : 5
//Name         : Yongsung Park
//StudentID    : 1218042098
//Lecture      : MWF 9:40-10:30 AM
//  Description: The Assignment5 class displays a menu of choices
//               (add an order, compute the total cost, search an order, list order,
//               quit, display menu) to a user.
//               Then it performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
{
   public static void main (String[] args)
   {
      char input1;
      String inputInfo = new String();
      String line = new String();
      boolean found = false;	// had to initialize this to run.

     // ArrayList object is used to store Order objects
      ArrayList<Order> orderList = new ArrayList<Order>();

      try
      {
         printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
         InputStreamReader isr = new InputStreamReader (System.in);
         BufferedReader stdin = new BufferedReader (isr);

         do
         {
            System.out.print("\nWhat action would you like to perform?\n");
            line = stdin.readLine().trim();
            input1 = line.charAt(0);
            input1 = Character.toUpperCase(input1);

            if (line.length() == 1)
            {
               switch (input1)
               {
                  case 'A':   //Add Order
                     System.out.print("Please enter an order information to add:\n");
                     inputInfo = stdin.readLine().trim();
                     
                     
                     orderList.add(OrderParser.parStrOrd(inputInfo));	// add to the list
                     
                     break;

                  case 'C':   //Compute Total Costs

                	  for (Order order: orderList) {
                		  order.computeTotalCost();
                	  }	// for each order in the orderList, compute the total costs.
                	  
                     System.out.print("total costs computed\n");
                     break;

                  case 'S':   //Search for an Order
                     System.out.print("Please enter a product name to search:\n");
                     inputInfo = stdin.readLine().trim();
                     
                     for (Order i : orderList) {
                    	 if (i.getProductName().contentEquals(inputInfo)) {
                    		 found = true;
                    		 System.out.print("product found\n");
                    		 break;
                    	 } else {
                    		 found = false;
                    		 System.out.print("product not found\n");
                    	 }
                     }

                     break;

                  case 'L':   //List Orders
                  /***********************************************************************************
                  ***  ADD your code here to print out all Order objects in the orderList.
                  ***  If there is no order in the list, print "no orders\n"
                  ***********************************************************************************/
                	  if (orderList.size()>0) {
                		  for (Order i : orderList) {
                			  System.out.print(i.toString());
                		  }
                	  } else if (orderList.size()==0) {
                		  System.out.print("no orders\n");
                	  }
                	  
                     break;

                  case 'Q':   //Quit
                     break;
                  case '?':   //Display Menu
                     printMenu();
                     break;
                  default:
                     System.out.print("Unknown action\n");
                     break;
               }
            }
            else
            {
               System.out.print("Unknown action\n");
            }
         } while (input1 != 'Q'); // stop the loop when Q is read
      }
      catch (IOException exception)
      {
         System.out.println("IO Exception");
      }
   }

  /** The method printMenu displays the menu to a use **/
   public static void printMenu()
   {
      System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd an Order\n" +
                      "C\t\tCompute Total Costs\n" +
                      "S\t\tSearch for an Order\n" +
                      "L\t\tList Orders\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
   }
}


