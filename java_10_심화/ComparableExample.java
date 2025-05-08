package java_10_심화;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("홍길동", 35));
        people.add(new Person("감자바", 25));
        people.add(new Person("박지원", 31));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.name + " " + person.age);
        }
    }
}
