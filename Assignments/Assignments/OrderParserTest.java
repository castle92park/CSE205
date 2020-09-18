package Assignments;

import java.util.Scanner;


public class OrderParserTest {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("type inputs.");
		String in = read.nextLine();
		Order nOrder = OrderParserV02.parStrOrd(in);
		
		System.out.print(nOrder.toString());
		read.close();
	}

}
