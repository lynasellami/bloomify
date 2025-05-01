package org.example;

/**
 * Abstract class representing a flower.
 */
public abstract class Flower implements Comparable<Flower> {
    protected String name;
    protected double price;
    protected boolean isAvailable;

    public Flower(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    @Override
    public int compareTo(Flower other) {
        return Double.compare(this.price, other.price);
    }
}
