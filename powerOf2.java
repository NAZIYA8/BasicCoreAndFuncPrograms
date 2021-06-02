import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n between 0 to 31");
        int n = scan.nextInt();
        if (n < 0 && n > 31) {
            System.out.println("Enter a valid number");
        } else {
            printTable(n);
        }
    }
        private static void printTable(int n){
        for (int i=0; i<=n ; i++) {
            int ans =(int) Math.pow(2,i);
            System.out.println("2 to the power "+i+ " is = " +ans);
        }
    }
}
