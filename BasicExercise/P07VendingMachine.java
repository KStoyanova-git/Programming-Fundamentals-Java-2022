package BasicExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        double sum = 0;

        while (!input1.equals("Start")) {

            double coins = Double.parseDouble(input1);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum = sum + coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input1 = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        double price = 0;
        while (!input2.equals("End")) {
            switch (input2) {
                case "Nuts":
                    price = 2.0;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", input2);
                        sum = sum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", input2);
                        sum = sum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", input2);
                        sum = sum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", input2);
                        sum = sum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", input2);
                        sum = sum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input2 = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", sum);
    }
}