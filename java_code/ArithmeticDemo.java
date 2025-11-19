package java_code;
public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        
        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        
        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference); 
        
        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);
        
        
        int quotient = num1 / num2;
        System.out.println("Quotient (int): " + quotient); 

        // Division with floating-point numbers to get a decimal result
        double quotientDouble = (double) num1 / num2;
        System.out.println("Quotient (double): " + quotientDouble); // Output: Quotient (double): 2.0
        
        // Modulus (Remainder)
        int remainder = num1 % 3; // 20 divided by 3 has a remainder of 2
        System.out.println("Remainder: " + remainder); // Output: Remainder: 2
        
        // Increment
        num1++; // num1 becomes 21
        System.out.println("Incremented num1: " + num1); // Output: Incremented num1: 21
        
        // Decrement
        num2--; // num2 becomes 9
        System.out.println("Decremented num2: " + num2); // Output: Decremented num2: 9
    }
}
