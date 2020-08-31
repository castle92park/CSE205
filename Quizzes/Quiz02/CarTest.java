package Quiz02;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setYearModel(2006);
		myCar.setMake("Ford");
		System.out.println(myCar);
		
		myCar.accelerate();
		System.out.println("Current speed is: "+myCar.getSpeed()+" miles/per hour");
		myCar.brake();
		System.out.println("Current speed is: "+myCar.getSpeed()+" miles/per hour");
	}

}
