package ArrayList; // <-- avoid naming the package ArrayList

import java.util.*;

public class Challange1_MySlotuin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int operation = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        List<String> items = new ArrayList<>();

        while (operation != 0) {
            System.out.println((operation==1?"add":"remove")+" your items in a comma delimited list: ");
            String line = scanner.nextLine();

            // Normalize tokens: trim and drop empties
            List<String> input = new ArrayList<>();
            for (String token : line.split(",")) {
                String t = token.trim();
                if (!t.isEmpty()) input.add(t);
            }

            if (operation == 1) {            // ADD unique
                for (String item : input) {
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                }
            } else if (operation == 2) {     // REMOVE
                items.removeAll(input);
            } else {
                System.out.println("Unknown option: " + operation);
            }

            printMenu();
            operation = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
        }

        if (items.isEmpty()) {
            System.out.println("the list is empty");
        } else {
            items.sort(Comparator.naturalOrder());
            System.out.println(items);
        }
        scanner.close();
    }

    private static void printMenu() {
        String textBlock = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:
                """;
        System.out.print(textBlock + " ");
    }
}
