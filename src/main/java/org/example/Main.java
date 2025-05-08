package org.example;

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
    }
}