package oop.stringsManipulation.StringBulider;

public class StringBuilderProfiler {
    // Scenario: Monitor StringBuilder performance in production
    public static class CapacityTracker {
        private final StringBuilder sb;
        private int resizeCount = 0;
        private int lastCapacity;

        public CapacityTracker(int initialCapacity) {
            this.sb = new StringBuilder(initialCapacity);
            this.lastCapacity = initialCapacity;
        }

        public CapacityTracker append(String str) {
            sb.append(str);
            if (sb.capacity() > lastCapacity) {
                resizeCount++;
                lastCapacity = sb.capacity();
                System.out.println("Resize #" + resizeCount +
                        " - New capacity: " + lastCapacity);
            }
            return this;
        }

        public String getStats() {
            return String.format("Length: %d, Capacity: %d, Resizes: %d, Efficiency: %.2f%%",
                    sb.length(), sb.capacity(), resizeCount,
                    (sb.length() * 100.0) / sb.capacity());
        }
    }
}
