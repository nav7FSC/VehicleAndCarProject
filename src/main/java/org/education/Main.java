package org.education;

// Main class to test the Vehicle and Car classes
public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object to display its details
        Vehicle vehicle = new Vehicle(4, "Red", 2.0f, "Petrol");
        System.out.println("Vehicle Details:");
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize() + " liters");
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println();

        // Creating a Car object to represent a Ford, honk the horn, and displaying its details
        Car car1 = new Car(4, "Blue", 3.5f, "Petrol", "Ford");
        car1.honk();
        car1.displayInfo();
        System.out.println();

        // Creating a Car object to represent a Chevrolet, honk the horn, and displaying its details
        Car car2 = new Car(4, "Black", 2.0f, "Diesel", "Chevrolet");
        car2.honk();
        car2.displayInfo();
        System.out.println();

        // Creating a Car object to represent a Tesla, honk the horn, and displaying its details
        Car car3 = new Car(4, "White", 0.0f, "Electric", "Tesla");
        car3.honk();
        car3.displayInfo();
        System.out.println();
    }
}

