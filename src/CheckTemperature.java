import java.util.Scanner;

public class CheckTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature (t): ");
        int temperature = scan.nextInt();
        if(temperature > -5) {
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Normal");
        } else if (temperature <= -20) {
            System.out.println("Cold");
        }
    }
}
