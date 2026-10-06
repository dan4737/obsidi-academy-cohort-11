package com.bptn.course.VehiclePackage;

import javax.xml.namespace.QName;

public abstract class Vehicle {
    String make;
    String model;
    int year;
    boolean isEngineOn;

    public Vehicle(String make, String model, int year, boolean isEngineOn) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayBasicInfo(){
        System.out.println("Vehicle :"+  make + " " + model + " " + year);
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();

//
//    Car myCar = new Car("Honda", "Civic", 2023,true);
//    myCar.


}
