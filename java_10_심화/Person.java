package java_10_심화;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>{
    public String name;
    public int age;

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
