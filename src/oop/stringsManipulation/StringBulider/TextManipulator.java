package oop.stringsManipulation.StringBulider;

import java.util.Map;

public class TextManipulator {
    // Scenario: Complex document processing
    public String processDocument(String document) {
        StringBuilder sb = new StringBuilder(document);

        // Chain complex operations
        return sb.reverse()                    // Reverse entire document
                .delete(0, 10)                // Remove first 10 chars
                .insert(0, "PROCESSED: ")     // Add header
                .replace(sb.length()-5, sb.length(), "END") // Replace last 5 chars
                .toString();
    }

    // Advanced: Conditional text building
    public String buildConditionalText(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder(200);

        data.entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .forEach(entry -> {
                    sb.append(entry.getKey())
                            .append(": ")
                            .append(entry.getValue())
                            .append(System.lineSeparator());
                });

        return sb.length() > 0 ? sb.toString() : "No data available";
    }
}

