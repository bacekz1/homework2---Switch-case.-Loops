import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int currentDigit = 1;
        int multiplier = 1;

        for (int i = 0; i < num1 * num2; i++) {
            System.out.print(currentDigit + "*" + multiplier + "=" + currentDigit * multiplier);
            multiplier++;
            if (num1 == multiplier - 1) {
                currentDigit++;
                multiplier = 1;
            }
            System.out.println();
        }

    }
}
