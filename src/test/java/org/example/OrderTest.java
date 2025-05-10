package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {


    @Test
    public void testAddItemIncreasesSize() {
        Order order = new Order();
        Flower flower = new Rose("Red Rose", 10.0, true);
        order.addItem(flower);
        assertEquals(1, order.getItems().size());
    }

    @Test
    public void testCalculateTotalWithMultipleItems() {
        Order order = new Order();
        order.addItem(new Rose("Red Rose", 10.0, true));
        order.addItem(new Tulip("Yellow Tulip", 5.0, true));
        order.addItem(new Daisy("White Daisy", 2.5, true));
        assertEquals(17.5, order.calculateTotal());
    }

    @Test
    public void testCalculateTotalEmptyOrder() {
        Order order = new Order();
        assertEquals(0.0, order.calculateTotal());
    }
}
