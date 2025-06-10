package oop.inheritance.exampleOnObjectCreationProcess;

public class Example1 {
    static class Parent {
        static {
            System.out.println("Parent static block");
        }

        {
            System.out.println("Parent instance block");
        }

        Parent() {
            System.out.println("Parent constructor");
        }
    }

    static class Child extends Parent {
        static {
            System.out.println("Child static block");
        }

        {
            System.out.println("Child instance block");
        }

        Child() {
            System.out.println("Child constructor");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();

    }


// Output when creating new Child():
// Parent static block
// Child static block
// Parent instance block
// Parent constructor
// Child instance block
// Child constructor

}
