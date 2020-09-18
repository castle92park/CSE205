package Assignments;

import java.text.DecimalFormat;

public class NewOrder extends Order{

	private String salesName = "?";
	private boolean refundableStatus = false;

	
	
	public NewOrder(String nName, int nQuant, double nPrice, String salesName, 
			boolean refundStatus) {
		this.productName = nName; this.quantity = nQuant; this.unitPrice = nPrice; 
		this.salesName = salesName; this.refundableStatus = refundStatus;
	}	//end of constructor

	
	@Override
	public void computeTotalCost() {
		totalCost = quantity*unitPrice;
		totalCost *= 1.086;		// taxrate = 8.6%
		if (refundableStatus){
			totalCost *= 1.02; 		// premium for refundables
		}
	}	// end of computeTotal
	
	
	@Override
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("$#0.00");
		String out = 
				"\nNewOrder" + 
				"\nProd. Name:\t\t" + productName + 
				"\nQuantity:\t\t" + quantity + 
				"\nUnit Price:\t\t" + fmt.format(unitPrice) +
				"\nTotal Cost:\t\t" + fmt.format(totalCost) +
				"\nSales Name:\t\t" + salesName +
				"\nRefund Status:\t\t" + refundableStatus +
				"\n"
				;
		return out;	
	}	// end of toString
	
}
