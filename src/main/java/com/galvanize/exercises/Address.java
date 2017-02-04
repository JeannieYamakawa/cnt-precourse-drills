import java.util.*;

// Create a class named Address that has 4 private fields:
public class Address{
    private String street;
    private String city;
    private String state;
    private String zip;

    // Create a constructor for Address with 4 parameters that match the fields
    public Address(String newStreet, String newCity, String newState, String newZip){
        this.street = newStreet;
        this.city = newCity;
        this.state = newState;
        this.zip = newZip;
    };

    public void setStreet (String newStreet)
    {
      street = newStreet;
  };

    public String getStreet()
    {
      return street;
  };

    public void setCity (String newCity)
    {
      city = newCity;
  };

    public String getCity()
    {
      return city;
  };

    public void setState (String newState)
    {
      state = newState;
  };

    public String getState()
    {
      return state;
  };

    public void setZip (String newZip)
    {
      zip = newZip;
  };

    public String getZip()
    {
      return zip;
  };


    // Override the toString method to return the address in the format <street>, <city>, <state> <zip>

    @Override public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(street + ", " + city + ", " + state + " " + zip);
    return result.toString();
  }

    
}
