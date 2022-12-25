package difficultTask;
import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month count: ");
        int monthCount = scan.nextInt();
        System.out.println("Enter deposit amount: ");
        float depositAmount = scan.nextFloat();

        if(monthCount > 0 && depositAmount >= 0) {
            for(int i = 0; i < monthCount; i++) {
                depositAmount += (depositAmount * 7 / 100);
            }
            System.out.println(depositAmount);
        } else {
            System.out.println("Enter correct month or deposit!");
        }
    }
}
