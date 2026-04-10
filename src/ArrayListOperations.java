import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Requirement: The main class must be named ArrayListOperations
public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Read the number of items
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Step 2: Read the N space-separated items
            String[] items = scanner.nextLine().split(" ");
            ArrayList<String> list = new ArrayList<>();

            // Add items to the list up to N
            for (int i = 0; i < n && i < items.length; i++) {
                list.add(items[i]);
            }

            // Step 3: Sort the items alphabetically
            Collections.sort(list);

            // Step 4: Read the item to search for
            String searchItem = scanner.nextLine();

            // Step 5: Print the final sorted list
            System.out.println("Sorted Items: " + list);

            // Step 6: Print the search result
            // Use println to ensure the output matches the expected line-by-line format
            if (list.contains(searchItem)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        scanner.close();
    }
}

    
