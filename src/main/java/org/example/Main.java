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

        // Search by name
        System.out.println("\nSearch results for 'rose':");
        List<Flower> searchResults = orderManager.searchByName("rose", inventory);
        for (Flower flower : searchResults) {
            System.out.println(" - " + flower.getName());
        }

        // Filter by type
        System.out.println("\nFiltering by type 'Tulip':");
        List<Flower> tulips = orderManager.filterByType("Tulip", inventory);
        for (Flower flower : tulips) {
            System.out.println(" - " + flower.getName());
        }

        // Create a customer and place an order
        Customer alice = new Customer("Alice", "C001");
        Order order = new Order();
        order.addItem(inventory.get(0)); // Red Rose
        order.addItem(inventory.get(2)); // White Daisy

        orderManager.addOrder(alice, order);

        System.out.println("\nOrder total for " + alice.getName() + ": $" + order.calculateTotal());

        orderManager.saveOrders();

    }
}