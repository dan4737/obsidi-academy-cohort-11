package com.bptn.course.VehiclePackage;

public class ElectricBike extends Vehicle implements ElectricPowered {
    double batteryLevel = 75.0;
    public ElectricBike(String make, String model, int year, boolean isEngineOn) {
        super(make, model, year, isEngineOn);
    }

    @Override
    public void charge(double kwh) {
        System.out.println("Charging car");

    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
    }

    @Override
    public void drive() {
        System.out.println("Driving car");
    }
}
