package ru.nobilis.ilyacherney.homeworks;

import java.util.List;

public class OrderCalculator {
    public double calculateTotalPrice(List<Order> orders) {
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}
