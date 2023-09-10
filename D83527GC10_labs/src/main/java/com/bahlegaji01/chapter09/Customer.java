package com.bahlegaji01.chapter09;

public class Customer {

    private String name;
    private String ssn;
    
    //Ex 9-2
    //Add a custom constructor
    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    
    //Ex 9-1
    // Encapsulate this class.  Make ssn read only.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return this.ssn;
    }

}
