import java.util.Scanner;

public class NL6l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //work only with max input 10
        for (int row = 1; row <= num; row++) {
            int currentDigit = row - 1;


            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int leftSide = 0; leftSide < row; leftSide++) {
                currentDigit++;
                if (currentDigit == 10 && leftSide + 1 != row) {
                    currentDigit = 0;
                }
                System.out.print(currentDigit);

            }

            for (int rightSide = 1; rightSide < row; rightSide++) {
                currentDigit--;
                System.out.print(currentDigit);
                if (currentDigit == 0) {
                    currentDigit = 10;
                }
            }
            System.out.println();
        }
    }
}
