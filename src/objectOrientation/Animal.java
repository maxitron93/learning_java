package objectOrientation;

public class Animal {

    // Define the fields
    String name;
    int age;
    String color;
    int numLegs;

    // Define the constructor method
    public Animal(String name, int age, String color, int numLegs) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.numLegs = numLegs;
    }

    // Define instance methods
    public void walk() {
        System.out.println(name + " is walking...");
    }

    public void makeNoise() {
        System.out.println(name + " makes noises...");
    }

    public void identify() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("numLegs: " + numLegs);
    }

}
