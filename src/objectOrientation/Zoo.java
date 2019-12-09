package objectOrientation;

public class Zoo {

    public static void main(String[] args) {
        Animal badger = new Animal ("Mr Badger", 45, "Brown", 4);
        Animal dog = new Animal ("Mr Doggo", 12, "Red", 4);

        badger.walk();
        dog.identify();
        dog.makeNoise();
    }

}
