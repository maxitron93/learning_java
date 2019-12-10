package collections;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // First, identify the data type for the Key, then the data type for the Value
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("First Key", "First Value");
        dict.put("Second Key", "Second Value");
        dict.put("Third Key", "Third Value");
        dict.put("First Key", "Overridden Value"); // This will override the value for "First Key"

        String firstValue = dict.get("First Key"); // Get the value from the key
        System.out.println(firstValue);

        // Iterate over the keys of a dictionary
        for (String key : dict.keySet()) {
            // Won't be printed in order, unless it's a Linked Hash Map
            // (Just like the difference between HashSet and LinkedHasSet)
            System.out.println(dict.get(key));
        }

    }

}
