package skill_enhancment;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);  // Adding at the beginning
        numbers.addLast(40);  // Adding at the end

        // Removing an element
        numbers.remove(Integer.valueOf(20));

        // Iterating using for-each loop
        System.out.println("LinkedList Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
