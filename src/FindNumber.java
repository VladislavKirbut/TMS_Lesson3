import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100: ");
        int number = scan.nextInt();
        for(int i = number; ; i++) {
            if(i % 5 == 0 && i > number) {
                System.out.println(i);
                break;
            }
        }
    }
}
