package objectOrientation;

public class Earth {

    public static void main(String[] arg) {

        // create a new human object
        Human mark = new Human("Mark", 28, "Brown", 75);
        mark.speak();

        // create a new human object
        Human larry = new Human("Larry", 46, "Blue", 68);
        larry.speak();
        larry.walk();
        larry.work();

        // update the object's fields
        larry.age = 25;
        larry.eyeColor = "brown";
        larry.heightInInches = 65;
        larry.name = "Still Larry";
        larry.speak(); // check out the assigned values

    }

}
