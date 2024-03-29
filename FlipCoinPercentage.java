 import java.util.Scanner;

public class FlipCoinPercentage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many times you want to flip a coin");
        int flipCount = scan.nextInt();
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < flipCount; i++) {
            double random = Math.random();
            if (random > 0.5) {
                headCount++;
            } else {
                tailCount++;
            }
        }
            System.out.println("HeadCount is "+ headCount + "% = "+ calculatePercentage(flipCount,headCount));
            System.out.println("TailCount is "+ tailCount + "% = " + calculatePercentage(flipCount,tailCount));
    }
            private static double calculatePercentage(int flipCount, int count){
                return (double)  count / flipCount * 100;
            }
}

