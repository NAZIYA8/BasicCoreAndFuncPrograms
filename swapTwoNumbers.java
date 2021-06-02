import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("The numbers before swapping are " + num1 + " " + num2);

    int temp;
    temp = num1;
    num1=num2;
    num2= temp;

        System.out.println("The numbers after swapping are " + num1 + " " + num2);

    }
}
