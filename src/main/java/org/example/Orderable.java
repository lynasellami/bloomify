package org.example;

/**
 * Interface for any item that can be ordered.
 */
public interface Orderable {
    /**
     * Calculates the total price of the order.
     * @return total price
     */
    double calculateTotal();
}

