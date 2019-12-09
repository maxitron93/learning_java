package objectOrientation;

public class Chicken extends Bird {
    public Chicken(String name, int age, String color, int numLegs, int beakLength, boolean featherless) {
        super(name, age, color, numLegs, beakLength, featherless);
    }

    // Overriding the fly method in the Bird parent class (because chickens can't fly)
    // This is one way of removing irrelevant methods
    // A different way is using an interface
    // We can comment this out out because we've removed fly from the Bird class - moved it to the Flyable interface instead.
    public void fly() {
        System.out.println("Chickens cannot fly");
    }
}
