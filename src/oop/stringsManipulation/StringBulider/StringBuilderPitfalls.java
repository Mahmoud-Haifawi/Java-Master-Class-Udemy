package oop.stringsManipulation.StringBulider;

import java.util.List;

public class StringBuilderPitfalls {

    // Pitfall 1: Forgetting to handle null
    public String joinStrings(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s); // NullPointerException if s is null!
        }
        return sb.toString();
    }

    // Fix: Null-safe append
    public String joinStringsSafe(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s != null ? s : ""); // Or append("null")
        }
        return sb.toString();
    }

    // Pitfall 2: Incorrect capacity calculation
    public String buildLargeText(List<String> items) {
        StringBuilder sb = new StringBuilder(items.size()); // Wrong! Size != capacity needed
        items.forEach(sb::append);
        return sb.toString();
    }

    // Fix: Proper capacity estimation
    public String buildLargeTextFixed(List<String> items) {
        int estimatedCapacity = items.stream()
                .mapToInt(String::length)
                .sum();
        StringBuilder sb = new StringBuilder(estimatedCapacity);
        items.forEach(sb::append);
        return sb.toString();
    }

    // Pitfall 3: Memory leak with large StringBuilder
    private StringBuilder cache = new StringBuilder(10000);

    public String processText(String input) {
        cache.append(input); // Never cleared - grows indefinitely!
        return cache.toString();
    }

    // Fix: Clear after use or use local StringBuilder
    public String processTextFixed(String input) {
        StringBuilder local = new StringBuilder(input.length() + 100);
        local.append(input);
        return local.toString(); // Automatically eligible for GC
    }
}

