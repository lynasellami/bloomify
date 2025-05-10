package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testAddToOrderIncreasesCartSize() {
        Customer customer = new Customer("Alice", "C001");
        Flower flower = new Rose("Red Rose", 10.0, true);
        customer.addToOrder(flower);
        assertEquals(1, customer.getCart().size());
    }

    @Test
    public void testCartContainsCorrectFlower() {
        Customer customer = new Customer("Alice", "C001");
        Flower flower = new Tulip("Yellow Tulip", 5.0, true);
        customer.addToOrder(flower);
        assertEquals("Yellow Tulip", customer.getCart().get(0).getName());
    }
}
