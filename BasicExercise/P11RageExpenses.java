package BasicExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoss = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = countLoss / 2;
        int countMouses = countLoss / 3;
        int countKeybords = countLoss / 6;
        int countDisplay = countLoss / 12;

        double finalSum = countHeadset * priceHeadset + countMouses * priceMouse + countKeybords * priceKeyboard + countDisplay * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", finalSum);



    }
}
