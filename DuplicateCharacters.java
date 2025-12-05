package skill_enhancment;
import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
