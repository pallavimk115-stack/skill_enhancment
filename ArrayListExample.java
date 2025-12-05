package skill_enhancment;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Removing an element
        names.remove("Bob");

        // Iterating and displaying elements
        System.out.println("ArrayList Elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

