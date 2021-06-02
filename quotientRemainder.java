
import java.util.Scanner;

public class quotientRemainder {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number (Dividend)");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number (Divisor)");
        int num2 = scan.nextInt();
        int quotient = num1/num2;
        int remainder = num1%num2;

        System.out.println("the Quotient of " +num1+ " and " +num2+ " is = " +quotient);
        System.out.println("the Remainder of " +num1+ " and " +num2+ " is = " +remainder);
    }
}
