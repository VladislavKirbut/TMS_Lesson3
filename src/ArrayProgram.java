import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int index = scan.nextInt();
        double [] array;
        if(index >= 0) {
            array = new double[index];
            for(int i = 0; i < array.length; i++) {
                array[i] = Math.random() * 100;
            }
            for(double i: array) {
                System.out.println(i);
            }
        } else {
            System.out.println("Enter positive number!");
        }
    }
}
