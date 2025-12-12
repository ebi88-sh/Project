import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Blue");   // ignored because duplicates not allowed

        System.out.println("HashSet: " + set);

        set.remove("Red");
        System.out.println("After remove: " + set);

        System.out.println("Contains Green? " + set.contains("Green"));
    }
}


