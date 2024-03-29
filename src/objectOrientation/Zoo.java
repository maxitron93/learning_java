package objectOrientation;

public class Zoo {

    public static void main(String[] args) {
        Animal badger = new Animal ("Mr Badger", 45, "Brown", 4);
        Animal dog = new Animal ("Mr Doggo", 12, "Red", 4);

        badger.walk();
        dog.identify();
        dog.makeNoise();

        Bird parrot = new Bird("Mr Parrot", 26, "Rainbow", 2, 60, false);
        parrot.isFeatherless();
        parrot.identify();
//        parrot.fly(1000);

        Sparrow james = new Sparrow("Mr James", 3, "Green", 2, 45, false);
        james.fly(1000);

        Chicken chicken = new Chicken("Mr Chicken", 1, "White", 2, 12, false);
        chicken.fly();
    }

}
