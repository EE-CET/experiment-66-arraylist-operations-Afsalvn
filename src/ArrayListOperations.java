import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Requirement: The class must be named ArrayListOperations
public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of items
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline

            // Read the space-separated items
            String[] items = scanner.nextLine().split(" ");
            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < n && i < items.length; i++) {
                list.add(items[i]);
            }

            // Sort the items alphabetically
            Collections.sort(list);

            // Read the item to search for
            String searchItem = scanner.nextLine();

            // Output the sorted list in the required format
            System.out.println("Sorted Items: " + list);

            // Check if the item exists and print result
            if (list.contains(searchItem)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        scanner.close();
    }
}

    
