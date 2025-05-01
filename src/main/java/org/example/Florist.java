package org.example;

/**
 * Florist user with management options.
 */
public class Florist extends User {
    public Florist(String name, String id) {
        super(name, id);
    }

    @Override
    public void viewOptions() {
        System.out.println("1. Add Flower\n2. Remove Flower\n3. View Inventory\n4. Save Inventory");
    }
}