package abstractClasses;

public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }

    // eat method from Animal that's specific to birds
    public void eat() {
        System.out.println(this.name + " is now eating worms...");
    }

    // move method from Animal that's specific to birds
    public void move(int distance) {
        System.out.println(this.name + " has flown " + distance + " meters");
    }
}
