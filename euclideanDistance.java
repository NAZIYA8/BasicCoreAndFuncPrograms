import java.util.Scanner;

public class euclideanDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of point x");
        double x = scan.nextInt();
        System.out.println("Enter the value of point y");
        double y = scan.nextInt();

        double euclDistance = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        System.out.println("Euclidean distance is " + euclDistance);
    }
}