import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
        } else {
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Negative numbers are not allowed.");
            } 
            else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("BuzzThrills");
            } 
            else if (num % 3 == 0) {
                System.out.println("Buzz");
            } 
            else if (num % 5 == 0) {
                System.out.println("Thrills");
            } 
            else {
                System.out.println("Not divisible by 3 nor 5");
            }
        }

        scanner.close();
    }
}
