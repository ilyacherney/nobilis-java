//Управление заказами (добавление, удаление, получение заказов).
//Расчёт общей стоимости заказа (в разных случаях может быть разный).
//Печать деталей заказа.
//Отправка уведомлений о статусе заказа.
package ru.nobilis.ilyacherney.homeworks;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }

    public void printOrderDetails() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void sendOrderStatusUpdate(Order order, String status) {
        System.out.println("Order " + order.getId() + " status updated to: " + status);
    }

    class Order {
        private int id;
        private double price;

        public Order(int id, double price) {
            this.id = id;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Order ID: " + id + ", Price: " + price;
        }
    }
}