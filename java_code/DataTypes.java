package java_code;
public class DataTypes {

    public static void main(String[] args) {

        // ------------------- Primitive Data Types -------------------

        // 1. byte (1 byte)
        byte b = 100;

        // 2. short (2 bytes)
        short s = 30000;

        // 3. int (4 bytes)
        int i = 123456;

        // 4. long (8 bytes)
        long l = 9876543210L;

        // 5. float (4 bytes)
        float f = 12.34f;

        // 6. double (8 bytes)
        double d = 123.456789;

        // 7. char (2 bytes)
        char c = 'A';

        // 8. boolean (1 bit)
        boolean isJavaEasy = true;

        // ------------------- Non-Primitive Data Types -------------------

        // String
        String name = "Java Programming";

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};

        // Wrapper Classes
        Integer intObj = 50;
        Double doubleObj = 99.99;

        // ------------------- Output -------------------

        System.out.println("------ Primitive Data Types ------");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaEasy);

        System.out.println("\n------ Non-Primitive Data Types ------");
        System.out.println("String: " + name);

        System.out.print("Array (int[]): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nInteger Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
    }
}

    

