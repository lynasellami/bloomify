package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlowerTest {

    @Test
    public void testCompareTo() {
        Flower f1 = new Rose("Red Rose", 9.99, true);
        Flower f2 = new Tulip("Yellow Tulip", 4.99, true);
        assertTrue(f1.compareTo(f2) > 0);
    }

    @Test
    public void testGetName() {
        Flower flower = new Daisy("Daisy Delight", 6.49, true);
        assertEquals("Daisy Delight", flower.getName());
    }

    @Test
    public void testAvailability() {
        Flower flower = new Rose("Unavailable Rose", 7.99, false);
        assertFalse(flower.isAvailable());
    }
}
