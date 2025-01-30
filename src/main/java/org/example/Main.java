package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, "Red", 4.0f, "Diesel", "Nissan");
        car1.displayInfo();
        car1.honk();

        System.out.println();

        //testing the methods
        car1.setNumOfWheels(6);
        System.out.println(car1.getNumOfWheels());

        car1.setColor("Blue");
        System.out.println(car1.getColor());

        car1.setEngineSize(6.5f);
        System.out.println(car1.getEngineSize());

        car1.setFuelType("Regular");
        System.out.println(car1.getFuelType());
    }
}