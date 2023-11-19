import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double taxPercentage = 0.15; // 15% tax rate
        double taxAmount = amount * taxPercentage;
        double totalAmount = amount + taxAmount;

        System.out.println("The Original amount: $" + amount);
        System.out.println("Tax (14%): R" + taxAmount);
        System.out.println("Total amount after tax: $" + totalAmount);

        scanner.close();
    }
}