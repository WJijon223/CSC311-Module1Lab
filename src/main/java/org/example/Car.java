package org.example;

public class Car extends Vehicle {
    private String brand;

    Car(int numOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
}
