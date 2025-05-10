package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class OrderManagerTest {

    @Test
    public void testAddOrderDoesNotCrash() {
        OrderManager manager = new OrderManager();
        Customer customer = new Customer("Alice", "C001");
        Order order = new Order();
        order.addItem(new Rose("Red Rose", 10.0, true));

        // Just test that it stores without throwing
        assertDoesNotThrow(() -> manager.addOrder(customer, order));
    }

    @Test
    public void testLoadInventoryDoesNotCrash() {
        OrderManager manager = new OrderManager();
        List<Flower> inventory = new ArrayList<>();
        assertDoesNotThrow(() -> manager.loadInventory(inventory));
    }
}
