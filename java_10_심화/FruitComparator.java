package java_10_심화;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return Integer.compare(o1.price, o2.price);
    }
}