package string_class;

public class Strings {

    public static void main(String[] args) {
        String str = "ABCDEFG";
        System.out.println(str.length()); // length of a string
        System.out.println(str.substring(0,1)); // Print subset from 0 to 1 (not including 1)
        System.out.println(str.substring(3,6)); // Print subset from 3 to 6 (not including 6)

        String a = "hello";
        String b = "hello";
        if (a == b) {
            System.out.println("This is not how to do it, even if this works");
        }

        if (a.equals(b)) {
            System.out.println("This is the correct way to compare strings");
        }

        if (b.equalsIgnoreCase("HELLO")) {
            System.out.println("This is how to ignore capitals when comparing strings");
        }

        System.out.println(a.charAt(1)); // get the char at position 1
        System.out.println(a.charAt(4)); // get the char at position 4

        System.out.println(a.indexOf('e')); // get the position of char 'e' in the string
        System.out.println(a.indexOf('l')); // get the position of char 'l', searching from left to right
        System.out.println(a.indexOf("lo")); // get the index of where the 'lo' substring starts

        System.out.println(a.lastIndexOf('l')); // get the position of char 'l', searching from right to left

    }

}
