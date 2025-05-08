package java_10_심화;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        fruits.sort(new FruitComparator());
        for (Fruit f : fruits) {
            System.out.println(f.name + " " + f.price);
        }
    }
}
