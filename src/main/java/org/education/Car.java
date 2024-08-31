package org.education;

public class Car extends Vehicle {
    private String brand;

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Additional Methods
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + " liters");
        System.out.println("Fuel Type: " + getFuelType());
    }
}
