import java.util.Scanner;

public class NL6h {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int spaces = 0; spaces < num - row; spaces++) {
                System.out.print(" ");
            }

            for (int leftSide = 1; leftSide < row + 1; leftSide++) {
                System.out.print(leftSide);
            }

            for (int rightSide = 1; rightSide < row; rightSide++) {
                System.out.print(rightSide);

            }
            System.out.println();
        }
    }
}
