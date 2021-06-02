import java.util.Scanner;
import java.util.Arrays;
public class twoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = scan.nextInt();
        System.out.println("enter the number of columns");
        int column = scan.nextInt();
        int[][] data = new int[row][column];

        System.out.println("Please enter array elements row by row");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = scan.nextInt();
                data[i][j] = value;
            }
        }
        System.out.println("The 2D array input from user is : ");
        System.out.println(Arrays.deepToString(data));
        scan.close();
    }
}
