package objectOrientation;

// This Bird class will inherit behaviour from the Animal class
// The Animal class is the parent and the Bird class is the child
public class Bird extends Animal {

    int beakLength;
    boolean featherless;

    // When a class inherits from another class, the default constructor class doesn't apply
    // We need to define a constructor that's similar to the constructor of the Animal class
    public Bird(String name, int age, String color, int numLegs, int beakLength, boolean featherless) {
        // The super method calls the constructor method of the super class (parent)
        super(name, age, color, numLegs);
        this.beakLength = beakLength;
        this.featherless = featherless;
    }

    public void isFeatherless() {
        if (this.featherless) {
            System.out.println("Yes, this bird is featherless");
        } else {
            System.out.println("No, this bird has feathers");
        }
    }

    // fly() is commented out because it's being implemented in the Flyable interface
//    public void fly(int altitude) {
//        System.out.println(this.name + " is now flying at an altitude of " + altitude + " meters...");
//    }
}
