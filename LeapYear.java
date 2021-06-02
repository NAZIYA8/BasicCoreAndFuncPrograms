
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year in yyyy format");
        int year = scan.nextInt();
        int answer = year % 4;

        if (answer == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
