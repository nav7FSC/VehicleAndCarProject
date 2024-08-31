package org.education;

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle(4, "Red", 2.0f, "Petrol");
        System.out.println("Vehicle Details:");
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize() + " liters");
        System.out.println("Fuel Type: " + vehicle.getFuelType());

        // Create a Car object
        Car car = new Car(4, "Blue", 2.5f, "Diesel", "Toyota");
        car.honk();
        car.displayInfo();
    }
}
