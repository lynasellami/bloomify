package org.example;

public class NameComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2) {
        return f1.getName().compareToIgnoreCase(f2.getName());
    }
}
