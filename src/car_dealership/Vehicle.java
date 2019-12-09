package car_dealership;

public class Vehicle {

    int year;
    String make;
    String model;
    int miles;
    String condition;
    int priceInCents;

    public Vehicle (int year, String make, String model, int miles, String condition, int priceInCents) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.condition = condition;
        this.priceInCents = priceInCents;
    }

}
