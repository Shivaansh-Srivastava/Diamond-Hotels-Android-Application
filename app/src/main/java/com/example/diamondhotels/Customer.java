package com.example.diamondhotels;

import java.io.Serializable;

public class Customer implements Serializable {

    public String fName;
    public String password;
    public String phn;
    public int stay;
    public int cost;
    public String rType;
    public String facility;


    public Customer(String fName, String password) {
        this.fName = fName;
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(Integer stay) {
        this.stay = stay;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public int bill_generator_room()
    {
        return this.cost * this.stay;
    }

}
