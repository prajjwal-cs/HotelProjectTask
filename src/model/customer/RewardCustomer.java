/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:46
File: RewardCustomer.java */
package model.customer;

import model.hotel.Hotel;
import model.hotel.Oyo;
import model.hotel.Radisson;
import model.hotel.Taj;

import javax.swing.*;

public class RewardCustomer implements Customer {
    @Override
    public void bookHotel(Hotel hotel) {
        int bookingRate = 0;
        if (hotel instanceof Oyo oyo) {
            bookingRate = oyo.getRate(this);
        }
        else if (hotel instanceof Radisson radisson) {
            bookingRate = radisson.getRate(this);
        }
        else if (hotel instanceof Taj taj) {
            bookingRate = taj.getRate(this);
        }
        JOptionPane.showConfirmDialog(
                null,
                "The booking rate of this hotel is " + bookingRate
        );
    }
}