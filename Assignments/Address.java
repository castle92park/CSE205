// Assignment # : 4
// Name         : Yongsung Park
// StudentID    : 1218042098
// Lecture      : MWF 9:40-10:30 AM
// Description  : Address stores address info of a Company instance.
public class Address {
    private String street= "?", city= "?", state = "?";;
    
    public static void main(String[] args){
        
        
        
        
        
        
        
    }
    
    @Override
    public String toString(){   
        String addr;
        addr = street + ", " + city + ", " + state;
        return addr;
    }
    
    
    public String getStreet(){
        return street;
    }   // return street 
    
    public String getCity(){
        return city;
    }   // return city
    
    public String getState(){
        return state;
    }   // return state
    
    public void setStreet(String nStreet){
        this.street = nStreet;
    }   // update street
    
    public void setCity(String nCity){
        this.city = nCity;
    }   // update city
    
    public void setState(String nState){
        this.state = nState;
    }   // update state
    
}
