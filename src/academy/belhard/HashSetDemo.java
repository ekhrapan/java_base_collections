package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Brown");
        Person p2 = new Person("Tom", "Brown");
        Person p3 = new Person("Tom", "Brown");
        Person p4 = new Person("Tom", "Brown");

        // Create ArrayList
        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        outputCollection(persons);

        // Remove element by value
        persons.remove(p1);

        outputCollection(persons);
    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println();
    }
}
