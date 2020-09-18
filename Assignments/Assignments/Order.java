//Assignment #  : 5
//Name          : Yongsung Park
//StudentID     : 1218042098
//Lecture       : MWF 9:40-10:30 AM
//Description	:

package Assignments;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Order {
	
	protected String productName = "?";
	protected int quantity = 0;
	protected double unitPrice = 0.0;
	protected double totalCost = 0.0;
	
	public Order() {
		
	}
	
	public Order(String name, int quant, double price) {
		productName = name; quantity = quant; unitPrice = price; 
	}
	
	
	public String getProductName() {
		return productName;
	}
	
	@Override
	public String toString() {
		NumberFormat fmt = new DecimalFormat("$#0.00");
		String outString = 
				"\nProd. Name:\t\t" + productName + 
				"\nQuantity:\t\t" + quantity + 
				"\nUnit Price:\t\t" + fmt.format(unitPrice) +
				"\nTotal Cost:\t\t" + fmt.format(totalCost);
		return outString;
	}
	
	public abstract void computeTotalCost(); 		// OVERRIDE in INHERTIED METHODS
}
