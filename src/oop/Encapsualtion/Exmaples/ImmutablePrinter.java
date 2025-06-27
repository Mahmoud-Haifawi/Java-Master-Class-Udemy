package oop.Encapsualtion.Exmaples;
//Q: "How would you make the Printer class immutable while maintaining its functionality?"
public final class ImmutablePrinter {
    private final int tonerLevel;
    private final int pagesPrinted;
    private final boolean duplex;

    // Constructor to initialize all fields
    public ImmutablePrinter(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            throw new IllegalArgumentException("Toner level must be between 0 and 100");
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    // Getter methods
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    // Immutable "modification" methods that return new instances
    public ImmutablePrinter addToner(int amount) {
        int newLevel = this.tonerLevel + amount;
        if (newLevel > 100 || newLevel < 0) {
            throw new IllegalArgumentException("Invalid toner level");
        }
        return new ImmutablePrinter(newLevel, this.pagesPrinted, this.duplex);
    }

    public ImmutablePrinter printPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages to print must be positive");
        }
        int jobPages = duplex ? (pages / 2 + pages % 2) : pages;
        return new ImmutablePrinter(this.tonerLevel,
                this.pagesPrinted + jobPages,
                this.duplex);
    }
}
