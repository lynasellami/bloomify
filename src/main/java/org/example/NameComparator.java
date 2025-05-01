package org.example;
import java.util.Comparator;

/**
 * Sorts flowers alphabetically by name.
 */
public class NameComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2) {
        return f1.getName().compareToIgnoreCase(f2.getName());
    }
}
