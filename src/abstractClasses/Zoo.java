package abstractClasses;

public class Zoo {

    public static void main(String[] args) {

        // The variable type is Animal, but the object type is Bird/Dog
        // This allows us to pass it into methods that only accept Animals and arguments (below)
        Animal sparrow = new Bird("Mr Sparrow", 21);
        Animal dog = new Dog("Mr Doggo", 5);

        // Testing methods
        sparrow.sleep(); // Instance method from Animal class
        sparrow.move(100); // Abstract method move() from Animal class
        sparrow.eat(); // Abstract method eat() from Animal class
        dog.sleep();
        dog.move(200);
        dog.eat();

        // Passing a dog object into a method that only accepts Animal variable types
        feedAnimals(dog);
        feedAnimals(sparrow);
    }

    public static void feedAnimals(Animal animal) {
        animal.eat();
    }
}
