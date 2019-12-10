package collections;

import java.util.LinkedList;

// The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures.
// // Although referred to as a framework, it works in a manner of a library.

public class LinkedLists {

    public static void main(String[] args) {

        // Only reference data types can be used
        // Integer has to be used instead of int because int is a primitive data type
        // Integer is a wrapper class that wraps around the primitive int data type
        // Another example is Float (for the primitive float)
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(300);
        System.out.println(numbers);

        // For each loop
        for (int number: numbers) {
            System.out.println(number);
        }

    }

}
