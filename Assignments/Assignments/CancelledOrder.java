package Assignments;

import java.text.DecimalFormat;

public class CancelledOrder extends Order{
	
	private String CancelledDate, CancelledReason;

	public CancelledOrder(String name, int quantity, double price, 
			String date, String reason) {
		this.productName = name; this.quantity = quantity; this.unitPrice = price;
		this.CancelledDate = date; this.CancelledReason = reason;
	}	// end of constructor
	
	
	@Override
	public void computeTotalCost() {
		totalCost *= 0.02 * quantity * unitPrice;
	}
	
	@Override
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("$#0.00");
		String out =
//				\nCancelled Order
//				\nProd. Name:\t\tGrandpa Roseberry Spread\n
//				Quantity:\t\t15\n
//				Unit Price:\t\t$25.50\n
//				Total Cost:\t\t$7.65\n 
//				Cancel Date:\t\t06.11.2020\n
//				Cancel Reason:\t\tLacking flavor\n
				"\nCancelled Order" + 
				"\nProd. Name:\t\t" + productName + 
				"\nQuantity:\t\t" + quantity + 
				"\nUnit Price:\t\t" + fmt.format(unitPrice) +
				"\nTotal Cost:\t\t" + fmt.format(totalCost) +
				"\nCancel Date:\t\t" + CancelledDate +
				"\nCancel Reason:\t\t" + CancelledReason +
				"\n"
				;
		return out;
	}
}
