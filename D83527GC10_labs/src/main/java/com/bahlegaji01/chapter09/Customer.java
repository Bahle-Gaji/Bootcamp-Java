package com.bahlegaji01.chapter09;

public class Customer {

    private String name;
    private String ssn;

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
