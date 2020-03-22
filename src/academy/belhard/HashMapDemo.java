package academy.belhard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Brown");
        Person p2 = new Person("Tom", "Brown");
        Person p3 = new Person("Tom", "Brown");
        Person p4 = new Person("Tom", "Brown");

        // Create ArrayList
        Map<Person, Integer> persons = new HashMap();
        persons.put(p1, 1);
        persons.put(p2, 2);
        persons.put(p3, 3);
        persons.put(p4, 4);

        outputCollection(persons);

        // Remove element by key
        persons.remove(p1);

        outputCollection(persons);
    }

    public static void outputCollection(Map<Person, Integer> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();
    }
}
