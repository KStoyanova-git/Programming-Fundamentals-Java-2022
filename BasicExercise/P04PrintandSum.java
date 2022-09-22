package BasicExercise;

import java.util.Scanner;

public class P04PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fistNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = fistNum; i <=secondNum ; i++) {
            System.out.print(i+ " " );
            sum += i;

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
