package com.company;

public class Main {

    public static void main(String[] args) {

        Automatic_Car objectA = new Automatic_Car("АУДИ", 2013, "автомат", Colors.BLACK_MATT);
        Audi objectB = new Audi("АУДИ", 2018, "TT", Colors.SILVER_GREY, 180.5);
        Audi objectC = new Audi("АУДИ", 2020, "А6", Colors.WHITE, 200.95);

        objectA.makeSound("BEEP", 3);
        objectA.getInfo();
        objectB.makeSound(3);
        objectB.getInfo();
        objectC.distance(300);
        objectC.getInfo();
        objectC.distance(150.5, 200);
        objectC.getInfo();

    }
}
