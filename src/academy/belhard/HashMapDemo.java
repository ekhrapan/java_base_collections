package academy.belhard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Box p1 = new Box(1, 5, 9);
        Box p2 = new Box(1, 5, 9);
        Box p3 = new Box(1, 5, 9);
        Box p4 = new Box(1, 5, 9);

        // Create ArrayList
        Map<Box, Integer> Boxs = new HashMap<>();
        Boxs.put(p1, 1);
        Boxs.put(p2, 2);
        Boxs.put(p3, 3);
        Boxs.put(p4, 4);

        outputCollection(Boxs);

        // Remove element by key
        Boxs.remove(p1);

        outputCollection(Boxs);
    }

    public static void outputCollection(Map<Box, Integer> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Box, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();
    }
}
