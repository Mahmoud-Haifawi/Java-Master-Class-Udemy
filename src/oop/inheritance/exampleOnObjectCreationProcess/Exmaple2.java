package oop.inheritance.exampleOnObjectCreationProcess;

public class Exmaple2 {
    public static class Animal {
        public void makeSound() {
            System.out.println("Animal sound");
        }

        public void move() {
            System.out.println("Animal moves");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            super.makeSound(); // Calls Animal's version
            System.out.println("Woof!");
        }

        public void bark() {
            makeSound(); // Calls Dog's version (polymorphic)
            super.makeSound(); // Calls Animal's version (explicit)
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println("-----------------");
        dog.bark();
        System.out.println("------------");
        dog.move();

    }
}
