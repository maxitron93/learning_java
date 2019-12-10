package generics;

// Generics allow each class to be flexible enough to accept any data type as input, while still providing type safety

// Using angle brackets makes this a generic class
// We can can add anything as item 1 and item 2
public class Container<i1, i2> {

    i1 item1;
    i2 item2;

    public Container(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Contents of container: ");
        System.out.println(this.item1);
        System.out.println(this.item2);
    }
}
