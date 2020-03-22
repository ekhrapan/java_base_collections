package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        outputCollection(numbers);

        // Remove element by index
        numbers.remove(0);

        outputCollection(numbers);
    }

    public static void outputCollection(List<Integer> list) {
        System.out.println();

        for (Integer number : list) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
