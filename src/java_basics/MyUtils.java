package java_basics;

public class MyUtils {
    public static void printSomeJunk(String junk) {
        System.out.println("Here is some junk from MyUtils: " + junk);
    }

    public static void sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    // Returns an int
    public static int multiplyTwoNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result;
    }

    // Returns a string
    public static String sayGreeting(String name) {
        if (name == "Maxi") {
            return "Hello Maxi";
        } else {
            return "I don't know who you are.";
        }
    }

    public static int addTen(int num) {
        // Can invoke functions within the MyUtils class
        return multiplyTwoNumbers(2, 5) + num;
    }

    public static String checkWeather(int temp) {
        if (temp <= 16) {
            return "It's cold";
        } else if (temp <= 25) {
            return "It's nice";
        } else if (temp <= 32) {
            return "It's warm";
        } else {
            return "It's hot";
        }
    }
}

