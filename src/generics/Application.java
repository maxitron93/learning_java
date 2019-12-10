package generics;

// Generics allow each class to be flexible enough to accept any data type as input, while still providing type safety

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        // Need to specify the type of item 1 and item 2
        Container<String, Integer> container = new Container<String, Integer>("First Item", 10);

        container.printItems();

        // Now we can get the items
        // Before, we had to cast it
        String item1 = container.item1;
        int item2 = container.item2;

        // Using the union generic method defined below
        Set<String> set1 = new HashSet<String>();
        set1.add("First");
        set1.add("Second");
        set1.add("whatever");
        Set<String> set2 = new HashSet<String>();
        set2.add("First");
        set2.add("whatever");
        set2.add("new");
        Set<String> resultSet = union(set1, set2);
        System.out.println(resultSet);
        Iterator<String> itr = resultSet.iterator(); // Alternative to the for-each loop
        while(itr.hasNext()) {
            System.out.println((itr.next()));
        }

    }

    // This is a generic method that returns a union of set1 and set2
    // Need to add <E> to define what <E> is
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result;
    }

}
