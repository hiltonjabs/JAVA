import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double taxPercentage = 0.14; // 14% tax rate
        double taxAmount = amount * taxPercentage;
        double totalAmount = amount + taxAmount;

        System.out.println("Original amount: $" + amount);
        System.out.println("Tax (14%): $" + taxAmount);
        System.out.println("Total amount after tax: $" + totalAmount);

        scanner.close();
    }
}