package practice;
import java.util.Scanner;

	public class BillingSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numberOfItems;
	        double totalBill = 0;

	        System.out.println("===== Simple Billing System =====");
	        System.out.print("Enter number of items: ");
	        numberOfItems = scanner.nextInt();

	        // Arrays to store item details
	        String[] itemNames = new String[numberOfItems];
	        int[] quantities = new int[numberOfItems];
	        double[] prices = new double[numberOfItems];

	        // Get item details from user
	        for (int i = 0; i < numberOfItems; i++) {
	            System.out.println("\nItem " + (i + 1) + ":");
	            System.out.print("Enter item name: ");
	            itemNames[i] = scanner.next();

	            System.out.print("Enter quantity: ");
	            quantities[i] = scanner.nextInt();

	            System.out.print("Enter price per item: ");
	            prices[i] = scanner.nextDouble();

	            totalBill += quantities[i] * prices[i];
	        }

	        // Print the bill
	        System.out.println("\n===== Bill Summary =====");
	        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");
	        for (int i = 0; i < numberOfItems; i++) {
	            double itemTotal = quantities[i] * prices[i];
	            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemNames[i], quantities[i], prices[i], itemTotal);
	        }

	        System.out.println("----------------------------------");
	        System.out.printf("Total Bill: %.2f\n", totalBill);
	        System.out.println("Thank you for shopping!");

	        scanner.close();
	    }
	}



