package org.education;

// Car class extending Vehicle, representing a specific type of vehicle
public class Car extends Vehicle {
    // Additional attribute for Car
    private String brand;

    // Constructor to initialize all attributes including those from Vehicle
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to simulate the car honking
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + " liters");
        System.out.println("Fuel Type: " + getFuelType());
    }
}
