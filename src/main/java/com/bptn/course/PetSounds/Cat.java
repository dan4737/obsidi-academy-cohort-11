package com.bptn.course.PetSounds;

public class Cat extends Pet {
    String animamltype;

    // constructor
    public Cat(String name){
        super(name);
        this.animamltype="Cat";
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}