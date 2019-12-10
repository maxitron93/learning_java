package collections;

import java.util.ArrayList;

// The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures.
// // Although referred to as a framework, it works in a manner of a library.
public class ArrayLists {

    public static void main(String[] args) {

        // Once created, the size of arrays in Java can't be changed
        // The size of ArrayLists can be changed as needed
        // Items of different data types can be added as needed
        ArrayList words = new ArrayList();
        words.add("First");
        words.add("Second");
        words.add(3);
        words.add(true);
        System.out.println(words);

        // Java is a type safe language, so the item needs to be cast to the correct data type when retrieving it
        // This is so type errors can be caught during compile time and not runtime
        String item1 = (String) words.get(0); // words.get(0) must be cast to String because it's return an Object
        System.out.println(item1);
        Object item2 = words.get(1); // No need to cast to String because words.get(1) will return an Object
        System.out.println(item2); // But this is a bad idea because certain operators and methods can't be applied to the Object data type
        Object item3 = (int) words.get(2);
        System.out.println(item3);

        // This is how to enforce a rule that only Strings can be added to the ArrayList
        // This is a generic collection i.e. parameterization
        ArrayList<String> sentences = new ArrayList<String>();
        sentences.add("Hello there how are you?");
        sentences.add("This is another sentence");
        sentences.add("10");
        String strItem = sentences.get(1); // No need to cast as string since the ArrayList<String> only accepts Strings
        System.out.println(strItem);

        // Iterating over an array list
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("bird");
        animals.add("dog");
        animals.add("frog");
        // old way
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        // for-each loop
        for(String animal : animals) {
            System.out.println(animal);
        }

    }

}
