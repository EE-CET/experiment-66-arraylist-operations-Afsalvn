import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        // Step 1: Read from numbers.txt and separate into even.txt and odd.txt
        // Hint: Use Scanner to read from the file and PrintWriter to write to files.
        try (Scanner sc = new Scanner(new File("numbers.txt"));
             PrintWriter evenWriter = new PrintWriter("even.txt");
             PrintWriter oddWriter = new PrintWriter("odd.txt")) {
            
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
        System.out.print("Even File: ");
        try (Scanner scEven = new Scanner(new File("even.txt"))) {
            while (scEven.hasNext()) {
                System.out.print(scEven.next() + " ");
            }
        } catch (FileNotFoundException e) {
            // Ignore if file doesn't exist (e.g., no even numbers)
        }
        System.out.println();

        // Step 3: Read and display odd.txt
        System.out.print("Odd File: ");
        try (Scanner scOdd = new Scanner(new File("odd.txt"))) {
            while (scOdd.hasNext()) {
                System.out.print(scOdd.next() + " ");
            }
        } catch (FileNotFoundException e) {
            // Ignore if file doesn't exist
        }
        System.out.println();
    }
}
