import java.util.Scanner;

public class NL6i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int spaces = 0; spaces < row - 1; spaces++) {
                System.out.print(" ");
            }

            for (int leftSide = 1; leftSide <= num - (row - 1); leftSide++) {
                System.out.print(leftSide);
            }

            for (int rightSide = num - row; rightSide > 0; rightSide--) {
                System.out.print(rightSide);
            }

            System.out.println();
        }
    }
}
