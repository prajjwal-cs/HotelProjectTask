/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:45
File: RegularCustomer.java */
package model.customer;

import model.hotel.Hotel;
import model.hotel.Oyo;
import model.hotel.Radisson;
import model.hotel.Taj;

public class RegularCustomer implements Customer {
    @Override
    public void bookHotel(Hotel hotel) {
        if (hotel instanceof Oyo oyo) {
            oyo.getRate(this);
        }
        else if (hotel instanceof Radisson radisson) {
            radisson.getRate(this);
        }
        else if (hotel instanceof Taj taj) {
            taj.getRate(this);
        }
    }
}