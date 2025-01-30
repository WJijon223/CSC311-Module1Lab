package org.example;

public class Car extends Vehicle {
    private String brand;

    Car(int numOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(color, numOfWheels, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println(
                "Car Information: \n"
                + "Number of wheels: " + getNumOfWheels() + "\n"
                + "Color: " + getColor() + "\n"
                + "Engine Size: " + getEngineSize() + "\n"
                + "Fuel Type: " + getFuelType() + "\n"
                + "Brand: " + this.brand
        );
    }

}
