/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:44
File: Oyo.java */
package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public final class Oyo extends Hotel{
    @Override
    public int getRating() {
        return 4;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
            LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 90;
            }
            else {
                return 130;
            }
        } else if (customer instanceof RewardCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 80;
            }
            else {
                return 90;
            }
        }
        return 0;
    }
}