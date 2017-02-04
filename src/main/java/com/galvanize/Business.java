package com.galvanize;
import java.util.*;

public abstract class Business implements Addressable{
    // Create two private, final fields... name: String, addresses: ArrayList of Addresses
    private String name;
    private List<Address> myListOfAddresses = new ArrayList<Address>();

    // Create a constructor for Business with a single parameter for name (a String).
    public Business(String aName) {
    this.name = aName;
    }

    // Create a getter for name.
    public String getName(){
      return name;
    };

    // Implement Addressable such that if you call addAddress and pass it an address, then call getAddresses, the address you added should be in the list.

    public void addAddress(String aStreet, String aCity, String aState, String aZip){
        Address newObj = new Address(aStreet,aCity,aState,aZip);
        myListOfAddresses.add(newObj);
    }

    public List<Address> getAddresses(){
            return myListOfAddresses;
        }
}
