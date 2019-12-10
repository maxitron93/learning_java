package collections;

import java.util.ArrayList;

public class CustomCollections {

    public static void main(String[] args) {

        // We can create an ArrayList of Vehicle objects - this is a class we created on our own
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Vehicle car1 = new Vehicle("Honda", "Accord", 1200000, false);
        Vehicle car2 = new Vehicle("Mercedes", "S-Class", 35000000, true);
        Vehicle car3 = new Vehicle("BMW", "M3", 150000000, false);

        // Add vehicles to the collection
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getString());
        }


    }
}
