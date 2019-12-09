package java_basics;

public class ForLoops {

    public static void main(String[] args) {

        // String str = "HELLO THERE";
        // printForwards(str);
        // printBackwards(str);
        // printEvens();

        // nested loop
        for (int idx = 0; idx < 100; idx++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + ": " + idx); // Each value of idx gets printed out 10 times
            }
        }

    }

    public static void printForwards(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printBackwards(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printEvens() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

}
