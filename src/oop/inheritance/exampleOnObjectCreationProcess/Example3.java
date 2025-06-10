package oop.inheritance.exampleOnObjectCreationProcess;

public class Example3 {

    static class Outer {
        private int value = 10;

        class Inner {
            private int value = 20;

            void display() {
                System.out.println(this.value);        // 20 (Inner's value)
                System.out.println(Outer.this.value);  // 10 (Outer's value)
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
