package com.bptn.course.VehicleTeam;

public class Vehicle {
    String color;
    String brand;

    //constructor
    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void print() {
        System.out.println(this.color + " " + this.brand);
    }
}
