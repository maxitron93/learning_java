package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

// Very similar to a List but prevents duplicates from being inserted
// Sets also don't maintain the order in which elements are added or removed
public class Sets {

    public static void main(String[] args) {

        HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(2);
        values.add(3);
        values.add(2); // won't be added because it's a duplicate
        for (int value : values) {
            System.out.println(value);
        }

        HashSet<String> words = new HashSet<String>();
        words.add("first");
        words.add("second");
        words.add("first"); // won't be added because it's a duplicate
        for (String word : words) {
            System.out.println(word);
        }

        // Like a HasSet, but order is maintained
        // Duplicates still can't be added
        LinkedHashSet<Integer> orderedValues = new LinkedHashSet<Integer>();
        orderedValues.add(100);
        orderedValues.add(90);
        orderedValues.add(95);
        orderedValues.add(90);
        for (int value : orderedValues) {
            System.out.println(value);
        }

    }

}
