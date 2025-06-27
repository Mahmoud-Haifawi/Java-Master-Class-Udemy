package oop.Encapsualtion.Exmaples;

public class ThreadSafePrinter {
    private final Object lock = new Object();
    private volatile int tonerLevel;

    public int addToner(int amount) {
        synchronized(lock) {
            // Atomic toner level update
            int newLevel = this.tonerLevel + amount;
            if (newLevel > 100 || newLevel < 0) return -1;
            this.tonerLevel = newLevel;
            return this.tonerLevel;
        }
    }
}
