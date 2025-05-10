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
}
