package org.example;
import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {
    private List<Flower> items = new ArrayList<>();

    public void addItem(Flower flower) {
        items.add(flower);
    }

    public List<Flower> getItems() {
        return items;
    }

    @Override
    public double calculateTotal() {
        return items.stream().mapToDouble(Flower::getPrice).sum();
    }
}
