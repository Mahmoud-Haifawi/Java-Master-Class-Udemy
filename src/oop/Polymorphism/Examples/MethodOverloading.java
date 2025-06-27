package oop.Polymorphism.Examples;

public class MethodOverloading {
// ==========================================
// 1. COMPILE-TIME POLYMORPHISM (Static Polymorphism)
// ==========================================

    // Method Overloading Example
    public static class Calculator {
        // Same method name, different parameters
        public int add(int a, int b) {
            System.out.println("Adding two integers: " + a + " + " + b);
            return a + b;
        }

        public double add(double a, double b) {
            System.out.println("Adding two doubles: " + a + " + " + b);
            return a + b;
        }

        public int add(int a, int b, int c) {
            System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
            return a + b + c;
        }

        public String add(String a, String b) {
            System.out.println("Concatenating strings: " + a + " + " + b);
            return a + b;
        }
    }

    // Constructor Overloading Example
   public static class Employee {
        private String name;
        private int id;
        private double salary;

        // Default constructor
        public Employee() {
            this.name = "Unknown";
            this.id = 0;
            this.salary = 0.0;
            System.out.println("Default constructor called");
        }

        // Constructor with name only
        public Employee(String name) {
            this.name = name;
            this.id = 0;
            this.salary = 0.0;
            System.out.println("Constructor with name called: " + name);
        }

        // Constructor with name and id
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
            this.salary = 0.0;
            System.out.println("Constructor with name and id called: " + name + ", " + id);
        }

        // Constructor with all parameters
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
            System.out.println("Full constructor called: " + name + ", " + id + ", " + salary);
        }

        public void displayInfo() {
            System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
        }
    }


}
