package com.company;

public class Automatic_Car extends Car {
    private String model;
    private Colors colors;

    public Automatic_Car(String name, int year, String model, Colors colors) {
        super(name, year);
        this.model = model;
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public Colors getColors() {
        return colors;
    }

    public void makeSound (String sound, int num){
        System.out.println(" Машина просигналила " +sound+" "+num+" раза");
    }

    public final void distance (int distance){
        System.out.println("Машина проехала "+distance+" км.");
    }

    public void getInfo(){
        System.out.println(" Модель: "+model+
                "\n Цвет: "+colors+
                "\n Название: "+super.getName()+
                "\n Год выпуска: "+super.getYear());
    }

}
