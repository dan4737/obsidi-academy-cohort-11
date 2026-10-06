package com.bptn.course.VehicleTeam;

public class Bike extends Vehicle {
    String bikeHandle;

    public Bike(String Color, String Brand, String bikeHandle) {
        super(Color, Brand);
        this.bikeHandle = bikeHandle;
    }

    public void print() {
        super.print();
        System.out.println("this is the " + bikeHandle);
    }
}
