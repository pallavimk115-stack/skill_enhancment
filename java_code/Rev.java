package skill_enhancment;

import java.util.Scanner;
public class Rev {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number\n");
        int number= sc.nextInt();
        System.out.println("The initial number entered is:\n" + number);
        int rev=0;
        while(number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        
        System.out.println("The reversed number is:\n" + rev);
    }
    
}
