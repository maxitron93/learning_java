package java_basics;

public class WhileLoops {
    public static void main(String[] args) {

        // printHello();

        String inputStr = "We have a large inventory of things in our warehouse falling in "
                + "the category:apparel and the slightly "
                + "more in demand category:makeup along with the category:furniture and ...";
        printCategories(inputStr);

    }

    public static void printHello() {
        int count = 1;
        while(count <= 100){
            System.out.println(count + ": hello");
            count++;
            // can us break to break out of the loop early
            if (count == 30) {
                break;
            }
        }
    }

    // Create a method that will print the categories from the input string
    public static void printCategories(String str) {
        int strPosition = 0;

        while (strPosition < str.length()) {

            // Look for ':' char
            if (str.charAt(strPosition) == ':') {

                // When found, the category start index is that index + 1
                int startIndex = strPosition + 1;

                // Look for when the category word ends by looking for the next ' '
                int endIndex = str.indexOf(' ', strPosition);

                // Print the category
                System.out.println(str.substring(startIndex, endIndex));

                // Change the value of strPosition
                strPosition = endIndex;

            } else {
                strPosition++;
            }
        }
    }

}
