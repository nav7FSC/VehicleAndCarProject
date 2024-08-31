package org.education;

// Vehicle class representing a generic vehicle
public class Vehicle {
    // Attributes of the vehicle
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Constructor to initialize all attributes
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    // Getter for numberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // Setter for numberOfWheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for engineSize
    public float getEngineSize() {
        return engineSize;
    }

    // Setter for engineSize
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    // Getter for fuelType
    public String getFuelType() {
        return fuelType;
    }

    // Setter for fuelType
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
