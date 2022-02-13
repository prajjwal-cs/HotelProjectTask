/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 13-02-2022
Time: 23:14
File: Main.java */
package model.main;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;
import model.hotel.Hotel;
import model.hotel.Radisson;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Radisson();

        Customer customer1 = new RegularCustomer();
        customer1.bookHotel(hotel);

        Customer customer2 = new RewardCustomer();
        customer2.bookHotel(hotel);

    }
}