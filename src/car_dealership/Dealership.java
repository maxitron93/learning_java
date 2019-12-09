package car_dealership;

public class Dealership {

    // Write a Program to simulate a car dealership sales process.
    // Employees sell vehicles to customers

    public static void main(String[] args) {
        Customer jake = new Customer("Jake", 500000, 75);
        Employee rob = new Employee("Rob");
        Vehicle first = new Vehicle(2010, "Honda", "Oddessey", 100000, "okay", 1000000);
        Vehicle second = new Vehicle(2015, "Mercedes", "S-Class", 2000, "great", 25000000);

        jake.askForHelp();
        rob.greetCustomer();
        rob.showVehicle(first);
        rob.showVehicle(second);
        jake.purchaseCar(second, rob, true);
        rob.runCreditCheck(second, jake);
        jake.purchaseCar(first, rob, true);
        rob.runCreditCheck(first, jake);
    }

}
