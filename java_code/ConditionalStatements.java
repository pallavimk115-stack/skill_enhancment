package java_code;
public class ConditionalStatements {
    public static void main(String[] args) {

        int num = 15;

        // if
        if (num > 10) {
            System.out.println("Greater than 10");
        }

        // if-else
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if-else-if ladder
        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }

        // nested if
        if (num > 0) {
            if (num < 20) {
                System.out.println("Between 1 and 19");
            }
        }

        // switch
        switch (num) {
            case 10: System.out.println("Ten"); break;
            case 15: System.out.println("Fifteen"); break;
            default: System.out.println("Other number");
        }

        // ternary
        String type = (num > 10) ? "Large" : "Small";
        System.out.println(type);
    }
}
