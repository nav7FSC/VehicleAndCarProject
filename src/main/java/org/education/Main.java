package org.education;

// Main class to test the Vehicle and Car classes
public class Main {
    public static void main(String[] args) {
        // Creating a Car object with specified attributes
        Car car = new Car(4, "Yellow", 2.5f, "Petrol", "Volvo");

        // Simulate the car honking
        car.honk();

        // Display the details of the car
        car.displayInfo();
    }
}
