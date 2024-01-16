package ru.nobilis.ilyacherney.homeworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesAnalysis {
        static class Sale {
            String product;
            String category;
            int quantity;
            double price;

            public Sale(String product, String category, int quantity, double price) {
                this.product = product;
                this.category = category;
                this.quantity = quantity;
                this.price = price;
            }

        }

        public static void main(String[] args) {
            List<Sale> sales = new ArrayList<>();

            double totalRevenue = 0;
            for (Sale sale : sales) {
                totalRevenue += sale.price * sale.quantity;
            }

            Map<String, Integer> categoryCounts = new HashMap<>();
            for (Sale sale : sales) {
                categoryCounts.put(sale.category, categoryCounts.getOrDefault(sale.category, 0) + sale.quantity);
            }

            double maxPrice = 0;
            for (Sale sale : sales) {
                if (sale.price > maxPrice) {
                    maxPrice = sale.price;
                }
            }

            System.out.println("Total Revenue: " + totalRevenue);
            System.out.println("Category Counts: " + categoryCounts);
            System.out.println("Max Sale Price: " + maxPrice);
        }
    }

