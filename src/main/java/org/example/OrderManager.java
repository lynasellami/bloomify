package org.example;
import java.io.*;
import java.util.*;

/**
 * Manages saving and loading of orders and inventory.
 */
public class OrderManager {
    private Map<Customer, Order> orderMap = new HashMap<>();

    public void addOrder(Customer customer, Order order) {
        orderMap.put(customer, order);
    }

    public void saveOrders() {
        try (PrintWriter writer = new PrintWriter("orders.txt")) {
            for (Map.Entry<Customer, Order> entry : orderMap.entrySet()) {
                writer.println("Customer: " + entry.getKey().getName());
                for (Flower f : entry.getValue().getItems()) {
                    writer.println(" - " + f.getName() + ", $" + f.getPrice());
                }
                writer.println("Total: $" + entry.getValue().calculateTotal());
                writer.println();
            }
        } catch (IOException e) {
            System.out.println("Error saving orders: " + e.getMessage());
        }
    }

    public void loadInventory(List<Flower> inventory) {
        try (Scanner scanner = new Scanner(new File("inventory.txt"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    boolean available = Boolean.parseBoolean(parts[2]);
                    inventory.add(new Rose(name, price, available)); // Simplified for now
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found.");
        }
    }

    public void saveInventory(List<Flower> inventory) {
        try (PrintWriter writer = new PrintWriter("inventory.txt")) {
            for (Flower flower : inventory) {
                writer.println(flower.getName() + "," + flower.getPrice() + "," + flower.isAvailable());
            }
        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    public void removeFlowerByName(String name, List<Flower> inventory) {
        inventory.removeIf(f -> f.getName().equalsIgnoreCase(name));
    }
}
