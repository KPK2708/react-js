package com.wipro.java.microservices.i;


public class TestISP {
    public static void main(String[] args) {
        Car myCar = new Car("TN-07-1234");

        Parking freeLot = new FeeParkingLot();
        freeLot.parkCar(myCar);
        freeLot.unparkCar(myCar);

        PaidParkingLot paidLot = new PaidParkingLot();
        paidLot.parkCar(myCar);
        double fee = paidLot.calculateFee(myCar, 3);
        paidLot.processPayment(myCar, fee);
        paidLot.unparkCar(myCar);
    }
}