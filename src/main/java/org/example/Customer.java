package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer user with shopping cart.
 */
public class Customer extends User {
    private List<Flower> cart;

    public Customer(String name, String id) {
        super(name, id);
        this.cart = new ArrayList<>();
    }

    @Override
    public void viewOptions() {
        System.out.println("1. View Flowers\n2. Filter by Type\n3. Place Order");
    }

    public void addToOrder(Flower flower) {
        cart.add(flower);
    }

    public List<Flower> getCart() {
        return cart;
    }
}
