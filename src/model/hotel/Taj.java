/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:43
File: Taj.java */
package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public class Taj extends Hotel {
    @Override
    public int getRating() {
        return 2;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 110;
            }
            else {
                return 120;
            }
        } else if (customer instanceof RewardCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 95;
            }
            else {
                return 105;
            }
        }
        return 0;
    }
}