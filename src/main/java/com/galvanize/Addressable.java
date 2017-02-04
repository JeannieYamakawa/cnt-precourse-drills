package com.galvanize;
import java.util.*;
// Create an Interface named Addressable with two methods:

public interface Addressable {
// getAddresses - takes 0 arguments, returns a List of Address objects
     public void addAddress(Address anAddress);
     public List<Address> getAddresses();
}

// public abstract class isAddressable implements Addressable{
//
//     private List<Address> myListOfAddresses = new ArrayList<Address>();
//
//     public List<Address> getAddresses(){
//         return myListOfAddresses;
//     }
//     // addAddress - takes an Address, returns void
//     public void addAddress(String aStreet, String aCity, String aState, String aZip){
//         Address newObj = new Address(aStreet, aCity, aState, aZip);
//         myListOfAddresses.add(newObj);
//     }
//
//
// }
