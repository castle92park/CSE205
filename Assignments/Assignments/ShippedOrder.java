//package Assignments;

import java.text.DecimalFormat;

public class ShippedOrder extends Order{
	
	private String shippingAddress, wayOfShipping; 
	private double shippingFee;
	
	public ShippedOrder(String name, int quantity, double price, String address, String way) {
		super(name,quantity,price); 
		this.shippingAddress = address; this.wayOfShipping = way;
	}	// end of constructor
	
	public void setShippingFee() {
		totalCost = quantity * unitPrice; 
		if (wayOfShipping.equals("Economy")) {
			shippingFee = totalCost * 0.06;	// 6% for economy
		} else if (wayOfShipping.equals("Regular")) {
			shippingFee = totalCost * 0.08; // 8% for regular
		} else {
			shippingFee = totalCost * 0.12;	// 12% for express
		}	// 3 cases
	}	// end of setShippingFee
	
	@Override
	public void computeTotalCost() {
		// TODO Auto-generated method stub
		setShippingFee();
		totalCost += shippingFee;
	}
	
	@Override
	public String toString(){
		DecimalFormat fmt = new DecimalFormat("$#0.00");
		String out = 
//				\nShipped Order
//				\nProd. Name:\t\tNorthwoods Cranberry Sauce\n
//				Quantity:\t\t20\n
//				Unit Price:\t\t$45.0\n
//				Total Cost:\t\t$972.00\n 
//				Shipping Adrs.:\t\t699 S. Mill Ave, Tempe, AZ 85281\n
//				Shipping Way:\t\tRegular\n
//				Shipping Fee:\t\t$72.00\n
				"\nShipped Order" + 
				"\nProd. Name:\t\t" + productName +
				"\nQuantity:\t\t" + quantity + 
				"\nUnit Price:\t\t" + fmt.format(unitPrice) + 
				"\nTotal Cost:\t\t" + fmt.format(totalCost) + 
				"\nShipping Adrs.:\t\t" + shippingAddress + 
				"\nShipping Way:\t\t" + wayOfShipping +  
				"\nShipping Fee:\t\t" + fmt.format(shippingFee)
				+ "\n";
			return out;
	}
}
