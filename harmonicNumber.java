import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        double n ,i;
        double sum=0;
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        n = scan.nextDouble();

        for ( i=1;i<=n;i++){
            sum =sum + (1/i);
        }
        System.out.println("the nth Harmonic value is " +sum);
    }
}
