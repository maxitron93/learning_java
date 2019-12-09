package car_dealership;

public class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void greetCustomer() {
        System.out.println("Hi, my name is " + this.name + ". Let me show you what we've got!");
    }

    public void showVehicle(Vehicle vehicle) {
        System.out.println("This is a " + vehicle.year + " " + vehicle.make + " " + vehicle.model + "." );
        System.out.println("It has done " + vehicle.miles + " miles and it's in " + vehicle.condition + " condition.");
        System.out.println("You can have it for $" + (vehicle.priceInCents / 100));
    }

    public void runCreditCheck(Vehicle vehicle, Customer customer) {
        double financeNeeded = (vehicle.priceInCents - customer.cashOnHandInCents) / 100;
        System.out.println("You need to borrow $" + financeNeeded + ".");
        if (customer.creditRating >= financeNeeded / 500) {
            System.out.println("That should be fine.");
        } else {
            System.out.println("Sorry, your credit is not good enough for that.");
        }
    }

}
