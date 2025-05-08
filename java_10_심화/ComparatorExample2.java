package java_10_심화;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        fruits.sort(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Integer.compare(o1.price, o2.price);
            }
        });

        for (Fruit f : fruits) {
            System.out.println(f.name + " " + f.price);
        }
    }
}
