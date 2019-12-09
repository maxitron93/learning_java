package java_basics;

public class Arrays {

    public static void main(String[] args) {

        // Defining an array of size 100 elements
        // The data type is integer array (int []), so only integers can be stored
        int [] values = new int[100];

        // Assigning values to the array
        values[0] = 1000; // Assigning value 1000 to position 0 in the array
        values[99] = 9999; // Assigning value 9999 to position 99 in the array

        // Print out the values
        System.out.println(values);
        System.out.println(values[0]);
        System.out.println(values[1]); // Default value is 0 when no value has been explicitly assigned


        // Defining an array of size 3 elements
        // The data type is string array (String [])
        // Array is initialized automatically with the values
        String [] words = new String[] {"My", "Name", "Is"};
        System.out.println(words[0]);
        words[2] = "Replacement"; // Replacing a value
        System.out.println(words[2]);
        // words[3] = "Can't be done"; // The size of the array is 3
    }

}
