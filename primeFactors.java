import java.util.Scanner;
public class primeFactors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        for (int i=2; i<n; i++) {
            while (n%i == 0) {
                System.out.println(i + " ");
                n = n/i;
            }
        }
        if (n>2) {
            System.out.println(n);
        }
    }
}

