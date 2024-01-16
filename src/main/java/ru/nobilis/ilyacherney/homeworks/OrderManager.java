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

    public List<Order> getOrders() {
        return orders;
    }
}