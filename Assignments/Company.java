// Assignment # : 4
// Name         : Yongsung Park
// StudentID    : 1218042098
// Lecture      : MWF 9:40-10:30 AM
// Description  : Company instance is used in Assignment4.java.


public class Company {
    
    private String companyName = "";
    private int numOfEmployees = 0;
    private String nameOfCEO = "";
    private Address address = new Address();
    
public Company() {}

//----------------------------------------------------------------
// Getters
public String getCompanyName(){
    return companyName;
}

public int getNumOfEmployees(){
    return numOfEmployees;
}

public String getNameOfCEO(){
    return nameOfCEO;
}

public Address getAddress(){
    return address;
}

//----------------------------------------------------------------
// Setters
public void setCompanyName(String nName) {
	this.companyName = nName;
}
public void setNumOfEmployees(int nNumber) {
	this.numOfEmployees = nNumber;
}
public void setNameOfCEO(String nCEO) {
	this.nameOfCEO = nCEO;
}
public void setAddress(String street, String city, String state) {
	this.address.setStreet(street);
	this.address.setCity(city);
	this.address.setState(state);
}

@Override
public String toString() {
	String company;
	company = 
	"\nCompany Name :\t\t" + companyName + "\n" +

	"# of Employees:\t\t" + numOfEmployees + "\n" + 

	"Name of CEO:\t\t" + nameOfCEO + "\n" +

	"Address:\t\t" + address.toString() + "\n"; 
	
	return company;
}
    
}
