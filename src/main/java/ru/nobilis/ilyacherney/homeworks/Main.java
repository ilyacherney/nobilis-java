package ru.nobilis.ilyacherney.homeworks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Order order1 = new Order(1, 50);
        Order order2 = new Order(2, 70);

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        List<Order> orders = orderManager.getOrders();

        OrderCalculator orderCalculator = new OrderCalculator();
        double orderTotalPrice = orderCalculator.calculateTotalPrice(orders);
        System.out.println(orderTotalPrice);

        OrderDescriptor orderDescriptor = new OrderDescriptor();
        orderDescriptor.printOrderDetails(orders);

        OrderNotificator orderNotificator = new OrderNotificator();
        orderNotificator.sendOrderStatusUpdate(order1, "Ready");
        orderNotificator.sendOrderStatusUpdate(order2, "In Progress");
    }
}
