package oop.Polymorphism.Challange1;
// Base Car class
public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Starting Engine");
    }

    protected void runEngine() {
        System.out.println("Car -> Running Engine");
    }

    public void drive() {
        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

