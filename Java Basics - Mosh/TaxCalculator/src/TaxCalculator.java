import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double taxPercentage = 0.14; // 15% tax rate
        double taxAmount = amount * taxPercentage;
        double totalAmount = amount + taxAmount;

        System.out.println("The Original amount: R" + amount);
        System.out.println("Tax (15%): R" + taxAmount);
        System.out.println("Total amount after tax: R" + totalAmount);

        scanner.close();
    }
}