package oop.stringsManipulation.StringBulider;


//uncomment when reading it


public class BulkStringProcessor {
//    // Scenario: Processing millions of log entries
//    public String processLogs(Stream<LogEntry> logStream) {
//        // Bad approach - multiple resizes
//        StringBuilder sb = new StringBuilder();
//
//        // Better approach - pre-sized
//        long estimatedCount = logStream.count(); // This consumes stream!
//
//        // Best approach - chunked processing
//        return logStream
//                .collect(StringBuilder::new,
//                        (sb, entry) -> sb.append(entry.format()).append("\n"),
//                        StringBuilder::append)
//                .toString();
//    }
//
//    // Advanced: Custom capacity management
//    public String processLogsAdvanced(List<LogEntry> logs) {
//        // Calculate precise capacity needed
//        int totalCapacity = logs.stream()
//                .mapToInt(log -> log.estimateSize())
//                .sum();
//
//        StringBuilder sb = new StringBuilder(totalCapacity + 100); // Small buffer
//        logs.forEach(log -> sb.append(log.format()).append("\n"));
//        return sb.toString();
//    }
}
