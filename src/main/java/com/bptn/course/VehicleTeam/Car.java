package com.bptn.course.VehicleTeam;

public class Car extends Vehicle {
    String steeringWheel;

    public Car(String Color, String Brand, String steeringWheel) {
        super(Color, Brand);
    }

    public void print() {
        super.print();
        System.out.println("this is the " + steeringWheel);
    }

}
