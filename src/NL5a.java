import java.util.Scanner;

public class NL5a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean needLeftSpaces = false;
        boolean needRightSpaces = false;

        for (int row = 0; row < num; row++) {

            for (int col = 0; col < num - row; col++) {
                if (col == row) {
                    needLeftSpaces = false;
                }
                if (col == num - row) {
                    needRightSpaces = true;
                }
                if (needLeftSpaces && col < row || needRightSpaces && col < num - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            needLeftSpaces = true;
            needRightSpaces = false;
            System.out.println();
        }
    }
}
