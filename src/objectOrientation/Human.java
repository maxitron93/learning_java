package objectOrientation;

public class Human {

    // Defining fields of the Human class
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // Constructor method to allow the creation of objects with type Human
    // The constructor method must have the same name as the class
    // We don't need to explicitly define the constructor method. It's defined by default
    public Human(String name, int age, String eyeColor, int heightInInches) {
        // This is a variable in Java and it points to the class instance
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInInches = heightInInches;
    }

    // Defining instance methods
    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("And I have " + eyeColor + " eyes");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }

}
