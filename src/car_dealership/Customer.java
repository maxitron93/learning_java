package car_dealership;

public class Customer {

    String name;
    int cashOnHandInCents;
    int creditRating;

    public Customer(String name, int cashOnHandInCents, int creditRating) {
        this.name = name;
        this.cashOnHandInCents = cashOnHandInCents;
        this.creditRating = creditRating;
    }

    public void askForHelp() {
        System.out.println("Hi, I'm " + this.name + ". I'm looking for a car.");
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
        System.out.println("I want the " + vehicle.make + " " + vehicle.model + ".");
        if (finance) {
            System.out.println("The car will be purchased on finance");
        } else {
            System.out.println("The car will be purchased outright");
        }
    }
}
