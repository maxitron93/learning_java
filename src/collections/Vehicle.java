package collections;

public class Vehicle {

    String make;
    String model;
    int price;
    boolean fwd;

    public Vehicle(String make, String model, int price, boolean fwd) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fwd = fwd;
    }

    public String getString() {
        return String.format("Make: %s, Model: %s, Price: %d, FWD: %b", this.make, this.model, this.price, this.fwd);
    }


}
