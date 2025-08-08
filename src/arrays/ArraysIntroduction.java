package arrays;

import java.util.Arrays;

public class ArraysIntroduction {
    public static void main(String[] args) {

        //exmaple 1
        int[] array1 = new int[10];
        array1 = new int[]{1, 2, 3};
        //exmaple 2 --> Anonymous array initializer
        int[] array2 = {1, 2, 3};
        //exmaple 3 -->
        int[] array3 = new int[]{1, 2, 3};

// From Lecture: Accessing array length
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = firstTen.length; // Returns 10
        System.out.println("Length: " + arrayLength);

        // From Lecture: This causes ArrayIndexOutOfBoundsException
        //     int last = firstTen[arrayLength];  // ❌ Index 10 is out of bounds!

// Correct way to get last element
        int last = firstTen[arrayLength - 1];  // ✅ Index 9 is valid


// From Lecture: Looping through array elements
        int[] newArray = {5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        // Enhanced for loop (for-each)
        for (int number : newArray) {
            System.out.println(number);
        }

        int [] array = new int[10];

        for (int number : array) {
            System.out.print(number);
        }


        //this will fail , bc the defult value for the wrapping class is null , and when we loop on a null value a NPE will be throwin
        Integer [] array5 = new Integer[10];
        for (int number : array5) {
            System.out.print(number);
        }


        System.out.println(Arrays.toString(newArray)); // [5, 4, 3, 2, 1]
// From Lecture: Object array holding different types
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";                    // String
        objectArray[1] = new StringBuilder("World"); // StringBuilder
        objectArray[2] = newArray;                   // int[] array (nested array)

    }
}
