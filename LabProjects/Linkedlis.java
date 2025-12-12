import java.util.*;

public class Linkedlis {
    public static void main(String[] args) {
        // Declare a LinkedList
        LinkedList<String> a = new LinkedList<>();

        // Add elements
        a.add("Apple");
        a.add("Banana");
        a.add("Cherry");

        // Display the list
        System.out.println("LinkedList: " + a);

        // Remove an element
        a.remove("Banana");
        System.out.println("After removing Banana: " + a);

        // Get an element by index
        String firstElement = a.get(0);
        System.out.println("First element: " + firstElement);

        // Check if an element exists
        if (a.contains("Cherry")) {
            System.out.println("Cherry is in the list!");
        }

        // Size of the list
        System.out.println("Size of LinkedList: " + a.size());
    }
}
