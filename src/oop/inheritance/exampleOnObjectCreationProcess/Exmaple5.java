package oop.inheritance.exampleOnObjectCreationProcess;

public class Exmaple5 {
    class Vehicle {
        protected String brand;
        protected int year;

        Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
    }
// bad exmaple
 /*
**Answer:** Multiple issues:

1. First constructor doesn't call `super()` - compiler will insert `super()` but Vehicle has no no-arg constructor
2. Second constructor bypasses parent constructor logic
*
*
    class Car extends Vehicle {
        private int doors;

        Car() {
            doors = 4; // Problem: super() not called explicitly
        }

        Car(String brand, int year, int doors) {
            this.brand = brand; // Problem: should use super()
            this.year = year;
            this.doors = doors;
        }
    }
    */

    //fixed version
    class Car extends Vehicle {
        private int doors;

        Car() {
            super("Unknown", 0); // or this("Unknown", 0, 4);
            doors = 4;
        }

        Car(String brand, int year, int doors) {
            super(brand, year); // Use parent constructor
            this.doors = doors;
        }
    }


}
