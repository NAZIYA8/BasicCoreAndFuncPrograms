import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int number = scan.nextInt();
        if (number%2 == 0){
            System.out.println("Input number is EVEN");
        }
        else{
            System.out.println("Input number is ODD");
        }
    }
}
