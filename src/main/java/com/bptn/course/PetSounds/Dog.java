package com.bptn.course.PetSounds;

public class Dog extends Pet {
    String animamltype;

    // constructor
    public Dog(String name){
        super(name);
        this.animamltype="Dog";
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
