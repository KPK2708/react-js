package com.wipro.java.microservices.i;

import java.util.HashSet;
import java.util.Set;

public class FeeParkingLot implements Parking {
    private Set<Car> parkedCars = new HashSet<>();

    public void parkCar(Car car) {
        parkedCars.add(car);
        System.out.println("Car " + car.getLicensePlate() + " parked for free.");
    }

    public void unparkCar(Car car) {
        parkedCars.remove(car);
        System.out.println("Car " + car.getLicensePlate() + " unparked.");
    }
}