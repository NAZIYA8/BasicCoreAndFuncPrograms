import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of a");
        double a = scan.nextDouble();
        System.out.println("enter the value of b");
        double b = scan.nextDouble();
        System.out.println("enter the value of c");
        double c = scan.nextDouble();

        double delta = Math.pow(b,2) - (4*a*c);
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("The root 1 of x is = " +root1);
        System.out.println("The root 2 of x is = " +root2);



    }
}
