import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0 && number != 2) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime && number > 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        input.close();
    }
}
