package com.company;

public class Main {

    public static void main(String[] args) {

        Automatic_Car objectA = new Automatic_Car("АУДИ", 2013, "автомат", Colors.BLACK_MATT);
        Audi objectB = new Audi("АУДИ", 2018, "TT", Colors.SILVER_GREY, 180.5);
        Audi objectC = new Audi("АУДИ", 2020, "А6", Colors.WHITE, 200.95);

        objectA.makeSound("BEEP", 3);
        objectA.getInfo();
        objectB.makeSound("BEEP", 2);
        objectB.getInfo();
        objectC.makeSound("BEEP", 1);
        objectC.getInfo();

    }
}
