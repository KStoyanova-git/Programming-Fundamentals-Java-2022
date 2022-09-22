package BasicExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username - вход
        //pasword -наобратно
        //въвеждане на парола

        String username = scanner.nextLine();
        String password = "";
        //всяка позиция от последната (length) към първата(0)

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSimbol = username.charAt(position);
            password += currentSimbol;
        }
        //знаем паролата
        String enteredPassword = scanner.nextLine();
        int countFailed = 0;
        //не знаем колко пъти ще се повтаря
        while (!enteredPassword.equals(password)) {
// грешно въведена парола

            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();

        }
        //вярна парола
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
