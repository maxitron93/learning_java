package someOtherPackage;

public class ExampleClass {

    // An example method from another package that's called in java_basics.Methods
    public static String doSomething() {
        return "This is from another package";
    }

    // Also called in java_basics.Methods
    public static int divideNumbers(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
