package Day1;

import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, crust, choice;
        double total = 0;

        // Display the menu
        System.out.println("Welcome to Pizza Shop!\n");
        System.out.println("Select your pizza size:");
        System.out.println("1. Small - Rs.99.00");
        System.out.println("2. Medium - Rs.199.00");
        System.out.println("3. Large - Rs.299.00");
        System.out.print("Enter your choice (1-3): ");
        size = input.nextInt();

        // Add the base price to the total
        switch (size) {
            case 1:
                total += 99.0;
                break;
            case 2:
                total += 199.0;
                break;
            case 3:
                total += 299.0;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nSelect your crust:");
        System.out.println("1. Thin crust - Rs.30");
        System.out.println("2. Thick crust - Rs.50");
        System.out.println("3. Stuffed crust - Rs.70");
        System.out.print("Enter your choice (1-3): ");
        crust = input.nextInt();

        // Add the crust price to the total
        switch (crust) {
            case 1:
                total += 30;
                break;
            case 2:
                total += 50;
                break;
            case 3:
                total += 70;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nSelect your toppings (enter 0 to finish):");
        System.out.println("1. Cheese - Rs.50.00");
        System.out.println("2. Pepperoni - Rs.30");
        System.out.println("3. Mushroom - Rs.60");
        System.out.println("4. Olive - Rs.50");
        System.out.println("5. Onion - Rs.30");

        // Loop to allow the user to select multiple toppings
        while (true) {
            System.out.print("Enter your choice (1-5): ");
            choice = input.nextInt();

            // Stop the loop if the user enters 0
            if (choice == 0) {
                break;
            }

            // Add the topping price to the total
            switch (choice) {
                case 1:
                    total += 50;
                    break;
                case 2:
                    total += 30;
                    break;
                case 3:
                    total += 60;
                    break;
                case 4:
                    total += 50;
                    break;
                case 5:
                    total += 30;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        // Display the total amount
        System.out.println("\nYour total is Rs." + total);
    }
}

