package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderParser {
	
	public static Order parStrOrd(String lineIn) {
		
		/*
		 * New		/ productName/ quantity/ unitPrice/ salesName		/ refundableStatus	/
		 * Cancelled/ productName/ quantity/ unitPrice/ cancelledDate	/ cancelledReason	/
		 * Shipped	/ productName/ quantity/ unitPrice/ shippingAddress	/ wayOfShipping		/
		 * 
		 */

		Scanner read = new Scanner(lineIn).useDelimiter("/");
		
		// this array stores the tokens. 
		String[] tokens = new String[6];	
		int i = 0;	//counter for the loop
		
		// initialize the array with tokens
		for (i=0; i<6; i++) {
			tokens[i] = read.next();
		}	
		
		// with newOrders, "yes" or "no" has to be translated to "true" or "false" to be parsed correctly.
		if (tokens[0].substring(0,1).toUpperCase().equals("N")) {	
			if (tokens[5].equals("Yes")) {
				tokens[5] = "true";
			} else {
				tokens[5] = "false";
			}	// close IfElse
		}	// close IF 
		
		
		
		//--------------------------------------------------------------------------//
		Order order = null;		// null order which is later assigned.

		if (tokens[0].equals("New")) {
			
			order = new NewOrder(
					tokens[1], // name
					Integer.parseInt(tokens[2]), 		// quantity  
					Double.parseDouble(tokens[3]),	// unitprice
					tokens[4],				// sales name					
					Boolean.parseBoolean(tokens[5])	// refund status
					);
		} else if (tokens[0].equals("Cancelled")) {
			
			order = new CancelledOrder(
					tokens[1],	// name
					Integer.parseInt(tokens[2]),	// quantity  
					Double.parseDouble(tokens[3]), 	// unitprice
					tokens[4], 	// cancelled date
					tokens[5]		// cancelled reason
					);
		} else if (tokens[0].equals("Shipped")) {
			
			order = new ShippedOrder(
					tokens[1],	// name
					Integer.parseInt(tokens[2]),	// quantity  
					Double.parseDouble(tokens[3]), 	// unit price
					tokens[4], 	// shipping address
					tokens[5]		// way of shipping
					);
		
		}
		
		
		
		
		read.close();	
		return order;
	}
	

}
