package java_basics;

public class Methods {

    public static void main(String[] args) {

        System.out.println("This is an argument to the prinln() method.");

        // Call the method here (method defined below)
        printSomeJunk("blah blah blah", 6);

        // Call the method here (method defined in MyUtils class)
        MyUtils.printSomeJunk("foo bar");
        MyUtils.sumTwoNumbers(1, 10);
        System.out.println(MyUtils.multiplyTwoNumbers(7, 9));
        System.out.println(MyUtils.sayGreeting("Maxi"));
        System.out.println(MyUtils.sayGreeting("Ed"));
        System.out.println(MyUtils.addTen(100));
        System.out.println(MyUtils.checkWeather(28));
    }

    // Method defined here
    public static void printSomeJunk(String junk, int num) {
        System.out.println("Here is some junk: " + junk);
        System.out.println("Here is a number: " + num);
    }

}
