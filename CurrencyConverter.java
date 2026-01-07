import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Exchange Rates
        double usdRate = 0.00069;  // 1 NGN → USD
        double eurRate = 0.00060;  // 1 NGN → EUR

        System.out.println("1. NGN to USD");
        System.out.println("2. NGN to EUR");
        System.out.println("3. USD to NGN");
        System.out.println("4. EUR to NGN");
        System.out.print("Enter an option; 1, 2, 3, or 4: ");
        int choice = input.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter amount: ");
            double amount = input.nextDouble();
        

            if (choice == 1) {
                double converted = amount * usdRate;
                System.out.println(amount + " NGN" + " = " + converted + " USD");
            }

            else if (choice == 2) {
                double converted = amount * eurRate;
                System.out.println(amount + " NGN" + " = " + converted + " EUR");
            }

            else if (choice == 3) {
                double converted = amount / usdRate;
                System.out.println(amount + " USD" + " = " + converted + " NGN");
            }

            else if (choice == 4) {
                double converted = amount / usdRate;
                System.out.println(amount + " EUR" + " = " + converted + " NGN");
            }
        }

        
        else {
            System.out.println("Invalid Value...");
            System.out.println("Your choices are 1, 2, 3, or 4 only...");
        }


        input.close();
    }
}