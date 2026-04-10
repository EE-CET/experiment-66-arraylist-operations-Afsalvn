import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if there is an integer input for N
        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        ArrayList<String> shoppingCart = new ArrayList<>();

        // 1. Add items to the list
        // Reading N space-separated strings
        for (int i = 0; i < n; i++) {
            shoppingCart.add(scanner.next());
        }

        // Reading the item to search for
        String searchItem = scanner.next();

        // 2. Sort the items alphabetically
        Collections.sort(shoppingCart);

        // 4. Print the final sorted list
        // ArrayList.toString() matches the required [Item1, Item2, ...] format
        System.out.println("Sorted Items: " + shoppingCart);

        // 3. Check if specific item exists and print search result
        if (shoppingCart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
    
