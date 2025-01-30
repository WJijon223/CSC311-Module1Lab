package org.example;

public class Vehicle {
    private String color;
    private int numOfWheels;
    private float engineSize;
    private String fuelType;

    Vehicle(String color, int numOfWheels, float engineSize, String fuelType) {
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    //numOfWheels setters and getters
    public int getNumOfWheels() {
        return numOfWheels;
    }
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    //color setters and getters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //engineSize setters and getters
    public float getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    //fuelType setters and getters
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
