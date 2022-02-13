/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:38
File: Hotel.java */
package model.hotel;

import model.customer.Customer;

public sealed abstract class Hotel permits Oyo, Radisson, Taj {

    private int rating;
    private int rate;

    public int getRating() {
        return rating;
    }

    public int getRate(Customer customer) {
        return rate;
    }
}