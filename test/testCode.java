import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class testCode{
  public static void main(String[] args){
  
  
  String asuURL = "www.public.asu.edu/~JohnSmith/CSE205";
  
  Scanner parse = new Scanner(asuURL);
  parse.useDelimiter("[./~]");
  int i=1;
while (i!=0){
	if(parse.hasNext()){ // if there is scanner input left
		String temp = parse.next();
		if (temp.length()>0) {
			temp+="\n";
		}
		System.out.print(temp); // print the parsed word
	}else{i=0; // else, update sentinel i and stop the loop
	}
	}

//DecimalFormat format1 = new DecimalFormat("$0.###");
//DecimalFormat format2 = new DecimalFormat("0.00%");
//DecimalFormat format3 = new DecimalFormat("0.0000");
//double num1 = 123.56; 
//double num3 = 234.567;
//double num2 = 0.56789;
//System.out.println(format1.format(num1)); 
//System.out.println(format3.format(num3));
//System.out.println(format2.format(num2));
//
//
//


}
}