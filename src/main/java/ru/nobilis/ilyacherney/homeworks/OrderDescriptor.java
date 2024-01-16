package ru.nobilis.ilyacherney.homeworks;

import java.util.List;

public class OrderDescriptor {
    public void printOrderDetails(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
