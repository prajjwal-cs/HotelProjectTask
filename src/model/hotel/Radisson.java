/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-02-2022
Time: 22:43
File: Radisson.java */
package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public final class Radisson extends Hotel {
    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 100;
            }
            else {
                return 110;
            }
        } else if (customer instanceof RewardCustomer) {
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 90;
            }
            else {
                return 100;
            }
        }
        return 0;
    }
}