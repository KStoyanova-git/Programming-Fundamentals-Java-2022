package BasicExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= n ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double priceOrder = pricePerCapsule * capsulesCount * daysInMonth;
            sum = sum + priceOrder;

            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);
        }
        System.out.printf("Total: $%.2f", sum);

    }
}
