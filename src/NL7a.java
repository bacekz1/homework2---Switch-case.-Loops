import java.util.Scanner;

public class NL7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {
            int temp = row - 2;

            for (int spaces = num; spaces > row; spaces--) {
                System.out.print("    ");
            }

            for (int leftSide = 0; leftSide < row; leftSide++) {
                int print = ((int) Math.pow(2, leftSide));

                if (print > 100) {
                    System.out.print(print + " ");
                } else if (print > 10) {
                    System.out.print(print + "  ");
                } else {
                    System.out.print(print + "   ");
                }

            }

            for (int rightSide = row; rightSide > 1 ; rightSide--) {
                int print = ((int) Math.pow(2, temp));

                if (print > 100) {
                    System.out.print(print + " ");
                } else if (print > 10) {
                    System.out.print(print + "  ");
                } else {
                    System.out.print(print + "   ");
                }

                temp--;

            }
            System.out.println();
        }
    }
}
