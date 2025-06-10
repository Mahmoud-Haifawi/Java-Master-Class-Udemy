package oop.inheritance.exampleOnObjectCreationProcess;

public class Exmaple4 {
    // Scenario 1: Instance method
    class Parent {
        public void display() { System.out.println("Parent instance"); }
    }
    class Child extends Parent {
        public void display() {
            super.display(); // What does this call?
            System.out.println("Child instance");
        }
    }

    // Scenario 2: Static method
    class Parent2 {
        public static void show() { System.out.println("Parent static"); }
    }
    class Child2 extends Parent2 {
        public static void show() {
            // super.show(); // Compile error! Why?
            Parent2.show(); // Must use class name
            System.out.println("Child static");
        }
    }
//**Answer:**
//
//            - **Scenario 1:** `super.display()` calls the parent's instance method (method overriding)
//            - **Scenario 2:** `super` cannot be used with static methods because static methods are not inherited, they are hidden. Static methods belong to the class, not instances.
}
