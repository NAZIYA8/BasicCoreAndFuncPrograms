import java.util.Scanner;
public class largestOfThreeNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scan.nextDouble();
        System.out.println("Enter the third number");
        double num3 = scan.nextDouble();
        if ( num1>=num2 && num1>=num3){
            System.out.println("The Largest number is " +num1);
        }
        else if (num2>=num1 && num2>=num3){
            System.out.println("The largest number is " +num2);
        }
        else {
            System.out.println("The largest number is " +num3);
        }

    }
}
