package oop.Polymorphism.Examples;

public class interfaceBasedPolymorphism {
// ==========================================
// 3. INTERFACE-BASED POLYMORPHISM
// ==========================================

    interface Drawable {
        void draw();
        default void display() {
            System.out.println("Displaying the drawable object...");
        }
    }

    interface Colorable {
        void setColor(String color);
        String getColor();
    }

    // Multiple interface implementation
    static class Circle implements Drawable, Colorable {
        private double radius;
        private String color;

        public Circle(double radius) {
            this.radius = radius;
            this.color = "Black"; // default color
        }

        @Override
        public void draw() {
            System.out.println("Drawing a " + color + " circle with radius " + radius);
        }

        @Override
        public void setColor(String color) {
            this.color = color;
            System.out.println("Circle color changed to " + color);
        }

        @Override
        public String getColor() {
            return color;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Drawable, Colorable {
        private double width, height;
        private String color;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
            this.color = "Black"; // default color
        }

        @Override
        public void draw() {
            System.out.println("Drawing a " + color + " rectangle " + width + "x" + height);
        }

        @Override
        public void setColor(String color) {
            this.color = color;
            System.out.println("Rectangle color changed to " + color);
        }

        @Override
        public String getColor() {
            return color;
        }

        public double getArea() {
            return width * height;
        }
    }

}
