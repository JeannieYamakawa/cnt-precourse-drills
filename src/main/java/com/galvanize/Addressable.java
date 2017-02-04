import java.util.*;
package com.galvanize;
// Create an Interface named Addressable with two methods:

interface Addressable {
// getAddresses - takes 0 arguments, returns a List of Address objects
    // addAddress - takes an Address, returns void
     void addAddress(String anAddress);
}

class isAddressable implements Addressable{

    private List<Address> myListOfAddresses = new ArrayList<Address>();

    public List<Address> getAddresses(){
        return myListOfAddresses;
    }

    void addAddress(String anAddress){
        String address = new Address(anAddress)
        myListOfAddresses = myListOfAddresses.add(address);
    }


}
