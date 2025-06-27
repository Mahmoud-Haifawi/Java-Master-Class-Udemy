package oop.Polymorphism.Examples;

public class parametricPolymorphismGenerics
{
    // ==========================================
// 4. PARAMETRIC POLYMORPHISM (Generics)
// ==========================================

    // Generic class
    static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
            System.out.println("Box now contains: " + content);
        }

        public T getContent() {
            return content;
        }

        public void displayContent() {
            System.out.println("Box contains: " + content + " (Type: " +
                    (content != null ? content.getClass().getSimpleName() : "null") + ")");
        }
    }

    // Generic method example
    class Utility {
        // Generic method that works with any type
        public static <T> void swap(T[] array, int i, int j) {
            if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.println("Swapped elements at positions " + i + " and " + j);
            }
        }

        // Bounded generic method
        public static <T extends Number> double sum(T[] numbers) {
            double total = 0.0;
            for (T number : numbers) {
                total += number.doubleValue();
            }
            return total;
        }
    }
}
