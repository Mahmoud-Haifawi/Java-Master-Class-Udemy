package oop.stringsManipulation.StringBulider;

import java.util.Arrays;


public class StringBuilderExamples {
    public static void main(String[] args) {
        String string1 = "hello" + "world";
        System.out.println(string1);

        // From Lecture: String concat (creates NEW object)
        String helloWorld = "Hello World";
        helloWorld.concat(" and Goodbye");  // MISTAKE: didn't assign result!
        System.out.println(helloWorld);     // Still "Hello World"

        // From Lecture: StringBuilder append (modifies SAME object)
        StringBuilder helloWorldBuilder = new StringBuilder("Hello World");
        helloWorldBuilder.append(" and Goodbye");  // No assignment needed!
        System.out.println(helloWorldBuilder);     // "Hello World and Goodbye"


        // From Lecture: Default capacity demonstration
        StringBuilder emptyStart = new StringBuilder();        // capacity = 16
        StringBuilder emptyStart32 = new StringBuilder(32);    // capacity = 32

        // From Lecture: Capacity growth
        emptyStart.append("a".repeat(17));    // Exceeds capacity 16
        // Result: capacity becomes 34 (JVM determines growth)

        emptyStart32.append("a".repeat(17));  // Still within capacity 32
        // Result: capacity remains 32


        StringBuilder builderPlus = new StringBuilder("Hello World and Goodbye");

        // From Lecture: Method chaining
        builderPlus.deleteCharAt(16)           // Remove 'G'
                .insert(16, "g");            // Insert 'g' at same position

        // From Lecture: replace() method (different from String!)
        builderPlus.replace(16, 17, "G");      // Replace chars from index 16-17 with "G"

        // From Lecture: reverse() and setLength()
        builderPlus.reverse()                  // Reverse all characters
                .setLength(7);               // Truncate to 7 characters

        // All StringBuilder constructors with typical use cases
        StringBuilder sb1 = new StringBuilder();                    // Default: capacity 16
        StringBuilder sb2 = new StringBuilder(100);                 // Performance: pre-size for known content
        StringBuilder sb3 = new StringBuilder("Initial");           // Initialize with content
        StringBuilder anotherStringBuilder = new StringBuilder("StringBuilder");
        StringBuilder sb4 = new StringBuilder(anotherStringBuilder); // Copy constructor

        char[] charSequence = {'1', '2'};
        StringBuilder sb5 = new StringBuilder(new String(charSequence));// From any CharSequence
        System.out.println(sb5); // Output: 12

        char[] charSequence2 = {'1', '2'};
        StringBuilder sb6 = new StringBuilder(Arrays.toString(charSequence2));// From any CharSequence
        System.out.println(sb6); // Output: [1, 2]
        // Missing from lecture: What happens with null?
        //  StringBuilder sb7 = new StringBuilder(null); // Throws NullPointerException!


        StringBuilder sb8 = new StringBuilder();
        sb8.append("mahmoud");
        sb8.codePointAt(1);
        System.out.println(sb8.codePointAt(1));

        // Missing from lecture: All StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello World");

        // Capacity management
        sb.capacity();           // Current capacity
        sb.ensureCapacity(50);   // Ensure minimum capacity
        sb.trimToSize();         // Reduce capacity to current length

        // Character access and modification
        sb.charAt(0);            // Get character at index
        sb.setCharAt(0, 'h');    // Set character at index
        sb.codePointAt(0);       // Unicode code point

        // Search operations
        sb.indexOf("World");     // Find substring
        sb.lastIndexOf("l");     // Find last occurrence
        sb.substring(0, 5);      // Extract substring (returns String!)

        // Comparison (missing from String)
        // StringBuilder has NO equals() method that compares content!
        // sb1.equals(sb2) compares REFERENCES, not content!


        StringBuilder sb9 = new StringBuilder("Hello");
        StringBuilder sb10 = new StringBuilder("Hello");
        System.out.println(sb9.equals(sb10));           // ?
        System.out.println(sb9.toString().equals(sb10.toString())); // ?


    }
}
