package ru.nobilis.ilyacherney.homeworks;

public class Order {
        private int id;
        private double price;

        public Order(int id, double price) {
            this.id = id;
            this.price = price;
        }

        public int getId() {
        return id;
    }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Order ID: " + id + ", Price: " + price;
        }
}
