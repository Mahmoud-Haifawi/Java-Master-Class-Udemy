package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraySortingCoping {

    public static void main (String []args)
    {
        int []array = randomArray(10);
        //random
        System.out.println(Arrays.toString(array));
        //sorting on the orginal  array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // exmaple 2 copying a full  array and do the opreations  on it
        int []array2 = Arrays.copyOf(array,10);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        // exmaple 3 copying a less length than the orginal  array and do the opreations  on it
        int []array3 = Arrays.copyOf(array,2);
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));


        // exmaple 4 copying a more length than the orginal  array and do the opreations  on it
        int []array4 = Arrays.copyOf(array,100);
        Arrays.sort(array4);
        System.out.println(Arrays.toString(array4));

        //When copying object arrays, only references are copied (shallow copy):
        String[] originalStrings = {"Hello", "World", "Java"};
        String[] copiedStrings = Arrays.copyOf(originalStrings, originalStrings.length);

        // Both arrays reference the same String objects
        // But since Strings are immutable, this is usually fine

        // For mutable objects:
        StringBuilder[] builders = {new StringBuilder("Hello")};
        StringBuilder[] copiedBuilders = Arrays.copyOf(builders, builders.length);
        copiedBuilders[0].append(" World");  // Modifies the shared StringBuilder!


        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] range = Arrays.copyOfRange(original, 2, 7);  // Elements 2-6 (exclusive end)
        System.out.println(Arrays.toString(range)); // [3, 4, 5, 6, 7]



        // For object arrays, you can provide custom sorting
        String[] names = {"John", "jane", "Bob", "alice"};
        Arrays.sort(names);  // Default: [Bob, John, alice, jane] (case-sensitive)

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);  // [alice, Bob, jane, John]


        // From Lecture: Binary search example with String array
        String[] sArray = {"Ann", "Bob", "Carol", "David", "Ed"};
        Arrays.sort(sArray);  // CRITICAL: Must sort first
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        // From Lecture: Basic equality test
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


        //Binary Search Insertion Point
        // When binary search doesn't find an element, the negative return value indicates where the element should be inserted:
        int[] sorted = {1, 3, 5, 7, 9};
        int result = Arrays.binarySearch(sorted, 4);  // Returns -3
        // To get insertion point:
        int insertionPoint = -(result + 1);  // insertionPoint = 2
        // Element 4 should be inserted at index 2 to maintain sorted order


    }

    public static int [] randomArray(int length ){
        Random random = new Random();
        int [] array = new int[length];
        for (int i=0;i<length;i++)
            array[i]=random.nextInt(100);
        return array;

    }
}
