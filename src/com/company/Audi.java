package com.company;

public class Audi extends Automatic_Car {
    private double speed;

    public Audi(String name, int year, String model, Colors colors, double speed) {
        super(name, year, model, colors);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void makeSound (String sound, int num){
        super.makeSound(sound, num);
    }
}
