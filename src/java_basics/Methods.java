package java_basics;
import someOtherPackage.ExampleClass;

public class Methods {

    public static void main(String[] args) {

        System.out.println("This is an argument to the prinln() method.");

        // Call the method here (method defined below)
        printSomeJunk("blah blah blah", 6);

        // Call the method here (method defined in MyUtils class)
        // No need to import MyUtils because it's in the same package (java_basics)
        MyUtils.printSomeJunk("foo bar");
        MyUtils.sumTwoNumbers(1, 10);
        System.out.println(MyUtils.multiplyTwoNumbers(7, 9));
        System.out.println(MyUtils.sayGreeting("Maxi"));
        System.out.println(MyUtils.sayGreeting("Ed"));
        System.out.println(MyUtils.addTen(100));
        System.out.println(MyUtils.checkWeather(28));

        // Create an instance and call the instance method
        MyUtils myVar = new MyUtils(); // Define the variable and assign a value to it
        myVar.sayName(); // sayName() is not available through MyUtils.sayName because it's an instance method (no 'static')

        // Call the method defined in another package (need to import above)
        System.out.println(ExampleClass.doSomething());
        System.out.println(ExampleClass.divideNumbers(100, 20));
    }

    // Method defined here
    public static void printSomeJunk(String junk, int num) {
        System.out.println("Here is some junk: " + junk);
        System.out.println("Here is a number: " + num);
    }

}
