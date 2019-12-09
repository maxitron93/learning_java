package java_basics;

public class VariablesContinued {

    public static void main(String[] args) {
        // int has a limited capacity
        int x = 999999999;
        System.out.println(x);

        // long has a bigger capacity than int
        // need to add L at the end so it's not considered an int
        // long uses more memory than int
        long bigNumber = 999999999999999999L;
        System.out.println(bigNumber);

        // short has a smaller capacity than int
        short smallNumber = 32000;
        System.out.println(smallNumber);

        // byte has a very small capacity. The maximum number is 127
        byte verySmallNumber = 127;
        System.out.println(verySmallNumber);

        // double is used for numbers with decimals
        double decimalNumber = 123.123;
        System.out.println(decimalNumber);

        // boolean
        boolean isTrue = true;
        boolean isMarried = false;

        // char - can only be a single character in quites
        // Can't use double quotation marks - must be single quotes
        char letter = 'm';
        System.out.println(letter);

    }


}
