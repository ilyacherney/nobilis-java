package ru.nobilis.ilyacherney.homeworks;

public class OrderNotificator {
    public void sendOrderStatusUpdate(Order order, String status) {
        System.out.println("Order " + order.getId() + " status updated to: " + status);
    }
}
