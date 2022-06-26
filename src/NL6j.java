import java.util.Scanner;

public class NL6j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int leftSide = 1; leftSide <= row; leftSide++) {
                if (leftSide == num) {
                    break;
                }
                System.out.print(leftSide);
            }

            for (int spaces = 0; spaces < ((num * 2) - 1) - row * 2; spaces++) {
                System.out.print(" ");
            }
            for (int rightSide = row; rightSide > 0; rightSide--) {
                System.out.print(rightSide);
            }
            System.out.println();
        }
    }
}
