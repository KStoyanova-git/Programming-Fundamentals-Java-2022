package BasicExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totalLightsabers = (students + Math.ceil(students* 1.0 * 10/ 100)) * priceLightsabers;
        int freeBelts = students / 6;
        double totalPrice = totalLightsabers + students * priceRobes + (students - freeBelts) * priceBelt;

        if (amount >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice-amount);
        }
    }
}
