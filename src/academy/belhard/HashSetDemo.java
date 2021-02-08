package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Box p1 = new Box(1, 5, 9);
        Box p2 = new Box(1, 5, 9);
        Box p3 = new Box(1, 5, 9);
        Box p4 = new Box(1, 5, 9);

        // Create Set
        Set<Box> Boxs = new HashSet<>();
        Boxs.add(p1);
        Boxs.add(p2);
        Boxs.add(p3);
        Boxs.add(p4);

        outputCollection(Boxs);

        // Remove element by value
        Boxs.remove(p1);

        outputCollection(Boxs);
    }

    public static void outputCollection(Set<Box> set) {
        System.out.println("Вывод: ");

        for (Box number : set) {
            System.out.println(number + " ");
        }

        System.out.println();
    }
}
