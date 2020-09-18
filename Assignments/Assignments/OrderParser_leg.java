package Assignments;

import java.util.Scanner;

public class OrderParser_leg {
	
	public static Order parStrOrd(String lineIn) {
		
		/*
		 * New		/ productName/ quantity/ unitPrice/ salesName		/ refundableStatus	/
		 * Cancelled/ productName/ quantity/ unitPrice/ cancelledDate	/ cancelledReason	/
		 * Shipped	/ productName/ quantity/ unitPrice/ shippingAddress	/ wayOfShipping		/
		 * 
		 */
		
		
/***********
        Some messy trick I'm using to correctly parse a refundable status:
        Since the refund info is at the very end of input,
        if it's a yes(=true), there will be 3 more chars after the last /.
        if it's a no(=false), there will be 2 more chars after the last /.
        So I can compare the length of a string with lastIndexOf('/'). 
***********/
		String inputInfo = lineIn;
		 if (inputInfo.lastIndexOf('/')==inputInfo.length()-3) {
        	 inputInfo = inputInfo.substring(0,inputInfo.length()-2) + "false";
         } else if (inputInfo.lastIndexOf('/')==inputInfo.length()-4) {
        	 inputInfo = inputInfo.substring(0,inputInfo.length()-3) + "true";
         }	// modify the input string so it can be parsed.
		 
		Scanner read = new Scanner(inputInfo).useDelimiter("/");
		
		Order order = null;
		char con = read.next().charAt(0);
		
		switch (con) {
		
		case 'N' :
			order = new NewOrder(
					read.next(), // name
					Integer.parseInt(read.next()), 		// quantity  
					Double.parseDouble(read.next()),	// unitprice
					read.next(),				// sales name					
					Boolean.parseBoolean(read.next())	// refund status
					);
			break;
			
		case 'C' :
			order = new CancelledOrder(
					read.next(),	// name
					Integer.parseInt(read.next()),	// quantity  
					Double.parseDouble(read.next()), 	// unitprice
					read.next(), 	// cancelled date
					read.next()		// cancelled reason
					);
			break;
			
		case 'S' :
			order = new ShippedOrder(
					read.next(),	// name
					Integer.parseInt(read.next()),	// quantity  
					Double.parseDouble(read.next()), 	// unit price
					read.next(), 	// shipping address
					read.next()		// way of shipping
					);
			break; 
		
		}
		
		
		
		
		read.close();	
		return order;
	}
	

}
