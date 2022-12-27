import java.util.Scanner;

public class CheckSumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random positive number: ");
        int number = scan.nextInt();
        int sum = 0;
        if(number >= 1) {
            for(int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Enter integer positive number!");
        }
    }
}
