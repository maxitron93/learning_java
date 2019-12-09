package abstractClasses;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    // eat method from Animal that's specific to dogs
    public void eat() {
        System.out.println(this.name + " is now eating dog food...");
    }

    // move method from Animal that's specific to dogs
    public void move(int distance) {
        System.out.println(this.name + " has walked " + distance + " meters");
    }
}
