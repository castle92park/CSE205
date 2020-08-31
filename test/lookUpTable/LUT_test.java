
package lookUpTable;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;


public class LUT_test {
	public static void main(String[] args) throws IOException {
		int kNumHues = 16;
		int kNumSats = 16;
		int kNumVals = 16;
		int kEncoding = 0;
		String dirFolder = "/Users/rabbit/Pictures/LUT_test/";
		String dirDef = "/Users/rabbit/Pictures";
		String dirFile = "";
		Scanner read = new Scanner(System.in);
		System.out.print("name for the lut: ");
		dirFile = read.nextLine();		
		
		File lut1 = new File(dirFolder + dirFile + ".csv");
		if (lut1.createNewFile()) {
			System.out.print("File "+dirFile+".csv was successfully made.");
		} else {
			System.out.print("File already exists.");
		}
		
		
		FileWriter wrt1 = new FileWriter(dirFolder + dirFile + ".csv",true);
		
		
			try {
				wrt1.write(Integer.toString(kNumHues)+","+Integer.toString(kNumSats)+","
						+Integer.toString(kNumVals)+","+ Integer.toString(kEncoding)+"\n");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		// Generate the entries
		for (int v = 1; v < kNumVals; v++)
		{
			for (int h = 0; h < kNumHues; h++)
			{
				for (int s = 0; s < kNumSats; s++) // NOTE: this loop starts with 1!
				{
				// NOTE Zero input saturation entries must have a value
				// scale factor of 1.0
					double hueDelta, satScale, valScale;
					
					if (s == 0)
					{
							valScale = 1.0;
					} else {
						// Do your processing here to set these values.
						
						hueDelta = (double)h/kNumHues;
						satScale = (double)s/kNumSats;
						valScale = (double)v/kNumVals;
						NumberFormat fmt = new DecimalFormat("#0.00000"); 
					
						
						
						// Write the entry.
						try {
							wrt1.write(fmt.format(hueDelta)+","+fmt.format(satScale)+","+
							fmt.format(valScale)+"\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				
				}	// close value loop
			}	// close saturation loop
		}	// close hue loop
		read.close();
		wrt1.close();
	}
	
}
