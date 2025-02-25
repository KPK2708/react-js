package com.wipro.java.microservices.i;

import java.util.HashSet;
import java.util.Set;

public class PaidParkingLot implements Parking, ParkingFee {
    private Set<Car> parkedCars = new HashSet<>();
    private double ratePerHour = 10.0;

    public void parkCar(Car car) {
        parkedCars.add(car);
        System.out.println("Car " + car.getLicensePlate() + " parked.");
    }

    public void unparkCar(Car car) {
        parkedCars.remove(car);
        System.out.println("Car " + car.getLicensePlate() + " unparked.");
    }

    public double calculateFee(Car car, int hours) {
        return hours * ratePerHour;
    }

    public void processPayment(Car car, double amount) {
        System.out.println("Payment of $" + amount + " received for car " + car.getLicensePlate());
    }
}