package com.bptn.course.VehiclePackage;

public class Car extends Vehicle implements FuelConsuming {
    double fuelLevel = 50.0;

    public Car(String make, String model, int year, boolean isEngineOn) {
        super(make, model, year, isEngineOn);
    }

    @Override
    public void refuel(double litres) {
        System.out.println("Refueling " + litres + " litres");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void startEngine() {
        if (!isEngineOn) {
            System.out.println("Starting engine on");
            isEngineOn = true;
        }
        System.out.println("Starting car");

    }

    @Override
    public void stopEngine() {
        if(isEngineOn){
            System.out.println("car is moving");
            isEngineOn = false;
        }
    }

    @Override
    public void drive() {
        System.out.println("Driving car");
    }
}



