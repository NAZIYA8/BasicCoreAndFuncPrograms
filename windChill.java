import java.util.Scanner;
public class windChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Farenheit");
        double t = scan.nextDouble();
        System.out.println("Enter the Wind Speed in miles per hour");
        double v = scan.nextDouble();

        if (t>50 || v>120 || v<3){
            System.out.println("Invalid input");
        }
        else{
            double windChill = 35.74 + (0.6215*t) + (((0.4275*t) - 35.75) * Math.pow(v,0.16));
            System.out.println(windChill);
        }
    }
}
