impoimport java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] items = sc.nextLine().trim().split(" ");
        String search = sc.nextLine().trim();

        ArrayList<String> cart = new ArrayList<>(Arrays.asList(items));
        Collections.sort(cart);

        System.out.println("Sorted Items: " + cart);
        System.out.println(cart.contains(search) ? "Found" : "Not Found");
    }
}
