package org.example;
import java.util.List;
import java.util.ArrayList;

/**
 * Main class to demo basic polymorphism.
 */
public class Main {
    public static void main(String[] args) {
        User user = new Customer("Alice", "C001");
        user.viewOptions();

        Flower f1 = new Rose("Red Rose", 10.99, true);
        Flower f2 = new Tulip("Yellow Tulip", 5.49, true);
        System.out.println(f1.compareTo(f2)); // Demonstrates Comparable

        OrderManager orderManager = new OrderManager();
        List<Flower> inventory = new ArrayList<>();

        inventory.add(new Rose("Red Rose", 10.99, true));
        inventory.add(new Tulip("Yellow Tulip", 5.49, true));
        inventory.add(new Daisy("White Daisy", 3.25, true));
        inventory.add(new Rose("Pink Rose", 12.50, true));

        orderManager.saveInventory(inventory);

        // Filter by price
        System.out.println("\nFlowers between $5 and $11:");
        List<Flower> filtered = orderManager.filterByPrice(5.0, 11.0, inventory);
        for (Flower flower : filtered) {
            System.out.println(" - " + flower.getName() + ": $" + flower.getPrice());
        }

    }
}