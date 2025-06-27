package oop.Polymorphism.Examples;

public class PolymorphismDemo {

    public static void main(String[] args) {
        System.out.println("=== JAVA POLYMORPHISM DEMONSTRATION ===\n");

        // 1. COMPILE-TIME POLYMORPHISM
        System.out.println("1. COMPILE-TIME POLYMORPHISM (Method Overloading):");
        System.out.println("-".repeat(50));

        MethodOverloading.Calculator calc = new MethodOverloading.Calculator();
        calc.add(5, 3);
        calc.add(2.5, 3.7);
        calc.add(1, 2, 3);
        calc.add("Hello", " World");

        System.out.println("\nConstructor Overloading:");
        MethodOverloading.Employee emp1 = new MethodOverloading.Employee();
        MethodOverloading.Employee emp2 = new MethodOverloading.Employee("John Doe");
        MethodOverloading.Employee emp3 = new MethodOverloading.Employee("Jane Smith", 101);
        MethodOverloading. Employee emp4 = new MethodOverloading.Employee("Bob Johnson", 102, 75000.0);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();

        // 2. RUNTIME POLYMORPHISM
        System.out.println("\n2. RUNTIME POLYMORPHISM (Method Overriding):");
        System.out.println("-".repeat(50));

        // Polymorphic array
        runtimePolymorphismDynamicPolymorphism.Animal[] animals = {
                new runtimePolymorphismDynamicPolymorphism.Dog("Buddy", "Golden Retriever"),
                new runtimePolymorphismDynamicPolymorphism.Cat("Whiskers", true),
                new runtimePolymorphismDynamicPolymorphism.Bird("Tweety", true),
                new runtimePolymorphismDynamicPolymorphism.Bird("Penguin", false)
        };

        // Polymorphic behavior - same method call, different implementations
        for (runtimePolymorphismDynamicPolymorphism.Animal animal : animals) {
            animal.makeSound(); // Calls overridden method
            animal.sleep();     // Calls overridden method
            animal.breathe();   // Calls final method from base class
            System.out.println();
        }

        // Downcasting example
        System.out.println("Downcasting Example:");
        runtimePolymorphismDynamicPolymorphism. Animal myDog = new runtimePolymorphismDynamicPolymorphism.Dog("Rex", "German Shepherd");
        myDog.makeSound(); // Polymorphic call

        if (myDog instanceof runtimePolymorphismDynamicPolymorphism.Dog) {
            runtimePolymorphismDynamicPolymorphism.Dog actualDog = (runtimePolymorphismDynamicPolymorphism.Dog) myDog; // Downcasting
            actualDog.wagTail(); // Dog-specific method
        }

        // 3. INTERFACE-BASED POLYMORPHISM
        System.out.println("\n3. INTERFACE-BASED POLYMORPHISM:");
        System.out.println("-".repeat(50));

        // Polymorphic array of interfaces
        interfaceBasedPolymorphism.Drawable[] drawables = {
                new interfaceBasedPolymorphism.Circle(5.0),
                new interfaceBasedPolymorphism.Rectangle(4.0, 6.0)
        };

        for (interfaceBasedPolymorphism.Drawable drawable : drawables) {
            drawable.draw();    // Polymorphic call
            drawable.display(); // Default method call

            if (drawable instanceof interfaceBasedPolymorphism.Colorable) {
                interfaceBasedPolymorphism.Colorable colorable = (interfaceBasedPolymorphism.Colorable) drawable;
                colorable.setColor("Red");
                drawable.draw(); // Draw with new color
            }
            System.out.println();
        }

        // 4. PARAMETRIC POLYMORPHISM (Generics)
        System.out.println("4. PARAMETRIC POLYMORPHISM (Generics):");
        System.out.println("-".repeat(50));

        // Generic class usage
        parametricPolymorphismGenerics.Box<String> stringBox = new parametricPolymorphismGenerics.Box<>();
        stringBox.setContent("Hello, Generics!");
        stringBox.displayContent();

        parametricPolymorphismGenerics.Box<Integer> intBox = new parametricPolymorphismGenerics.Box<>();
        intBox.setContent(42);
        intBox.displayContent();

        parametricPolymorphismGenerics.Box<Double> doubleBox = new parametricPolymorphismGenerics.Box<>();
        doubleBox.setContent(3.14159);
        doubleBox.displayContent();

        // Generic method usage
        System.out.println("\nGeneric Methods:");
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Before swap: " + java.util.Arrays.toString(names));
        parametricPolymorphismGenerics.Utility.swap(names, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(names));

        Integer[] numbers = {1, 2, 3, 4, 5};
        double sum = parametricPolymorphismGenerics.Utility.sum(numbers);
        System.out.println("Sum of integers: " + sum);

        Double[] decimals = {1.5, 2.5, 3.5};
        double decimalSum = parametricPolymorphismGenerics.Utility.sum(decimals);
        System.out.println("Sum of doubles: " + decimalSum);

        System.out.println("\n=== POLYMORPHISM DEMONSTRATION COMPLETE ===");
    }
}