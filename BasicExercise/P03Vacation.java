package BasicExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayWeek = scanner.nextLine();
        double price = 0;
        double discount = 0;

        switch (typeGroup) {
            case "Students":
                if (group >= 30) {
                    discount = 15;
                }
                if (dayWeek.equals("Friday")) {
                    price = 8.45;
                } else if (dayWeek.equals("Saturday")) {
                    price = 9.80;
                }else if (dayWeek.equals("Sunday")) {
                    price = 10.46;
                }
                break;
            case "Business":
                if (group >= 100 ) {
                    group = group - 10;
                }
                if (dayWeek.equals("Friday")) {
                    price = 10.90;
                } else if (dayWeek.equals("Saturday")) {
                    price = 15.60;
                }else if (dayWeek.equals("Sunday")) {
                    price = 16;
                }
                break;
            case "Regular":
                if (group >= 10 && group <= 20) {
                    discount = 5;
                }
                if (dayWeek.equals("Friday")) {
                    price = 15;
                } else if (dayWeek.equals("Saturday")) {
                    price = 20;
                }else if (dayWeek.equals("Sunday")) {
                    price = 22.50;
                }
                break;
        }
        double result = group * price - (group * price) * discount / 100;
        System.out.printf("Total price: %.2f", result);




    }
}
