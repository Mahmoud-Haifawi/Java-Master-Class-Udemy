package oop.Polymorphism.Examples;

public class runtimePolymorphismDynamicPolymorphism
{
    // ==========================================
// 2. RUNTIME POLYMORPHISM (Dynamic Polymorphism)
// ==========================================

    // Base class
    abstract static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        // Abstract method - must be overridden
        public abstract void makeSound();

        // Concrete method that can be overridden
        public void sleep() {
            System.out.println(name + " is sleeping...");
        }

        // Final method - cannot be overridden
        public final void breathe() {
            System.out.println(name + " is breathing...");
        }
    }

    // Derived classes
    static class Dog extends Animal {
        private String breed;

        public Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the " + breed + " says: Woof! Woof!");
        }

        @Override
        public void sleep() {
            System.out.println(name + " the dog is sleeping in his doghouse...");
        }

        // Dog-specific method
        public void wagTail() {
            System.out.println(name + " is wagging his tail!");
        }
    }

    static class Cat extends Animal {
        private boolean isIndoor;

        public Cat(String name, boolean isIndoor) {
            super(name);
            this.isIndoor = isIndoor;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the cat says: Meow! Meow!");
        }

        @Override
        public void sleep() {
            String location = isIndoor ? "on the couch" : "under a tree";
            System.out.println(name + " the cat is sleeping " + location + "...");
        }

        // Cat-specific method
        public void purr() {
            System.out.println(name + " is purring contentedly...");
        }
    }

    static class Bird extends Animal {
        private boolean canFly;

        public Bird(String name, boolean canFly) {
            super(name);
            this.canFly = canFly;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the bird says: Tweet! Tweet!");
        }

        public void fly() {
            if (canFly) {
                System.out.println(name + " is flying high in the sky!");
            } else {
                System.out.println(name + " cannot fly but is running fast!");
            }
        }
    }

}
