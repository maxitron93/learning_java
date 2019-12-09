package abstractClasses;

// This is now an abstract class
// Abstract classes cannot be instantiated. They can only be inherited.
public abstract class Animal {

    // Define the fields
    String name;
    int age;

    // Define the constructor method
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Define instance methods
    public void sleep() {
        System.out.println(this.name + " is now sleeping...");
    }

    // These are abstract methods
    // The body of these methods are not defined here
    // They must be defined in every class that inherits from this Animal class
    public abstract void eat();
    public abstract void move(int distance);

}
