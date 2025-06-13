package oop.stringsManipulation.StringBulider;

import java.util.ArrayList;
import java.util.List;

// Missing from lecture: Best practices for memory efficiency
public class StringBuilderOptimization {

    // Bad: Unknown final size
    public String buildLargeString(List<String> items) {
        StringBuilder sb = new StringBuilder(); // Will resize multiple times
        for (String item : items) {
            sb.append(item).append(",");
        }
        return sb.toString();
    }

    // Good: Pre-calculate approximate size
    public String buildLargeStringOptimized(List<String> items) {
        int estimatedSize = items.size() * 20; // Estimate average item length
        StringBuilder sb = new StringBuilder(estimatedSize);
        for (String item : items) {
            sb.append(item).append(",");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderOptimization optimizer = new StringBuilderOptimization();

        // 🔧 Create a large dataset
        int itemCount = 1_000_000;
        List<String> items = new ArrayList<>(itemCount);
        for (int i = 0; i < itemCount; i++) {
            items.add("item" + i);
        }

        // ⚙️ Benchmark - Non-optimized
        System.gc(); // Suggest GC before measuring
        long memBefore1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long start1 = System.nanoTime();
        String result1 = optimizer.buildLargeString(items);
        long duration1 = System.nanoTime() - start1;
        long memAfter1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // ⚙️ Benchmark - Optimized
        System.gc(); // Suggest GC again before next test
        long memBefore2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long start2 = System.nanoTime();
        String result2 = optimizer.buildLargeStringOptimized(items);
        long duration2 = System.nanoTime() - start2;
        long memAfter2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // ✅ Output Results
        System.out.println("Naive build time (ms): " + (duration1 / 1_000_000));
        System.out.println("Naive memory used (MB): " + ((memAfter1 - memBefore1) / (1024 * 1024)));

        System.out.println("Optimized build time (ms): " + (duration2 / 1_000_000));
        System.out.println("Optimized memory used (MB): " + ((memAfter2 - memBefore2) / (1024 * 1024)));

        // ⚠️ Optional: Confirm equality
        System.out.println("Results equal: " + result1.equals(result2));
    }

}
