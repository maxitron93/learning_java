package objectOrientation;

// A class can only extend one class
// But a class can implement as many interfaces as it wants
public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age, String color, int numLegs, int beakLength, boolean featherless) {
        super(name, age, color, numLegs, beakLength, featherless);
    }

    // fly() must be implemented or the code won't compile, because it's implementing fly from the Flyable interface
    public void fly(int altitude) {
        System.out.println(this.name + " is now flying at an altitude of " + altitude + " meters...");
    }
}
