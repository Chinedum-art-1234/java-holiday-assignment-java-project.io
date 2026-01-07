import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        // System.out.print("Enter third number: ");
        // double thirdNumber = input.nextDouble();

        System.out.println("Choose an operation: +, -, *, /: ");
        char operator = input.next().charAt(0);


        if (operator == '+') {
            double answer = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
        }

        else if (operator == '-') {
            double answer = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
        }

        else if (operator == '*') {
            double answer = firstNumber * secondNumber;
            System.out.println(firstNumber + " x " + secondNumber + " = " + answer);
        }

        else if (operator == '/') {
            double answer = firstNumber / secondNumber;

            if (secondNumber == 0) {
                System.out.println("You cannot divide by Zero...");
                System.out.print("Rerun the code to Try Again");
            }

            else {
                System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
            }

        }

        else {
            System.out.println("Invalid Operator...");
            System.out.print("Rerun the code to Try Again");
        }


        input.close();
    }
}
