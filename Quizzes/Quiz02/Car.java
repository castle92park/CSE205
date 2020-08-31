package Quiz02;

public class Car {
	
	private int yearModel = 1900;
	private String make = "?";
	private double speed = 0.0;

	public Car() {
		
	}
	
	public int getYearModel() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setYearModel(int YM) {
		yearModel = YM;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void accelerate() {
		speed+= 10.0;
	}
	
	public void brake() {
		speed += -5.0;
	}
	
	public String toString() {
		String str ="Year:\t\t"+yearModel + 
					"\nMake:\t\t"+make +
					"\nSpeed:\t\t"+speed;
		return str;
		
	}
}
