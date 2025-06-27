package oop.Encapsualtion.Exmaples;

public class ImmutabilityPatterns {

    public final class PrinterConfig {
        private final boolean duplex;
        private final int maxTonerLevel;

        public PrinterConfig(boolean duplex, int maxTonerLevel) {
            this.duplex = duplex;
            this.maxTonerLevel = maxTonerLevel;
        }

        // Only getters, no setters
        public boolean isDuplex() { return duplex; }
        public int getMaxTonerLevel() { return maxTonerLevel; }
    }

}
