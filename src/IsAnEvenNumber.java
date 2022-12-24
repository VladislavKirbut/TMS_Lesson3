import java.util.Scanner;

public class IsAnEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random number: ");
        int number = scan.nextInt();
        if(number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number isn't even.");
        }
    }
}
